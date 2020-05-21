import java.util.Date;


public class PodizanjeKnjige {

	private int brojRacuna;
	private int brojKnjige;
	private Date datumPosudjivanja;
	
	PodizanjeKnjige(){
		
	}
	
	PodizanjeKnjige(int brojRacuna, int brojKnjige){
		this.brojRacuna = brojRacuna;
		this.brojKnjige = brojKnjige;
		this.datumPosudjivanja = new Date();
	}

	public int getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public int getBrojKnjige() {
		return brojKnjige;
	}

	public void setBrojKnjige(int brojKnjige) {
		this.brojKnjige = brojKnjige;
	}

	public Date getDatumPosudjivanja() {
		return datumPosudjivanja;
	}

	public void setDatumPosudjivanja(Date datumPosudjivanja) {
		this.datumPosudjivanja = datumPosudjivanja;
	}

	@Override
	public String toString() {
		return "PodizanjeKnjige [brojRacuna=" + brojRacuna + ", brojKnjige="
				+ brojKnjige + ", datumPosudjivanja=" + datumPosudjivanja + "]";
	}
	
	
	
}
