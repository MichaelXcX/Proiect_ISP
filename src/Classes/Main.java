package Classes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create employees and users
        Angajat angajat1 = new Angajat("Angajat1", 1);
        Angajat angajat2 = new Angajat("Angajat2", 2);
        Manager manager = new Manager("Manager1", 3);
        Administrator admin = new Administrator("Admin1", 4);

        Utilizator utilizator1 = new Utilizator("user1", "password1", angajat1);
        Utilizator utilizator2 = new Utilizator("user2", "password2", angajat2);
        Utilizator utilizator3 = new Utilizator("user3", "password3");

        // Setting up calendars
        Calendar calendar1 = new Calendar("2023-05-26");
        Calendar calendar2 = new Calendar("2023-05-27");
        utilizator1.setCalendar(calendar1);
        utilizator2.setCalendar(calendar2);

        // Creating meetings
        ArrayList<Angajat> participanti = new ArrayList<>();
        participanti.add(angajat1);
        participanti.add(angajat2);

        Sedinta sedinta1 = new Sedinta(1, "Team Meeting", "2023-05-26", angajat1, StatusSedinta.NEINCEPUTA, participanti);
        Sedinta sedinta2 = new Sedinta(2, "Project Planning", "2023-05-27", angajat1, StatusSedinta.NEINCEPUTA, participanti);
        Sedinta sedinta3 = new Sedinta(3, "Code Review", "2023-05-28", angajat2, StatusSedinta.NEINCEPUTA, participanti);
        Sedinta sedinta4 = new Sedinta(4, "Client Meeting", "2023-05-29", angajat2, StatusSedinta.NEINCEPUTA, participanti);
        Sedinta sedinta5 = new Sedinta(5, "Sprint Retrospective", "2023-05-30", angajat1, StatusSedinta.NEINCEPUTA, participanti);

        // Adding meetings to calendars
        utilizator1.programareSedinta(calendar1, sedinta1);
        utilizator1.programareSedinta(calendar1, sedinta2);
        utilizator2.programareSedinta(calendar2, sedinta3);
        utilizator2.programareSedinta(calendar2, sedinta4);
        utilizator1.programareSedinta(calendar1, sedinta5);

        // Display calendars
        utilizator1.vizualizareCalendar();
        utilizator2.vizualizareCalendar();

        // Sending invitations
        Invitatie invitatie1 = new Invitatie(1, 1);
        Invitatie invitatie2 = new Invitatie(2, 1);
        Invitatie invitatie3 = new Invitatie(3, 2);
        Invitatie invitatie4 = new Invitatie(4, 2);
        Invitatie invitatie5 = new Invitatie(5, 1);
        utilizator1.receiveInvitation(invitatie1);
        utilizator2.receiveInvitation(invitatie2);
        utilizator1.receiveInvitation(invitatie3);
        utilizator2.receiveInvitation(invitatie4);
        utilizator1.receiveInvitation(invitatie5);

        // Display invitations
        utilizator1.afisareInvitatii();
        utilizator2.afisareInvitatii();

        // Responding to invitations
        utilizator1.respondToInvitation(invitatie1, true);
        utilizator2.respondToInvitation(invitatie2, false);
        utilizator1.respondToInvitation(invitatie3, true);
        utilizator2.respondToInvitation(invitatie4, true);
        utilizator1.respondToInvitation(invitatie5, true);

        // Display invitations after response
        utilizator1.afisareInvitatii();
        utilizator2.afisareInvitatii();

        // Rescheduling meeting
        manager.reprogrameazaSedinta(sedinta1, "2023-05-28");

        // Deleting meeting
        manager.anuleazaSedinta(calendar1, sedinta2);
        utilizator1.vizualizareCalendar();

        // Editing the calendar
        admin.editeazaCalendar(calendar1, 5, "Updated Sprint Retrospective", "2023-05-31", StatusSedinta.IN_DESFASURARE);

        // Generating a report
        admin.genereazaRaport(calendar1);
    }
}
