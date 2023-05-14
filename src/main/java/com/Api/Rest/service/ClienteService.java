package com.Api.Rest.service;

import com.Api.Rest.entity.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente getCliente(Long id);

    List<Cliente> traerClientes();

    Cliente guardarCliente(Cliente cliente);

    Cliente modificarCliente(Cliente cliente);

    String borrarCliente(Long id);

}

