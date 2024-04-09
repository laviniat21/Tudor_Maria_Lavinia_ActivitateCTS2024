package problema7Decorator.decorator;

import problema7Decorator.spital.Diagnostic;

public class Website extends Decorator{
    public Website(Diagnostic diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.println("In cadrul website-ului, ati primit diagnosticul  "+ super.diagnostic.getNume()+ " care are simptomele "+
                super.diagnostic.getSimptome()+" si "+(this.diagnostic.isNecesitaSpitalizare()? "":"nu ")+ "necesita spitalizare.");
    }
}
