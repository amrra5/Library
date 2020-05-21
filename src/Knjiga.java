
public class Knjiga {

	private int brKnjige;
	private String imeKnjige;
	private boolean izdata;
	
	Knjiga(){
		
	}
	
	Knjiga(int brKnjige, String imeKnjige){
		this.brKnjige = brKnjige;
		this.imeKnjige = imeKnjige;
		izdata = false;
	}


	public int getBrKnjige() {
		return brKnjige;
	}

	public void setBrKnjige(int brKnjige) {
		this.brKnjige = brKnjige;
	}

	public String getImeKnjige() {
		return imeKnjige;
	}

	public void setImeKnjige(String imeKnjige) {
		this.imeKnjige = imeKnjige;
	}

	public boolean isStatusKnjige() {
		return izdata;
	}

	public void setIzdata(boolean izdata) {
		this.izdata = izdata;
	}

	@Override
	public String toString() {
		return "Knjiga [brKnjige=" + brKnjige + ", imeKnjige=" + imeKnjige
				+ ", statusKnjige=" + izdata + "]";
	}
	
	
	
	
}
