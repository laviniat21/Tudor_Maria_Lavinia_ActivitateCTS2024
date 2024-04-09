package adapterProblema4BiletF.suprateran;

public abstract class CardSTB {
    private String numeClient;
    private String cnpClient;

    public CardSTB(String numeClient, String cnpClient) {
        this.numeClient = numeClient;
        this.cnpClient = cnpClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getCnpClient() {
        return cnpClient;
    }

    public void setCnpClient(String cnpClient) {
        this.cnpClient = cnpClient;
    }

    public abstract void validareCalatorie();
}
