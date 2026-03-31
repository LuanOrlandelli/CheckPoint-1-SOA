package com.exemplo.soap;

import jakarta.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService(endpointInterface = "com.exemplo.soap.PedidoService")
public class PedidoServiceImpl implements PedidoService {

    private Map<Integer, Pedido> pedidos = new HashMap<>();

    @Override
    public String criarPedido(int id, String cliente, double valor) {

        if (cliente == null || cliente.isEmpty()) {
            return "Erro: Cliente não pode ser vazio";
        }

        if (valor <= 0) {
            return "Erro: Valor deve ser maior que zero";
        }

        Pedido pedido = new Pedido(id, cliente, valor);
        pedidos.put(id, pedido);

        return "Pedido criado com sucesso";
    }

    @Override
    public String processarPedido(int id) {

        Pedido pedido = pedidos.get(id);

        if (pedido == null) {
            return "Erro: Pedido não encontrado";
        }

        pedido.setStatus("PROCESSADO");

        return "Pedido processado com sucesso";
    }

    @Override
    public String listarPedidos() {
        return pedidos.values().toString();
    }
}