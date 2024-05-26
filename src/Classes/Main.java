package Classes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Create a new Utilizator 
        Utilizator utilizator = new Utilizator("user", "password");
        Utilizator utilizator2 = new Utilizator("user2", "password2");
        Utilizator utilizator3 = new Utilizator("user3", "password3");
        Angajat angajat = new Angajat("angajat", 1);
        Angajat angajat2 = new Angajat("angajat2", 2);
        Angajat angajat3 = new Angajat("angajat3", 3);
        Calendar calendar = new Calendar("12.12.2021");
        ArrayList<Utilizator> utilizatori = new ArrayList<Utilizator>();
        ArrayList<Angajat> angajati = new ArrayList<Angajat>();
        angajati.add(angajat);
        angajati.add(angajat2);
        angajati.add(angajat3);
        // Create a new meeting
        Sedinta meeting = new Sedinta(1, "topic", "12.12.2021", angajat, StatusSedinta.NEINCEPUTA, angajati);
        Sedinta meeting2 = new Sedinta(2, "topic2", "13.12.2021", angajat2, StatusSedinta.NEINCEPUTA, angajati);
        Sedinta meeting3 = new Sedinta(3, "topic3", "14.12.2021", angajat3, StatusSedinta.NEINCEPUTA, angajati);
        
        // Add a participant to the meeting
        meeting.addParticipant(angajat);
        meeting2.addParticipant(angajat2);
        meeting3.addParticipant(angajat3);
        
        // Add a meeting to the calendar
        calendar.addMeeting(meeting);
        calendar.addMeeting(meeting2);
        calendar.addMeeting(meeting3);
        
        // Display the calendar
        calendar.afisare();        
        
        // Create Invitation
//        Invitatie invitation = new Invitatie("Invitation", meeting, angajat);
//        invitation.afisare();
        
        
	}

}
