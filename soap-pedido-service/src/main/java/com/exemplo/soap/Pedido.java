package com.exemplo.soap;

import java.io.Serializable;

public class Pedido implements Serializable {

    private int id;
    private String cliente;
    private double valor;
    private String status;

    public Pedido() {}

    public Pedido(int id, String cliente, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.status = "CRIADO";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                ", status='" + status + '\'' +
                '}';
    }
}