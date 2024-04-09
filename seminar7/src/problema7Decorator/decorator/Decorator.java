package problema7Decorator.decorator;

import problema7Decorator.spital.Diagnostic;
import problema7Decorator.spital.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract {

    protected Diagnostic diagnostic;

    public Decorator(Diagnostic diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public void printeazaDiagnostic() {
        diagnostic.printeazaDiagnostic();
        System.out.println("Rezultatul este disponibil si pe platforma. :)");
    }

    public abstract void afisareOnline();
}
