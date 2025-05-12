package com.abc;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import com.abc.*;

public class Main {
    public static void main(String[] args) {
        int menu;
        int buscador;
        Scanner sc = new Scanner(System.in);
        List<Paciente> pacientes = new ArrayList<>();
        List<Estado> registros = new ArrayList<>();
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Ver paciente");
            System.out.println("3. Editar Registro de paciente");
            System.out.println("4. Ver estado del paciente");
            System.out.print("Digite su opcion: ");
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    Paciente p = new Paciente();
                    p.RegistrarPaciente();
                    pacientes.add(p);
                    break;
                case 2:
                    for (Paciente paciente : pacientes) {
                        paciente.MostrarPaciente();
                    }
                    break;
                case 3:
                    System.out.print("Digite el id del paciente a modificar su estado: ");
                    buscador = sc.nextInt();
                    for (Paciente paciente : pacientes) {
                        if (paciente.getId() == buscador) {
                            System.out.print("Va a modificarse el paciente: " + paciente.getNombre() + "\n");
                            Estado e = new Estado();
                            e.setIdregistro(paciente.getId());
                            e.modificarEstado();
                            registros.add(e);
                        }
                    }
                    break;
                case 4:
                    for (Estado estado : registros) {
                        estado.mostrarEstado();
                    }
                    break;
            }
        }while (menu != 5);
    }
}