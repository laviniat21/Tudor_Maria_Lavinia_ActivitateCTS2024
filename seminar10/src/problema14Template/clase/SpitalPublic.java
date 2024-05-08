package problema14Template.clase;

public class SpitalPublic extends Template{
    private String numeSpital;
    private int nrPaturiLibere;

    public SpitalPublic(String numeSpital, int nrPaturiLibere) {
        this.numeSpital = numeSpital;
        this.nrPaturiLibere = nrPaturiLibere;
    }

    @Override
    protected void analizaSanatate(Pacient pacient) {
        pacient.setStareSanatate((pacient.getNume().length()%5)+1);
        System.out.println(pacient.getNume()+" are starea de sanatate "+pacient.getStareSanatate());
    }

    @Override
    protected int disponibilitatePaturi() {
        return this.nrPaturiLibere;
    }

    @Override
    protected void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+ " a fost internat la spitalul "+this.numeSpital);
        this.nrPaturiLibere-=1;
    }

    @Override
    protected void refuzaInternare(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+" este trimis cu o ambulanta la un alt spital, deoarece in spitalul "+this.numeSpital+" nu sunt locuri disponibile.");
    }
}
