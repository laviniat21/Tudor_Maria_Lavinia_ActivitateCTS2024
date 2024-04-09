package FactoryMethod.clase.factory;

import FactoryMethod.clase.Medic;
import FactoryMethod.clase.PersonalSpital;

public class FabricaMedic implements FabricaPersonal{
    @Override
    public PersonalSpital createPesonal(String nume, int salariu) {
        return new Medic(nume,salariu);
    }
}
