package problema8Composite.main;

import problema8Composite.clase.Departament;
import problema8Composite.clase.Sectie;
import problema8Composite.clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta cardiologie=new Departament("cardiologie","Gigi");
        StructuraAbstracta oftalmologie=new Departament("Oftalmologie","Vasile");

        StructuraAbstracta terapieInternsiva=new Sectie("ATI",10,"Ion");
        StructuraAbstracta donare=new Sectie("Donare de sange",5,"Gogu");
        StructuraAbstracta optometrie=new Sectie("Optometrie",2,"Ionut");

        cardiologie.adaugaStructura(terapieInternsiva);
        cardiologie.adaugaStructura(donare);

        oftalmologie.adaugaStructura(optometrie);

        StructuraAbstracta spital=new Departament("SPITAL","Ionescu");
        spital.adaugaStructura(cardiologie);
        spital.adaugaStructura(oftalmologie);
        //oftalmologie.adaugaStructura(cardiologie);

        spital.afiseazaDescriere("  ");
    }
}
