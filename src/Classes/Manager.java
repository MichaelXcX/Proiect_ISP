package Classes;

public class Manager extends Angajat{
	public Manager(String nume, int idAngajat) {
		super(nume, idAngajat);
	}
	
	public void aprobaSedinta(Sedinta sedinta) {
		sedinta.setStatus(StatusSedinta.NEINCEPUTA);
	}
	
	public void anuleazaSedinta(Sedinta sedinta) {
		
	}
	
	public void reprogrameazaSedinta(Sedinta sedinta, String data) {
		sedinta.setData(data);
	}
}
