package Classes;

import java.util.*;

public class Sedinta {
	private int idSedinta;
	private String topic;
	private String data;
	private Angajat organizator;
	private StatusSedinta status;
	private ArrayList<Angajat>  participanti;
	
	public Sedinta(int idSedinta, String topic, String data, Angajat organizator, StatusSedinta status, ArrayList<Angajat> participanti) {
        this.idSedinta = idSedinta;
        this.topic = topic;
        this.data = data;
        this.organizator = organizator;
        this.status = status;
        this.participanti = participanti;
    }
	
	public void addParticipant(Angajat participant) {
        participanti.add(participant);
    }
	
	public void removeParticipant(Angajat participant) {
		participanti.remove(participant);
	}	
	
	public void setStatus(StatusSedinta status) {
		this.status = status;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public void afisare() {
		System.out.println("Id sedinta: " + idSedinta);
		System.out.println("Topic: " + topic);
		System.out.println("Data: " + data);
		System.out.println("Organizator: " + organizator);
		System.out.println("Status: " + status);
		System.out.println("Participanti: ");
		for (Angajat angajat : participanti) {
			angajat.afisare();
		}
	}
}
