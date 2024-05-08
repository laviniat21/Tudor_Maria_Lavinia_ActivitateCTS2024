package problema13State.clase;

public class StareInternat implements Stare {
    protected StareInternat() {
    }

    @Override
    public void setareStare(Pacient pacient) {
        pacient.setStare(this);
        //System.out.println("Pacientul "+ pacient.getNume()+ " este INTERNAT.");
    }
}
