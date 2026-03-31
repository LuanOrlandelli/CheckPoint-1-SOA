package com.exemplo.soap;

import jakarta.xml.ws.Endpoint;

public class Publisher {

    public static void main(String[] args) {

        String url = "http://localhost:8080/pedidos";

        Endpoint.publish(url, new PedidoServiceImpl());

        System.out.println("🚀 Serviço SOAP rodando em: " + url + "?wsdl");
    }
}