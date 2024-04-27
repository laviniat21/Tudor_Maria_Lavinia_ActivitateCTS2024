package problema12Observer.subject;

public class Stadion extends Subject{
    @Override
    public void notificaMeciHandbal() {
        super.notificaAbonati("Azi are loc un meci de handbal");
    }

    @Override
    public void notificaMeciVolei() {
        super.notificaAbonati("Maine are loc un meci de volei pe stadion, pe stadion.");
    }

    @Override
    public void notificaMeciFotbal() {
        super.notificaAbonati("Pe stadion, are loc un meci de fotbal feminin");
    }

    public void notificaConcert(){
        super.notificaAbonati("Astazi, pe stadion, vor canta mai multe formatii.");
    }
}
