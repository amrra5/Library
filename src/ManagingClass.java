import java.util.ArrayList;

public class ManagingClass {

	ArrayList<Racun> racuni = new ArrayList<>();
	ArrayList<Knjiga> knjige = new ArrayList<>();
	ArrayList<PodizanjeKnjige> zapisnik = new ArrayList<>();

	public void posudiKnjigu(int brRacuna, int brKnjige) {
		for (Racun e : racuni) {
			if (e.getBrRacuna() == brRacuna) {
				int ukupanBrKnjiga = e.getBrPosudjenihKnjiga();
				ukupanBrKnjiga++;
				e.setBrPosudjenihKnjiga(ukupanBrKnjiga);
			}
		}
		for (Knjiga f : knjige) {
			if (f.getBrKnjige() == brKnjige) {
				f.setIzdata(true);
			}
		}
	}

	public void vratiKnjigu(int brRacuna, int brKnjige) {
		for (Racun e : racuni) {
			if (e.getBrRacuna() == brRacuna) {
				int ukupanBrKnjiga = e.getBrPosudjenihKnjiga();
				ukupanBrKnjiga--;
				e.setBrPosudjenihKnjiga(ukupanBrKnjiga);
			}
		}
		for (Knjiga f : knjige) {
			if (f.getBrKnjige() == brKnjige) {
				f.setIzdata(false);
			}
		}
	}

	public int isKnjigaIzdata(int broj) {
		for (Knjiga e : knjige) {
			if (e.getBrKnjige() == broj) {
				if (e.isStatusKnjige() == true) {
					return -1;
				}
			}
		}
		return 0;
	}

	public int validacijaBrojaKnjiga(int broj) {
		for (Racun e : racuni) {
			if (e.getBrRacuna() == broj) {
				if (e.getBrPosudjenihKnjiga() == 3) {
					return -1;
				}
			}
		}
		return 0;
	}

	public int vazecaKnjiga(int broj) {
		for (Knjiga e : knjige) {
			if (e.getBrKnjige() == broj) {
				return 0;
			}
		}
		return -1;
	}

	public int vazeciRacun(int broj) {
		for (Racun e : racuni) {
			if (e.getBrRacuna() == broj) {
				return 0;
			}
		}
		return -1;
	}

	public int validacijaKnjige(int broj) {
		for (Knjiga e : knjige) {
			if (e.getBrKnjige() == broj) {
				return -1;
			}
		}
		return 0;
	}

	public int validacijaRacuna(int broj) {
		for (Racun e : racuni) {
			if (e.getBrRacuna() == broj) {
				return -1;
			}
		}
		return 0;
	}
}
