package problema13State.clase;

public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new StareInternat();
    }

    public String getNume() {
        return nume;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void seAgraveazaStarea(){
        if(this.stare instanceof StareInternat) {
            Stare subObservatie=new StareSubObservatie();
            subObservatie.setareStare(this);
            System.out.println("starea de sanatate a pacientului "+this.nume+" s-a agravat.");
        } else {
            System.out.println("Pacientul "+this.nume+" nu este internat.");
        }
    }

    public void seImbunatatesteStarea(){
        if(this.stare instanceof StareSubObservatie) {
            Stare subInternat=new StareInternat();
            subInternat.setareStare(this);
            System.out.println("starea de sanatate a pacientului "+this.nume+" s-a imbunatatit.");
        } else {
            System.out.println("Pacientul "+this.nume+" nu este sub observatie.");
        }
    }

    public void vindecare(){
        if(this.stare instanceof StareInternat) {
            Stare subExternat=new StareExternat();
            subExternat.setareStare(this);
            System.out.println("Pacientul "+this.nume+" s-a vindecat.");
        } else {
            System.out.println("Pacientul "+this.nume+" nu poate fi externat.");
        }
    }



}
