package com.abc;

public class Pizza {
    private String tamano;
    private String tipo;
    private boolean ingredienteExtra;
    private double precioBase;
    private double precioFinal;

    //Constructor vacio
    public Pizza(){};

    //Constructor con parametros
    public Pizza(String tamano, String tipo, boolean ingredienteExtra, double precioBase, double precioFinal) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.ingredienteExtra = ingredienteExtra;
        this.precioBase = precioBase;
        this.precioFinal = precioFinal;
    }

    //Getter y Setter


    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getIngredienteExtra() {
        return ingredienteExtra;
    }

    public void setIngredienteExtra(boolean ingredienteExtra) {
        this.ingredienteExtra = ingredienteExtra;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    //METODOS//

    public void ImprimirPizza(){
        System.out.println("Tipo: "+ tipo);
        System.out.println("Tamano: "+tamano);
        System.out.println("IngredienteExtra: "+ingredienteExtra);
        System.out.println("PrecioBase: "+precioBase);
        System.out.println("PrecioFinal: "+precioFinal);
    }

    public double calcularPrecioFinal(String tamano, String tipo, boolean ingredienteExtra, double precioBase){
     if(tamano=="personal"){
         precioFinal = precioBase;
     }else if (tamano=="grande") {
            precioFinal = precioBase;
     }else if (tamano=="gigante"){
         precioFinal = precioBase;
     }

     if(tipo=="especialidad"){
         precioFinal += 1.0;
     }

     if(ingredienteExtra == true){
         precioFinal += 0.5;
     }
        return precioFinal;
    }
}
