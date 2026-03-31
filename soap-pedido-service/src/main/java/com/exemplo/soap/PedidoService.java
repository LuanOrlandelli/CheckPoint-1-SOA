package com.exemplo.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface PedidoService {

    @WebMethod
    String criarPedido(int id, String cliente, double valor);

    @WebMethod
    String processarPedido(int id);

    @WebMethod
    String listarPedidos();
}