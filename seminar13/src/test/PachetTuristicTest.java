package test;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import test.categorii.CuMock;
import test.categorii.FaraMock;
import test.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(FaraMock.class)
    public void getTesteazaCorectitudineAplicaDiscount() {
        IPersoana client=new Persoana("Ion","1240202123454");
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Destinatie",100.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
            assertEquals(90.0, pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(FaraMock.class)
    public void aplicareDiscountBoundery(){
        IPersoana client=new Persoana("Ion","1590202123454");
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Destinatie",100.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90.0, pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareAplicaDiscountFake(){
        PersoanaFake client=new PersoanaFake();
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Destinatie",100.0);
        client.setGetVarstaValue(65);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90.0, pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void valoareNuAplicaDiscountFake(){
        PersoanaFake client=new PersoanaFake();
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Destinatie",100.0);
        client.setGetVarstaValue(35);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(100.0, pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void aplicareDiscount100(){
        PersoanaFake client=new PersoanaFake();
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Destinatie",100.0);
        client.setGetVarstaValue(75);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0.0, pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void aplicareDiscount0(){
        PersoanaFake client=new PersoanaFake();
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Destinatie",100.0);
        client.setGetVarstaValue(75);
        pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(100.0, pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CuMock.class)
    public void aplicareDiscount1(){
        PersoanaFake client=new PersoanaFake();
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Destinatie",100.0);
        client.setGetVarstaValue(75);
        pachetTuristic.aplicaDiscountVarstnici(1);
        assertEquals(99.0, pachetTuristic.getPret(),0.01);
    }


}