package com.Api.Rest.service;

import com.Api.Rest.dto.ProductoDto;
import com.Api.Rest.entity.Producto;
import com.Api.Rest.repository.ProductoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.zip.DataFormatException;


@Service
@Slf4j
public class ProductoServiceImp implements ProductoService {


    @Autowired
    ProductoRepository productoRepository;

    public Producto getProducto(Long id) {

        Producto productoAObtener = productoRepository.findById(id).orElseThrow(RuntimeException::new);
        return productoAObtener;
    }

    public List<Producto> traerProductos() {
        return productoRepository.findAll();

    }

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto modificarProducto(Producto producto) {
        Producto productoModificado = productoRepository.findById(producto.getId()).get();
        productoModificado.setNombre(producto.getNombre());
        return productoRepository.save(producto);
    }

    public String borrarProducto(Long id) {
        Producto producto = productoRepository.findById(id).get();
        productoRepository.deleteById(id);
        return "Borraste el producto: " + producto.getNombre();
    }

    public void restarProductos(List<Producto> productoList) throws DataFormatException {
        for (Producto producto : productoList) {
            if (producto.getCantidadDeStock() == 0) {
                throw new DataFormatException("No queda este producto en Stock: " + producto.getNombre());
            } else {
                producto.setCantidadDeStock(producto.getCantidadDeStock() - 1);

            }
            productoRepository.saveAll(productoList);
        }


//        public ProductoDto getProductoDto(Long id) {
//            Producto productoAObtener = productoRepository.findById(id).orElseThrow(RuntimeException::new);
//            ProductoDto productoDto = new List<ProductoDto>;
//            productoDto.setNombre(productoAObtener.getNombre());
//            productoDto.setDescripcion(productoAObtener.getDescripcion());
//            productoDto.setStock(restarProductos(p);
//        return productoDto;

    }
}





