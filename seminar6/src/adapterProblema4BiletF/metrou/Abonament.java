package adapterProblema4BiletF.metrou;

import java.util.GregorianCalendar;

public class Abonament extends Calatorie{
    private GregorianCalendar dataExpirareAbonament;


    public Abonament(String numeClient) {
        super(numeClient);
        this.dataExpirareAbonament=new GregorianCalendar();
    }

    @Override
    public boolean ePermisAccesul() {
        return this.dataExpirareAbonament.before(new GregorianCalendar());
    }
}
