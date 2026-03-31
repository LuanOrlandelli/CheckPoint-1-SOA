package com.exemplo.soap;

import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.URL;

public class ClienteSOAP {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:8080/pedidos?wsdl");

        QName qname = new QName("http://soap.exemplo.com/", "PedidoServiceImplService");

        Service service = Service.create(url, qname);

        PedidoService pedidoService = service.getPort(PedidoService.class);

        System.out.println(pedidoService.criarPedido(1, "João", 200.0));
        System.out.println(pedidoService.processarPedido(1));
        System.out.println(pedidoService.listarPedidos());
    }
}