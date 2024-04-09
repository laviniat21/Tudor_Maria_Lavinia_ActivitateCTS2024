package Main;

import Clase.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiuneBazaDeDate1=ConexiuneBazaDeDate.getInstanta("PrimaBazaDeDate",2,"link1");
        ConexiuneBazaDeDate conexiuneBazaDeDate2=ConexiuneBazaDeDate.getInstanta("aDouaBazaDeDate",4,"link2");
        System.out.println(conexiuneBazaDeDate1);
        System.out.println(conexiuneBazaDeDate2);

        conexiuneBazaDeDate1.setLinkConexiune("linkNou");
        System.out.println(conexiuneBazaDeDate1.getLinkConexiune());

        conexiuneBazaDeDate2.setNumeBaza("unAltNume");
        System.out.println(conexiuneBazaDeDate1.getNumeBaza());
        conexiuneBazaDeDate2.setNrTabele(56);
        conexiuneBazaDeDate1.getNrTabele();
        System.out.println(conexiuneBazaDeDate1);



    }
}