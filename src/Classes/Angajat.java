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
		calendar.addMeeting(sedinta);
	}
	
	public void refuzaInvitatie(Invitatie invitate) {
		invitate.setStatus(Status.RESPINSA);
	}
	
	public void acceptaInvitatie(Invitatie invitate) {
		invitate.setStatus(Status.ACCEPTATA);
	}
	
	public void afisare() {
		System.out.println("Nume: " + nume);
        System.out.println("Id angajat: " + idAngajat);
        System.out.println();
	}
	
	
}
