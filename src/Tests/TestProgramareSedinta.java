package Tests; // Ensure this matches the package name

import Classes.Angajat;
import Classes.Calendar;
import Classes.Sedinta;
import Classes.StatusSedinta;
import Classes.Utilizator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class MeetingSchedulingTest {

    @Test
    void testMeetingScheduling() {
        // Creating employees and users
        Angajat angajat1 = new Angajat("Angajat1", 1);
        Angajat angajat2 = new Angajat("Angajat2", 2);
        Utilizator utilizator1 = new Utilizator("user1", "password1", angajat1);
        Utilizator utilizator2 = new Utilizator("user2", "password2", angajat2);

        // Creating calendars and associating them with users
        Calendar calendar1 = new Calendar("2023-05-26");
        Calendar calendar2 = new Calendar("2023-05-27");
        utilizator1.setCalendar(calendar1);
        utilizator2.setCalendar(calendar2);

        // Creating participants for the meeting
        ArrayList<Angajat> participanti = new ArrayList<>();
        participanti.add(angajat1);
        participanti.add(angajat2);

        // Creating a meeting
        Sedinta sedinta = new Sedinta(1, "Team Meeting", "2023-05-26", angajat1, StatusSedinta.NEINCEPUTA, participanti);

        // Test scheduling a meeting on the organizer's calendar
        utilizator1.programareSedinta(calendar1, sedinta);
        assertTrue(calendar1.getSedinte().contains(sedinta), "Scheduling meeting on organizer's calendar failed.");

        // Test scheduling a meeting on a calendar not associated with the organizer
        utilizator2.programareSedinta(calendar1, sedinta);
        assertFalse(calendar2.getSedinte().contains(sedinta), "Scheduling meeting on non-organizer's calendar succeeded.");

        // Test scheduling a meeting with conflicting time slots
        Sedinta conflictingSedinta = new Sedinta(2, "Conflict Meeting", "2023-05-26", angajat2, StatusSedinta.NEINCEPUTA, participanti);
        utilizator1.programareSedinta(calendar1, conflictingSedinta);
        assertTrue(calendar1.getSedinte().contains(conflictingSedinta), "Scheduling conflicting meeting succeeded.");

        // Test scheduling multiple meetings on the same calendar
        Calendar calendar3 = new Calendar("2023-05-28");
        utilizator1.setCalendar(calendar3);
        Sedinta meeting1 = new Sedinta(3, "Meeting 1", "2023-05-28", angajat1, StatusSedinta.NEINCEPUTA, participanti);
        Sedinta meeting2 = new Sedinta(4, "Meeting 2", "2023-05-28", angajat1, StatusSedinta.NEINCEPUTA, participanti);
        utilizator1.programareSedinta(calendar3, meeting1);
        utilizator1.programareSedinta(calendar3, meeting2);
        assertTrue(calendar3.getSedinte().contains(meeting1) && calendar3.getSedinte().contains(meeting2),
                "Scheduling multiple meetings on the same calendar failed.");
    }
}
