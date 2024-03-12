package FactoryMethod.main;

import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.clase.factory.FabricaAsistent;
import FactoryMethod.clase.factory.FabricaBrancardier;
import FactoryMethod.clase.factory.FabricaMedic;
import FactoryMethod.clase.factory.FabricaPersonal;

public class Main {
    public static void prelucrarePersonal(FabricaPersonal fabrica,String nume, int salariu){
        PersonalSpital personalSpital1= fabrica.createPesonal(nume,salariu);
        personalSpital1.afiseazaDetalii();
    }
    public static void main(String[] args) {
        FabricaPersonal fabricaMedic=new FabricaMedic();
        FabricaPersonal fabricaAsistent=new FabricaAsistent();
        FabricaPersonal fabricaBrancardier=new FabricaBrancardier();

        PersonalSpital medic=fabricaMedic.createPesonal("Ionescu",12345);
        PersonalSpital asistent=fabricaAsistent.createPesonal("Popescu",9500);
        PersonalSpital brancardier=fabricaBrancardier.createPesonal("Popa",7000);
        medic.afiseazaDetalii();
        asistent.afiseazaDetalii();
        brancardier.afiseazaDetalii();

        prelucrarePersonal(new FabricaMedic(),"Angel",12334);
        prelucrarePersonal(new FabricaAsistent(),"Iom",4500);
    }
}
