import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        Profesor prof = new Profesor("Matematica", "Jacobo",1985,true);
        System.out.println("Nombre: " + prof.getNombre());
        System.out.println("Especialidad: " + prof.getEspecialidad());
        System.out.println("Edad: " + prof.calcularEdad());
        if (prof.getSexo() == true) {
            System.out.println("Sexo: Masculino");
        }else{
            System.out.println("Sexo: Femenino");
        }
        System.out.println("-----------------------------------------");
        prof.estudiar();
        prof.ensenar();
        System.out.println("////////////////////////////////////////////////");
        Alumno alumno = new Alumno(0.0,"Diego",2006,true);
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Edad: " + alumno.calcularEdad());
        if (alumno.getSexo() == true) {
            System.out.println("Sexo: Masculino");
        }else{
            System.out.println("Sexo: Femenino");
        }
        System.out.println("-----------------------------------------");
        alumno.estudiar();
        List<Double> notas = new ArrayList<Double>();
        notas.add(8.0);
        notas.add(9.0);
        notas.add(10.0);
        alumno.calcularCUM(notas);


    }
}