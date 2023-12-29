package test;

import dominio.Persona;
        
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Santiago", 5000.00, false);
        System.out.println("Nombre sin cambio: " + persona1.getNombre());
        persona1.setNombre("Santiago Emanuel");
        System.out.println("Persona1 nombre con cambios: " + persona1.getNombre());
    }
}
