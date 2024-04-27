package problema12Observer.observer;

public class Abonat implements Observator{
    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume+"  ai primit urmatorul mesaj: "+mesaj);
    }
}
