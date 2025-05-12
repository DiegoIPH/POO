package com.abc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Paciente {
    private String nombre;
    private String apellido;
    private int edad;
    private int id;
    private List<Estado> registros = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Paciente() {}

    public Paciente(String nombre, String apellido, int edad, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
        this.registros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void RegistrarPaciente() {
        System.out.print("Nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("Apellido: ");
        this.apellido = sc.nextLine();
        System.out.print("Edad: ");
        this.edad = sc.nextInt();
        System.out.print("ID: ");
        this.id = sc.nextInt();
    }

    public void MostrarPaciente() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Id: "+id);
        System.out.println("--------------------------------------------------\n");
    }
    public void agregarEstado(Estado estado) {
        this.registros.add(estado);
    }

}
