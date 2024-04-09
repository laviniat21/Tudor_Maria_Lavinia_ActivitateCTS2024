package problema7Decorator.main;

import problema7Decorator.decorator.Aplicatie;
import problema7Decorator.decorator.Decorator;
import problema7Decorator.spital.Diagnostic;
import problema7Decorator.spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {

        DiagnosticAbstract diagnostic=new Diagnostic("Raceala","tuse acuta, rosu in gat",false);
        diagnostic.printeazaDiagnostic();

        Diagnostic diagnostic1=new Diagnostic("Raceala","tuse acuta, rosu in gat",false);

        Decorator decoratorA=new Aplicatie(diagnostic1);
        decoratorA.afisareOnline();
        decoratorA.printeazaDiagnostic();
    }
}