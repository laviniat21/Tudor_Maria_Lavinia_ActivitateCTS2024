package problema11Strategy.clase;

public class VerificatorVIP implements Verificator{
    @Override
    public void verificare(String numeSuporter) {
        System.out.println("Este verificat biletul lui "+numeSuporter);
    }
}
