package SimpleFactory.main;

import SimpleFactory.clase.PersonalSpital;
import SimpleFactory.clase.fabrica.FabricaPersonal;
import SimpleFactory.clase.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal=new FabricaPersonal();

        try {
            PersonalSpital medic=fabricaPersonal.createPersonalSpital(TipPersonal.MEDIC,"Ionescu",12345);
            PersonalSpital asistent=fabricaPersonal.createPersonalSpital(TipPersonal.ASISTENT,"Popescu",9500);
            PersonalSpital brancardier=fabricaPersonal.createPersonalSpital(TipPersonal.BRANCARDIER,"Popa",5000);
            PersonalSpital infirmier=fabricaPersonal.createPersonalSpital(TipPersonal.INFIRMIER,"Angel",7000);
            medic.afiseazaDetalii();
            asistent.afiseazaDetalii();
            brancardier.afiseazaDetalii();
            infirmier.afiseazaDetalii();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}