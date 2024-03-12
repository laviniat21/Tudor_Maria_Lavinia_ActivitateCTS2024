package FactoryMethod.clase.factory;

import FactoryMethod.clase.Brancardier;
import FactoryMethod.clase.PersonalSpital;

public class FabricaBrancardier implements FabricaPersonal{
    @Override
    public PersonalSpital createPesonal(String nume, int salariu) {
        return new Brancardier(nume,salariu);
    }
}
