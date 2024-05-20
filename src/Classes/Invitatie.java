package Classes;

public class Invitatie {
	private int id;
	private int meetingId;
	private Status status;
	
	public Invitatie(int id, int meetingId) {
		this.id = id;
		this.meetingId = meetingId;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
}
