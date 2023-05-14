package com.Api.Rest.controller;


import com.Api.Rest.entity.Empresa;
import com.Api.Rest.repository.EmpresaRepository;
import com.Api.Rest.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @Autowired
    EmpresaRepository empresaRepository;

    @GetMapping("/getEmpresa/{id}")
    public Empresa getEmpresa(@PathVariable(value = "id") Long id) {
        return empresaService.getEmpresa(id);
    }

    @PostMapping("/postEmpresa")
    public Empresa guardarEmpresa(@RequestBody Empresa empresa) {
        return empresaService.guardarEmpresa(empresa);
    }

    @PutMapping("/editarEmpresa")
    public Empresa modificarEmpresa(@RequestBody Empresa empresa) {
        return empresaService.modificarEmpresa(empresa);
    }

    @DeleteMapping("/borrarEmpresa/{id}")
    public String borrarEmpresa(@PathVariable("id") Long id) {
        return empresaService.borrarEmpresa(id);
    }


}
