package Classes;

import java.util.ArrayList;

public class Sedinta {
    private int idSedinta;
    private String topic;
    private String data;
    private Angajat organizator;
    private StatusSedinta status;
    private ArrayList<Angajat> participanti;

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

    public int getIdSedinta() {
        return idSedinta;
    }
    
	public String getTopic() {
		return topic;
	}
	
	public String getData() {
		return data;
	}
    
	public String getStatus() {
		return status.toString();
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
