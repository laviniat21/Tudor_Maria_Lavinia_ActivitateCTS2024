package SimpleFactory.clase;

import SimpleFactory.clase.PersonalSpital;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Infirmierul "+ super.getNume()+ " are salariul "+ super.getSalariu() );
    }
}
