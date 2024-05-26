package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Classes.Administrator;
import Classes.Utilizator;

import java.util.ArrayList;

class GestionareUtilizatoriTest {

    @Test
    void testAdaugareUtilizator() {
        ArrayList<Utilizator> utilizatori = new ArrayList<>();
        Administrator admin = new Administrator("Admin1", 1);

        Utilizator utilizator1 = new Utilizator("user1", "password1");
        Utilizator utilizator2 = new Utilizator("user2", "password2");

        admin.gestioneazaUtilizatori(utilizatori, utilizator1, true);
        assertTrue(utilizatori.contains(utilizator1), "Adding user failed.");

        admin.gestioneazaUtilizatori(utilizatori, utilizator2, true);
        assertTrue(utilizatori.contains(utilizator2), "Adding another user failed.");
    }

    @Test
    void testActualizareUtilizator() {
        ArrayList<Utilizator> utilizatori = new ArrayList<>();
        Administrator admin = new Administrator("Admin1", 1);

        Utilizator utilizator1 = new Utilizator("user1", "password1");
        Utilizator utilizator2 = new Utilizator("user2", "password2");

        admin.gestioneazaUtilizatori(utilizatori, utilizator1, true);
        admin.gestioneazaUtilizatori(utilizatori, utilizator1, false); // Update user

        assertFalse(utilizatori.contains(utilizator2), "Updated user incorrectly added.");
    }

    @Test
    void testStergereUtilizator() {
        ArrayList<Utilizator> utilizatori = new ArrayList<>();
        Administrator admin = new Administrator("Admin1", 1);

        Utilizator utilizator1 = new Utilizator("user1", "password1");

        admin.gestioneazaUtilizatori(utilizatori, utilizator1, true);
        admin.gestioneazaUtilizatori(utilizatori, utilizator1, false); // Delete user

        assertFalse(utilizatori.contains(utilizator1), "Deleting user failed.");
    }
}
