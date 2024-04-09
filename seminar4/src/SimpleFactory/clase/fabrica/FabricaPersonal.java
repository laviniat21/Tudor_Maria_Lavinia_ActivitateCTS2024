package SimpleFactory.clase.fabrica;

import SimpleFactory.clase.*;

public class FabricaPersonal {
    public PersonalSpital createPersonalSpital(TipPersonal tipPersonal, String nume, int salariu) throws Exception{
        switch (tipPersonal){
            case MEDIC:
                Medic medic = new Medic(nume,salariu);
                return medic;
            case ASISTENT:
                Asistent asistent = new Asistent(nume,salariu);
                return asistent;
            case BRANCARDIER:
                Brancardier brancardier = new Brancardier(nume,salariu);
                return brancardier;
            case INFIRMIER:
                Infirmier infirmier = new Infirmier(nume,salariu);
                return infirmier;
            default:
                throw new Exception("Nu exista acest personal");
        }
    }
}
