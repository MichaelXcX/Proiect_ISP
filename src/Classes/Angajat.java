package Classes;

public class Angajat {
    private String nume;
    private int idAngajat;

    public Angajat(String nume, int idAngajat) {
        this.nume = nume;
        this.idAngajat = idAngajat;
    }

    public void programareSedinta(Calendar calendar, Sedinta sedinta) {
        sedinta.setStatus(StatusSedinta.NEINCEPUTA);
        calendar.adaugaSedinta(sedinta);
    }

    public void refuzaInvitatie(Invitatie invitatie) {
        invitatie.setStatus(Status.REFUZATA);
    }

    public void acceptaInvitatie(Invitatie invitatie) {
        invitatie.setStatus(Status.ACCEPTATA);
    }

    public void afisare() {
        System.out.println("Nume: " + nume);
        System.out.println("Id angajat: " + idAngajat);
        System.out.println();
    }

    @Override
    public String toString() {
        return nume + " (ID: " + idAngajat + ")";
    }
}
