package SimpleFactory.clase;

public class Medic extends PersonalSpital{
    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Medicul "+ super.getNume()+ " are salariul "+ super.getSalariu() );

    }
}
