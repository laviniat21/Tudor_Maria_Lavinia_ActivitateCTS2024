package exercitiul4.main;

import exercitiul4.clase.Reteta;
import exercitiul4.clase.RetetaAbastracta;
import exercitiul4.clase.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<String, Double> solutii_1 = new HashMap<>();
        solutii_1.put("benzoat", 20.34);
        solutii_1.put("bufren", 32.91);
        Reteta prototip = new Reteta(solutii_1, "Medicament_1");

        RetetaAbastracta reteta_2 = prototip.clone();
        System.out.println(reteta_2);

        RetetaCrema prototip_2 = new RetetaCrema(23, "Galbenele");
        RetetaAbastracta reteta_3 = prototip_2.clone();
        System.out.println(reteta_3);

    }
}
