package FactoryMethod.clase.factory;

import FactoryMethod.clase.PersonalSpital;

public interface FabricaPersonal {
    public PersonalSpital createPesonal(String nume, int salariu);
}
