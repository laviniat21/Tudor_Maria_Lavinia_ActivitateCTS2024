package FactoryMethod.clase;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Infirmierul "+this.getNume()+ " are salariul "+this.getSalariu());
    }
}
