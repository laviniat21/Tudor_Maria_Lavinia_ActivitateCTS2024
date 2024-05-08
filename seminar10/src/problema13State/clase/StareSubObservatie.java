package problema13State.clase;

public class StareSubObservatie implements Stare{

    protected StareSubObservatie() {
    }

    @Override
    public void setareStare(Pacient pacient) {
        pacient.setStare(this);
        //System.out.println("Pacientul "+ pacient.getNume()+ " este in SUB OBSERVATIE.");

    }
}
