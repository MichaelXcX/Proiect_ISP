package Classes;

public class Invitatie {
    private int id;
    private int meetingId;
    private Status status;

    public Invitatie(int id, int meetingId) {
        this.id = id;
        this.meetingId = meetingId;
        this.status = Status.CREAT;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void afisare() {
        System.out.println("Id: " + id);
        System.out.println("Meeting id: " + meetingId);
        System.out.println("Status: " + status);
        System.out.println();
    }
}
