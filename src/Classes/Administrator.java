package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Administrator extends Manager {
    public Administrator(String nume, int idAngajat) {
        super(nume, idAngajat);
    }

    public void gestioneazaUtilizatori(ArrayList<Utilizator> users, Utilizator utilizator1, boolean b) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Adauga utilizator");
        System.out.println("2. Sterge utilizator");
        System.out.println("3. Modifica utilizator");
        System.out.println("4. Inchide");
        int option = scan.nextInt();

        switch (option) {
            case 1:
                System.out.println("Nume: ");
                String nume = scan.next();
                System.out.println("Password: ");
                String pass = scan.next();
                Utilizator user = new Utilizator(nume, pass);
                users.add(user);
                break;
            case 2:
                System.out.println("Username: ");
                String usernameToDelete = scan.next();
                users.removeIf(u -> u.getUsername().equals(usernameToDelete));
                break;
            case 3:
                System.out.println("Username: ");
                String usernameToModify = scan.next();
                for (Utilizator utilizator : users) {
                    if (utilizator.getUsername().equals(usernameToModify)) {
                        System.out.println("Nume: ");
                        String numeModificat = scan.next();
                        utilizator.setUsername(numeModificat);
                        break;
                    }
                }
                break;
            case 4:
            	System.out.println("Inchide");
            	break;                
            default:
                break;
        }
    }
    public void editeazaCalendar(Calendar calendar, int sedintaId, String newTitlu, String newData, StatusSedinta newStatus) {
        calendar.editeazaSedinta(sedintaId, newTitlu, newData, newStatus);
    }

    public void genereazaRaport(Calendar calendar) {
        calendar.genereazaRaport();
    }
}
