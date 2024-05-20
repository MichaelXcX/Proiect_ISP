package Classes;

import java.util.*;

public class Utilizator {
	private String username;
	private String password;
	private Angajat date_angajat;
	private Calendar calendar;
	
	public Utilizator(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Utilizator(String username, String password, Angajat date_angajat) {
		this.username = username;
		this.password = password;
		this.date_angajat = date_angajat;
	}
	
	public boolean autentificare(ArrayList<Utilizator> utilizatori) {
		if(utilizatori.contains(this)) {
			return true;
		}
		return false;
	}
	
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public void vizualizareCalendar() {
		
		
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
}
