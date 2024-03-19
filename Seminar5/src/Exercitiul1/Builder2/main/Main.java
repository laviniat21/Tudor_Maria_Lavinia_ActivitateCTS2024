package Exercitiul1.Builder2.main;

import Exercitiul1.Builder2.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient.PacientBuilder pacientBuilder=new Pacient.PacientBuilder();
        Pacient pacient=pacientBuilder.setMicDejunInclus(true).setPapuciCamera(true).build();
        System.out.println(pacient);
    }
}
