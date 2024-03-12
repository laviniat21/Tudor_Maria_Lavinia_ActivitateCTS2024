package SimpleFactory.clase;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Brancardierul "+ super.getNume()+ " are salariul "+ super.getSalariu() );
    }
}
