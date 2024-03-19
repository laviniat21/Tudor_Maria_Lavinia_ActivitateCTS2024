package Exercitiul1.Builder2.clase;

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

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }

    public boolean isPapuciCamera() {
        return papuciCamera;
    }

    public boolean isHalatInterior() {
        return halatInterior;
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

    public static class PacientBuilder implements Builder{

        private boolean patRabatabil;
        private boolean micDejunInclus;
        private boolean papuciCamera;
        private boolean halatInterior;


        public PacientBuilder() {
            this.halatInterior=false;
            this.micDejunInclus=false;
            this.patRabatabil=false;
            this.papuciCamera=false;
        }

        @Override
        public Pacient build() {
            return new Pacient(patRabatabil,micDejunInclus,papuciCamera,halatInterior);
        }

        public PacientBuilder setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
            this.micDejunInclus = micDejunInclus;
            return this;
        }

        public PacientBuilder setPapuciCamera(boolean papuciCamera) {
            this.papuciCamera = papuciCamera;
            return this;
        }

        public PacientBuilder setHalatInterior(boolean halatInterior) {
            this.halatInterior = halatInterior;
            return this;
        }

        @Override
        public String toString() {
            return "PacientBuilder{" +
                    "patRabatabil=" + patRabatabil +
                    ", micDejunInclus=" + micDejunInclus +
                    ", papuciCamera=" + papuciCamera +
                    ", halatInterior=" + halatInterior +
                    '}';
        }
    }

}
