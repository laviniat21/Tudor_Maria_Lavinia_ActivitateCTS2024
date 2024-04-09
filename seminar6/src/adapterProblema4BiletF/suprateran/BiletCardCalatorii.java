package adapterProblema4BiletF.suprateran;

public class BiletCardCalatorii extends CardSTB{

    private double soldCard;
    private static double pretCalatorie=3.2;

    public BiletCardCalatorii(String numeClient, String cnpClient,Double soldCard) {
        super(numeClient, cnpClient);
        this.soldCard=soldCard;
    }

    @Override
    public void validareCalatorie() {
        if(soldCard>=pretCalatorie){
            soldCard-=pretCalatorie;
            System.out.println("Calatorie placuta!");
        } else {
            System.out.println("Sold insuficient!");
        }
    }
}
