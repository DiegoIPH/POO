package com.abc;

public class Ticket {

    private Pizza pizza;
    private int cantidad;

    public Ticket() {}

    public Ticket(Pizza pizza, int cantidad) {
        this.pizza = pizza;
        this.cantidad = cantidad;
    }

    public Pizza getPizza() {
        return pizza;
    }
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double Total(int cantidad, Pizza pizza) {
        this.cantidad = cantidad;
     return pizza.getPrecioFinal()*cantidad;
    }
    public void ImprimirRecibo(){
        System.out.println("El total a pagar es de: "+Total(cantidad,pizza));
    }
}
