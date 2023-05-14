package com.Api.Rest.service;

import com.Api.Rest.entity.Empresa;


public interface EmpresaService {


    Empresa getEmpresa(Long id);

    Empresa guardarEmpresa(Empresa empresa);

    Empresa modificarEmpresa(Empresa empresa);

    String borrarEmpresa(Long id);

}

