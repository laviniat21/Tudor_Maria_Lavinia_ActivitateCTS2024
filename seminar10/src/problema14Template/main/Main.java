package problema14Template.main;

import problema14Template.clase.Pacient;
import problema14Template.clase.SpitalPublic;

public class Main {

    public static void main(String[] args) {
        SpitalPublic spitalPublic=new SpitalPublic("Coltea",2);
        Pacient pacient1=new Pacient("Gheorge");
        Pacient pacient2=new Pacient("Miky");
        Pacient pacient3=new Pacient("Ion");

        spitalPublic.internare(pacient1);
        spitalPublic.internare(pacient2);
        spitalPublic.internare(pacient3);
    }
}
