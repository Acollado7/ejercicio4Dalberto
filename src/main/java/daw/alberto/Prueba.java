package daw.alberto;

import java.time.LocalDate;

public class Prueba {
    public static void main(String[] args) {

        Animal a1 = new Animal(LocalDate.of(1990,12,1),"Juan", "Perro", 5.0, "Dormido");
        Animal a2 = new Animal( LocalDate.of(1990,12,1),"Jose", "Tigre de bengala", 250.0, "Comiendo");

        Persona p1 = new Persona();
        Persona p2 = new Persona();



        System.out.println(a1);
        System.out.println(a2);
        System.out.println("--------------------------------------------------");



        Animal a3 = Animal.clonar(a2);


        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);


        p2.jugar(a2, 120);



        p1.alimentar(a1, 1000);
        System.out.println(a1);
        System.out.println("--------------------------------------------------");


        p1.jugar(a1, 200);
        System.out.println(a1);
        System.out.println("--------------------------------------------------");

    }
}
