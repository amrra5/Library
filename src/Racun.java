
public class Racun {

	private int brRacuna;
	private String imeKorisnika;
	private int brPosudjenihKnjiga;
	
	Racun(){
		
	}
	
	Racun(int brRacuna, String imeKorisnika){
		this.brRacuna = brRacuna;
		this.imeKorisnika = imeKorisnika;
		brPosudjenihKnjiga = 0;
	}

	public int getBrRacuna() {
		return brRacuna;
	}

	public void setBrRacuna(int brRacuna) {
		this.brRacuna = brRacuna;
	}

	public String getImeKorisnika() {
		return imeKorisnika;
	}

	public void setImeKorisnika(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
	}

	public int getBrPosudjenihKnjiga() {
		return brPosudjenihKnjiga;
	}

	public void setBrPosudjenihKnjiga(int brPosudjenihKnjiga) {
		this.brPosudjenihKnjiga = brPosudjenihKnjiga;
	}

	@Override
	public String toString() {
		return "Racun [brRacuna=" + brRacuna + ", imeKorisnika=" + imeKorisnika
				+ ", brPosudjenihKnjiga=" + brPosudjenihKnjiga + "]";
	}
	
	
	
	
	
}
