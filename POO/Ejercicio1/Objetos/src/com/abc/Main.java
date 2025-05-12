package com.abc;

import com.abc.Persona.*;
public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Diego");
        persona1.setApellido("Herrera");
        persona1.setPeso(79);
        persona1.setAnioNac(2006);
        persona1.setAltura(1.76f);

        Persona persona2 = new Persona("Mario", "Perez", 1.80f, 2001, 83);

        persona1.IMC(persona1.getPeso(), persona1.getAltura());
        persona2.IMC(persona2.getPeso(), persona2.getAltura());

        persona1.MostrarDatos();
        persona2.MostrarDatos();

    }
}