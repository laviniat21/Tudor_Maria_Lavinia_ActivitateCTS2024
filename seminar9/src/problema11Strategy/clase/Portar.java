package problema11Strategy.clase;

public class Portar {
    private Verificator strategie;

    public Portar() {
        this.strategie = new VerificatorPeluza();
    }

    public Portar(Verificator strategie) {
        this.strategie = strategie;
    }

    public void setStrategie(Verificator strategie) {
        this.strategie = strategie;
    }

    public void verificareSuporter(String numeSuporter){
        strategie.verificare(numeSuporter);
    }
}
