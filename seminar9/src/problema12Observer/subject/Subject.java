package problema12Observer.subject;

import problema12Observer.observer.Observator;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observator> observatori;

    public Subject() {
        observatori=new ArrayList<>();
    }

    public void adaugaAbonat(Observator observator){
        observatori.add(observator);
    };

    public void stergereAbonat(Observator observator){
        observatori.remove(observator);
    }

    public void notificaAbonati(String mesaj){
        for (Observator observator:observatori) {
            observator.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciHandbal();
    public abstract void notificaMeciVolei();
    public abstract void notificaMeciFotbal();
}
