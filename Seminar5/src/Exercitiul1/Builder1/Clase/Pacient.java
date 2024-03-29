package Exercitiul1.Builder1.Clase;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public Pacient(boolean patRabatabil, boolean micDejunInclus, boolean papuciCamera, boolean halatInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciCamera=" + papuciCamera +
                ", halatInterior=" + halatInterior +
                '}';
    }
}
