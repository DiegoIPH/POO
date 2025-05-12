package com.abc;
import java.util.Scanner;

public class Persona {

    //variables
    private String nombre;
    private String apellido;
    private float altura;
    private int anioNac;
    private int edad;
    private float peso;
    private Scanner leer = new Scanner(System.in);

    //Construnctor no parametrizado
    public Persona() {}

    //Constructor parametrizado
    public Persona(String nombre, String apellido, float altura, int anioNac, float peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.anioNac = anioNac;
        this.peso = peso;
    }

    public Persona(int anioNac, float peso, float altura){
        this.anioNac = anioNac;
        this.peso = peso;
        this.altura = altura;
    }

    //Metodo de instancia
    public float IMC(float peso, float altura) {
        return peso/(altura*altura);
    }

    // Metodos set y get

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int getAnioNac() {
        return anioNac;
    }
    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    //Vainas para imprimir

    public int CalcularEdad(int anioNac){
        return 2025-anioNac;
    }

    public void MostrarDatos() {
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + CalcularEdad(anioNac) + " Peso: " + peso + " Altura: " + altura
        + " IMC: " + IMC(peso,altura));
    }

    public void ImprimirIMC(){
        System.out.println("IMC: " + IMC(peso,altura));
    }

}
