package adapterProblema4BiletF.main;

import adapterProblema4BiletF.metrou.BiletMetrou;
import adapterProblema4BiletF.metrou.Calatorie;
import adapterProblema4BiletF.suprateran.AdapterCalatorie;
import adapterProblema4BiletF.suprateran.CardSTB;

public class Main {
    public static void validareIntrareMetrou(Calatorie calatorie){
        if(calatorie.ePermisAccesul()){
            System.out.println("Calatorie placuta!");
        } else{
            System.out.println("Sold insuficient!");
        }
    }

    public static void validareUrcareSTB(CardSTB card){
        card.validareCalatorie();
    }
    public static void main(String[] args) {
        Calatorie biletMetrou=new BiletMetrou("Manole",2);
        validareIntrareMetrou(biletMetrou);
        CardSTB biletMixt=new AdapterCalatorie(biletMetrou);
        validareUrcareSTB(biletMixt);
        validareIntrareMetrou(biletMetrou);

    }
}