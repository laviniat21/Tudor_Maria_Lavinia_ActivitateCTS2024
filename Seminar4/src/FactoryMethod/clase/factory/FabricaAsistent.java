package FactoryMethod.clase.factory;

import FactoryMethod.clase.Asistent;
import FactoryMethod.clase.PersonalSpital;

public class FabricaAsistent implements FabricaPersonal{
    @Override
    public PersonalSpital createPesonal(String nume, int salariu) {
        return new Asistent(nume,salariu);
    }
}
