package adapterProblema4BiletF.metrou;

public abstract class Calatorie {
    private String numeClient;

    public Calatorie(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public abstract boolean ePermisAccesul();


}
