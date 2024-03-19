package Exercitiul1.Builder1.Clase;

public class PacientBuilder implements Builder{
    Pacient pacient;

    @Override
    public Pacient build() {
        return pacient;
    }
    public PacientBuilder(){
        pacient=new Pacient(false,false,false,false);
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }


    public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.pacient.setMicDejunInclus(micDejunInclus);
        return this;
    }


    public PacientBuilder setPapuciCamera(boolean papuciCamera) {
        this.pacient.setPapuciCamera(papuciCamera);
        return this;
    }


    public PacientBuilder setHalatInterior(boolean halatInterior) {
        this.pacient.setHalatInterior(halatInterior);
        return this;
    }
}
