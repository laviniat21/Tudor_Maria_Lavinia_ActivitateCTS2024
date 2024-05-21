package clase;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getSexReturnMasculin() {
        Persoana persoana1=new Persoana("Ion","5020202240002");
        assertEquals(persoana1.getSex(),"M");
    }

    @org.junit.Test
    public void getSexReturnFeminin() {
        Persoana persoana2=new Persoana("Ioana","6031202234512");
        assertEquals(persoana2.getSex(),"F");
    }


    @org.junit.Test
    public void getSexLimitaInferioara() {
        Persoana persoana2=new Persoana("Paul","1031202236512");
        assertEquals(persoana2.getSex(),"M");
    }

    @org.junit.Test
    public void getSexCrossCheck() {
        Persoana persoana2=new Persoana("Paul","1031202236512");
        String sex;
        if(Integer.valueOf(persoana2.CNP.charAt(0))%2==0){
            sex="F";
        }else {
            sex="M";
        }
            assertEquals(persoana2.getSex(),sex);
    }

    @org.junit.Test(expected =IllegalArgumentException.class)
    public void getSexErrorOutsideCases() {
        Persoana persoana1=new Persoana("Paul","9031202236512");
        persoana1.getSex();
    }

    @org.junit.Test(expected =IllegalArgumentException.class)
    public void getSexErrorAltCaracter() {
        Persoana persoana1=new Persoana("Paul","-031202236512");
        persoana1.getSex();
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexErrorAltTipDeData() {
        Persoana persoana1=new Persoana("Paul","");
        persoana1.getSex();
    }

    @org.junit.Test(timeout = 200)
    public void getSexPerformance() {
        Persoana persoana1=new Persoana("Paul","7031202236512");
        persoana1.getSex();
    }

    @org.junit.Test()
    public void getSeXFormatString() {
        Persoana persoana1=new Persoana("Paul","1031202236512");
        String sex= persoana1.getSex();
        assertEquals(sex.length(),1);
    }

    @org.junit.Test()
    public void getSeXFormatDupaLitera() {
        Persoana persoana1=new Persoana("Paul","1031202236512");
        boolean isCorrect= persoana1.getSex().equals("M")||persoana1.getSex().equals("F");
        assertTrue(isCorrect);
    }

    @org.junit.Test()
    public void getSeXOrdonare() {
        Persoana persoana1=new Persoana("Paul","1031202236512");
        Persoana persoana2=new Persoana("Paula","2031202236512");
        //assertEquals(persoana1.getSex().compareTo(persoana2.getSex()),7);
        assertTrue(persoana1.getSex().compareTo(persoana2.getSex())>0);
    }

}