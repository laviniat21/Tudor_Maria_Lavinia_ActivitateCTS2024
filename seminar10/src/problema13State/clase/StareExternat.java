package problema13State.clase;

public class StareExternat implements Stare{
    protected StareExternat() {
    }

    @Override
    public void setareStare(Pacient pacient) {
        pacient.setStare(this);
        //System.out.println("Pacientul "+ pacient.getNume()+ " este EXTERNAT.");

    }
}
