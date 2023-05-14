package com.Api.Rest.service;

import com.Api.Rest.entity.Empresa;
import com.Api.Rest.repository.EmpresaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmpresaServiceImpl implements EmpresaService{


    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa getEmpresa(Long id) {

        Empresa EmpresaAObtener = empresaRepository.findById(id).orElseThrow(RuntimeException::new);
        return EmpresaAObtener;
    }

    public Empresa guardarEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public Empresa modificarEmpresa(Empresa empresa) {
        Empresa empresaModificada = empresaRepository.findById(empresa.getId()).get();
        empresaModificada.setNombre(empresa.getNombre());
        return empresaRepository.save(empresa);
    }

    public String borrarEmpresa(Long id) {
        Empresa empresa= empresaRepository.findById(id).get();
        empresaRepository.deleteById(id);
        return "borraste a " + empresa.getNombre();
    }


}

