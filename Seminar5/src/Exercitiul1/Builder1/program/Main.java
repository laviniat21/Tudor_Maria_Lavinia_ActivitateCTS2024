package Exercitiul1.Builder1.program;

import Exercitiul1.Builder1.Clase.Pacient;
import Exercitiul1.Builder1.Clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        {
            Pacient pacient=new PacientBuilder().setMicDejunInclus(true).setPapuciCamera(true).build();
            System.out.println(pacient.toString());

            Pacient pacient2=new PacientBuilder().setHalatInterior(true).setPatRabatabil(true).build();
            System.out.println(pacient2.toString());
        }
    }
}