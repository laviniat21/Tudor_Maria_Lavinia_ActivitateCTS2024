package problema13State.main;

import problema13State.clase.Pacient;
import problema13State.clase.Stare;
import problema13State.clase.StareSubObservatie;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Gheorghita");
        pacient.seAgraveazaStarea();
        pacient.vindecare();
        pacient.seImbunatatesteStarea();
        pacient.vindecare();

        Pacient pacient2=new Pacient("Ghita");
        pacient2.seAgraveazaStarea();
        pacient2.seImbunatatesteStarea();
        pacient2.vindecare();
    }
}