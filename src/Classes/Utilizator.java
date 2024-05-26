package Classes;

import java.util.*;

public class Utilizator {
    private String username;
    private String password;
    private Angajat date_angajat;
    private Calendar calendar;
    private List<Invitatie> invitatii;

    public Utilizator(String username, String password) {
        this.username = username;
        this.password = password;
        this.invitatii = new ArrayList<>();
    }

    public Utilizator(String username, String password, Angajat date_angajat) {
        this.username = username;
        this.password = password;
        this.date_angajat = date_angajat;
        this.invitatii = new ArrayList<>();
    }

    public boolean autentificare(ArrayList<Utilizator> utilizatori) {
        for (Utilizator u : utilizatori) {
            if (u.getUsername().equals(this.username) && u.password.equals(this.password)) {
                return true;
            }
        }
        return false;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public void vizualizareCalendar() {
        if (this.calendar != null) {
            this.calendar.afisare();
        } else {
            System.out.println("No calendar set.");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void receiveInvitation(Invitatie invitatie) {
        invitatii.add(invitatie);
        invitatie.setStatus(Status.RECEPTIONATA);
    }

    public void respondToInvitation(Invitatie invitatie, boolean accept) {
        if (accept) {
            invitatie.setStatus(Status.ACCEPTATA);
        } else {
            invitatie.setStatus(Status.REFUZATA);
        }
    }

    public void afisareInvitatii() {
        for (Invitatie invitatie : invitatii) {
            invitatie.afisare();
        }
    }

    public void programareSedinta(Calendar calendar, Sedinta sedinta) {
        if (date_angajat != null) {
            date_angajat.programareSedinta(calendar, sedinta);
        } else {
            System.out.println("Angajat details not set.");
        }
    }
}
