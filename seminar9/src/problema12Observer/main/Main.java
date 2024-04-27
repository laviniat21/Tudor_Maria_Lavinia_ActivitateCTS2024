package problema12Observer.main;

import problema12Observer.observer.Abonat;
import problema12Observer.observer.Observator;
import problema12Observer.observer.Vecini;
import problema12Observer.subject.Sala;
import problema12Observer.subject.Stadion;
import problema12Observer.subject.Subject;

public class Main {
    public static void main(String[] args) {
        Observator abonat1=new Abonat("Anabelle");
        Observator abonat2=new Abonat("Bibel");
        Observator abonat3=new Abonat("Gigel");
        Observator vecin1=new Vecini(12f,"Gheorghe");

        Subject subject=new Sala();

        subject.adaugaAbonat(abonat2);
        subject.adaugaAbonat(abonat1);
        subject.adaugaAbonat(vecin1);

        subject.notificaMeciFotbal();
        System.out.println();
        subject.notificaMeciHandbal();
        System.out.println();

        subject.stergereAbonat(abonat1);
        subject.adaugaAbonat(abonat3);
        subject.notificaMeciVolei();

        Subject stadion=new Stadion();
        stadion.adaugaAbonat(abonat1);
        stadion.adaugaAbonat(abonat2);
        ((Stadion)stadion).notificaConcert();
    }
}
