package com.abc;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Estado {
    private String enfermedad;
    private int consultas;
    private Paciente paciente;
    private int idregistro;
    private int buscador;
    Scanner sc = new Scanner(System.in);
    private List<Paciente> pacientes = new ArrayList<>();


    public Estado(){}

    public Estado(String enfermedad, int consultas, Paciente paciente, int idregistro, int buscador) {
        this.enfermedad = enfermedad;
        this.consultas = consultas;
        this.paciente = paciente;
        this.idregistro = idregistro;
        this.buscador = buscador;
        this.pacientes = new ArrayList<>();
    }

    public String getEnfermedad() {
        return enfermedad;
    }
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getConsultas() {
        return consultas;
    }
    public void setConsultas(int consultas) {
        this.consultas = consultas;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public int getIdregistro() {
        return idregistro;
    }
    public void setIdregistro(int idregistro) {
        this.idregistro = idregistro;
    }

    public int getBuscador() {
        return buscador;
    }
    public void setBuscador(int buscador) {
        this.buscador = buscador;
    }
/// /////////////////////////////////
    public void modificarEstado() {
        System.out.print("Enfermedad: ");
        this.enfermedad = sc.nextLine();
        System.out.print("Sesiones pendientes: ");
        this.consultas = sc.nextInt();
    }

    public void mostrarEstado() {
        System.out.println("Enfermedad: " + enfermedad);
        System.out.println("Sesiones pendientes: " + consultas);
        System.out.println("IDregistro: " + idregistro);
        System.out.println("--------------------------------------------------\n");
    }
}
