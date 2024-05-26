package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Administrator extends Manager {
	public Administrator(String nume, int idAngajat) {
		super(nume, idAngajat);
	}
	
	public void aprobaSedinta(Sedinta meeting) {
		meeting.setStatus(StatusSedinta.NEINCEPUTA);
	}
	
	public void anuleazaSedinta(Calendar calendar, Sedinta meeting) {
		calendar.removeMeeting(meeting);
	}
	
	public void gestioneazaUtilizatori(ArrayList<Utilizator> users) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Adauga utilizator");
		System.out.println("2. Sterge utilizator");
		System.out.println("3. Modifica utilizator");
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
			for (Utilizator utilizator : users) {
				if (utilizator.getUsername() == usernameToDelete) {
					users.remove(utilizator);
					break;
				}
			}
			break;
		case 3:
			System.out.println("Username: ");
			String usernameToModify = scan.next();
			for (Utilizator utilizator : users) {
				if (utilizator.getUsername() == usernameToModify) {
					System.out.println("Nume: ");
					String numeModificat = scan.next();
					utilizator.setUsername(numeModificat);
					break;
				}
			}
			break;
		default:
            break;
        }
		
	}
	
}
