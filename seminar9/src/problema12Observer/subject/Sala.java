package problema12Observer.subject;

public class Sala extends Subject{

    @Override
    public void notificaMeciHandbal() {
        String mesaj="Va avea loc un meci de handbal pe data de 17 la ora 18:00.";
        notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciVolei() {
        String mesaj="Va avea loc un meci de volei pe data de 21 la ora 16:30.";
        notificaAbonati(mesaj);
    }

    @Override
    public void notificaMeciFotbal() {
        String mesaj="Va avea loc un meci de fotbal pe data de 24 la ora 20:00.";
        notificaAbonati(mesaj);
    }
}
