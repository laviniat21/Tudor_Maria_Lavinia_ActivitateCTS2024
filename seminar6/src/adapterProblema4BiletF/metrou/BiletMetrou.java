package adapterProblema4BiletF.metrou;

public class BiletMetrou extends Calatorie{
    private int nrCalatorii;



    public BiletMetrou(String numeClient, int nrCalatorii) {
        super(numeClient);
        this.nrCalatorii=nrCalatorii;
    }

    @Override
    public boolean ePermisAccesul() {
        if(this.nrCalatorii>0){
            this.nrCalatorii-=1;
            return true;
        }else {
            return false;
        }
    }
}
