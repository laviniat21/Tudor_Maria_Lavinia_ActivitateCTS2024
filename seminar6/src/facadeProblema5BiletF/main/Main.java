package facadeProblema5BiletF.main;

import facadeProblema5BiletF.autobuz.Autobuz;
import facadeProblema5BiletF.autobuz.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        autobuz.punePeLiberUsaDinFata();
        autobuz.punePeLiberUsaDinMijloc();
        autobuz.punePeLiberUsaDinSpate();
        autobuz.deschideUsaDinFata();
        autobuz.deschideUsaDinMijloc();
        autobuz.deschideUsaDinSpate();
        System.out.println("      Facade:       ");
        FacadeAutobuz facadeAutobuz=new FacadeAutobuz(autobuz);
        facadeAutobuz.elibereazaToateUsile();
        facadeAutobuz.deschideToateUsile();
    }
}
