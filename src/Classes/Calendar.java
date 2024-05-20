package Classes;

import java.util.*;

public class Calendar {
	private String date;
	private ArrayList<Sedinta> sedinte;
	
	public Calendar(String date) {
		this.date = date;
		sedinte = new ArrayList<Sedinta>();
	}
	
	public void addMeeting(Sedinta meeting) {
		sedinte.add(meeting);
	}
	
	public void removeMeeting(Sedinta meeting) {
		sedinte.remove(meeting);
	}
	
	
	public void afisare() {
		System.out.println("Data: " + date);
        for(Sedinta sedinta : sedinte) {
            sedinta.afisare();
            System.out.println();
        }
        System.out.println();
	}
}
