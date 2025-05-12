package com.abc;
import com.abc.Pizza.*;
import com.abc.Ticket.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        Ticket ticket1 = new Ticket(pizza1,2);
            pizza1.setTipo("un_ingrediente");
            pizza1.setTamano("gigante");
            pizza1.setIngredienteExtra(false);
            pizza1.setPrecioBase(8.99);
            pizza1.setPrecioFinal(0);
            pizza1.calcularPrecioFinal(pizza1.getTamano(), pizza1.getTipo(), pizza1.getIngredienteExtra(), pizza1.getPrecioBase());
                pizza1.ImprimirPizza();
                ticket1.ImprimirRecibo();
        System.out.println("///////////////////////////////////////////////////////////////////////////");
        Pizza pizza2 = new Pizza("personal","un_ingrediente",true,4.99, 0);
        pizza2.calcularPrecioFinal(pizza2.getTamano(), pizza2.getTipo(), pizza2.getIngredienteExtra(), pizza2.getPrecioBase());
        pizza2.ImprimirPizza();
        System.out.println("¿Cuantas pizzas va a comprar? ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        Ticket ticket2 = new Ticket(pizza2,0);
        ticket2.setCantidad(cantidad);
        ticket2.ImprimirRecibo();


    }
}