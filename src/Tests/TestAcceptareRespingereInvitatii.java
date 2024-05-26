package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Classes.Administrator;
import Classes.Invitatie;
import Classes.Status;
import Classes.Utilizator;

import java.util.ArrayList;

class AcceptareRespingereInvitatiiTest {

    @Test
    void testAcceptareInvitatie() {
        Utilizator utilizator = new Utilizator("user1", "password1");
        Invitatie invitatie = new Invitatie(1, 1);

        utilizator.receiveInvitation(invitatie);
        utilizator.respondToInvitation(invitatie, true); // Accept invitation

        assertEquals(Status.ACCEPTATA, invitatie.getStatus(), "Invitation acceptance failed.");
    }

    @Test
    void testRespinsInvitatie() {
        Utilizator utilizator = new Utilizator("user1", "password1");
        Invitatie invitatie = new Invitatie(1, 1);

        utilizator.receiveInvitation(invitatie);
        utilizator.respondToInvitation(invitatie, false); // Reject invitation

        assertEquals(Status.REFUZATA, invitatie.getStatus(), "Invitation rejection failed.");
    }
}

