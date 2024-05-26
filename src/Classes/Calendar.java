package Classes;

import java.util.ArrayList;

public class Calendar {
    private String data;
    private ArrayList<Sedinta> sedinte;

    public Calendar(String data) {
        this.data = data;
        this.sedinte = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public ArrayList<Sedinta> getSedinte() {
        return sedinte;
    }

    public void adaugaSedinta(Sedinta sedinta) {
        sedinte.add(sedinta);
        System.out.println("Sedinta adaugata la data: " + data);
    }

    public void stergeSedinta(Sedinta sedinta) {
        sedinte.remove(sedinta);
        System.out.println("Sedinta stearsa de la data: " + data);
    }

    public void afisare() {
        System.out.println("Calendar pentru data: " + data);
        for (Sedinta sedinta : sedinte) {
            System.out.println("Sedinta ID: " + sedinta.getIdSedinta() + ", Titlu: " + sedinta.getTopic() +
                    ", Data: " + sedinta.getData() + ", Status: " + sedinta.getStatus());
        }
    }

    public void editeazaSedinta(int sedintaId, String newTitlu, String newData, StatusSedinta newStatus) {
        for (Sedinta sedinta : sedinte) {
            if (sedinta.getIdSedinta() == sedintaId) {
                sedinta.setTopic(newTitlu);
                sedinta.setData(newData);
                sedinta.setStatus(newStatus);
                System.out.println("Sedinta editata: ID " + sedintaId);
                return;
            }
        }
        System.out.println("Sedinta cu ID " + sedintaId + " nu a fost gasita.");
    }

    public void genereazaRaport() {
        System.out.println("Raport pentru calendar la data: " + data);
        for (Sedinta sedinta : sedinte) {
            System.out.println("Sedinta ID: " + sedinta.getIdSedinta() + ", Titlu: " + sedinta.getTopic() +
                    ", Data: " + sedinta.getData() + ", Status: " + sedinta.getStatus());
        }
    }
}
