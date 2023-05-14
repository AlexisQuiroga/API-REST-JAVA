package com.Api.Rest.service;

import com.Api.Rest.dto.ProductoDto;
import com.Api.Rest.entity.Producto;

import java.util.List;

public interface ProductoService {

    Producto getProducto(Long id);

//    ProductoDto getProductoDto(Long id);

    List<Producto> traerProductos();

    Producto guardarProducto(Producto producto);

    Producto modificarProducto(Producto producto);

    String borrarProducto(Long id);


}
