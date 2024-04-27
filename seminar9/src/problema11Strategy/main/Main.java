package problema11Strategy.main;

import problema11Strategy.clase.*;

public class Main {
    public static void main(String[] args) {
        Portar portar=new Portar();
        String suporter1="GigelVIP";
        String suporter2="GigelTribuna";
        String suporter3="GigelPeluza";

        portar.setStrategie(new VerificatorVIP());
        portar.verificareSuporter(suporter1);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificareSuporter(suporter2);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificareSuporter(suporter3);

    }
}