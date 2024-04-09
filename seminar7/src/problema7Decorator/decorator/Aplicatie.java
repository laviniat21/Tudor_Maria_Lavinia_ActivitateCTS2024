package problema7Decorator.decorator;

import problema7Decorator.spital.Diagnostic;

public class Aplicatie extends Decorator{

    public Aplicatie(Diagnostic diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.println("In cadrul aplicatiei mobile ati primit diagnosticul  "+ super.diagnostic.getNume()+ " care are simptomele "+
                super.diagnostic.getSimptome()+" si "+(this.diagnostic.isNecesitaSpitalizare()? "":"nu ")+ "necesita spitalizare.");
    }
}
