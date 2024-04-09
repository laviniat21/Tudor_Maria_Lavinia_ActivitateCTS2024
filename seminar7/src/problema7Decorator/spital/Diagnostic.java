package problema7Decorator.spital;

public class Diagnostic implements DiagnosticAbstract{
    private String nume;
    private String simptome;
    private boolean necesitaSpitalizare;

    public Diagnostic(String nume, String simptome, boolean necesitaSpitalizare) {
        this.nume = nume;
        this.simptome = simptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    public String getNume() {
        return nume;
    }

    public String getSimptome() {
        return simptome;
    }

    public boolean isNecesitaSpitalizare() {
        return necesitaSpitalizare;
    }

    @Override
    public void printeazaDiagnostic() {
        System.out.println("Numele diagnosticului este "+this.nume+" , care are simptomele "+this.simptome+" si "+ (this.necesitaSpitalizare? "":"nu")+" necesita spitalizare.");
    }
}
