package com.example;

import java.util.ArrayList;

public class Pedido {

    private int numeroDePedido;
    private ArrayList<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public Pedido(int numeroDePedido){
        this.numeroDePedido = numeroDePedido;
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public int getNumero() {
        return numeroDePedido;
    }

    public void setNumero(int numeroDePedido) {
        this.numeroDePedido = numeroDePedido;
    }

    public void agregarProducto(Producto p) {
        if (p != null) {
            productos.add(p);
        }
    }

    public double calcularTotalPedido() {

        if (productos.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Producto p : productos) {
            total += p.calcularPrecioFinal();
        }

        return total;
    }
}