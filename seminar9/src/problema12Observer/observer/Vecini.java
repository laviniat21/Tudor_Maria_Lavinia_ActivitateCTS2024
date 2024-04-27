package problema12Observer.observer;

public class Vecini implements Observator{
    private float distanta;
    private String nume;

    public Vecini(float distanta, String nume) {
        this.distanta = distanta;
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume +", sala aflata la o distanta de "+ this.distanta+ " a trimis catre abonati urmatorul mesaj: "+mesaj);
    }
}
