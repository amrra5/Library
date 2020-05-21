
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		ManagingClass manager = new ManagingClass();
		
		Path path = Paths.get("korisnici.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		BufferedWriter writer = Files.newBufferedWriter(path);

		while (true) {
			System.out.println("\n*******Biblioteka********");
			System.out
					.println("\n1- KREIRANJE RACUNA\n2- KREIRANJE KNJIGE\n3- PODIZANJE KNJIGE\n4- VRACANJE KNJIGE\n5- STATUS RACUNA\n6- EXIT");
			int izbor = sc.nextInt();
			if (izbor == 1) {
				System.out.println("Unesite broj racuna:");
				int unosBrRacuna = sc.nextInt();
				while (unosBrRacuna < 0) {
					System.out
							.println("Broj racuna ne smije biti negativan, pokusajte ponovo:");
					unosBrRacuna = sc.nextInt();
				}
				while (manager.validacijaRacuna(unosBrRacuna) == -1) {
					System.out
							.println("Broj racuna vec postoji u sistemu, pokusajte ponovo:");
					unosBrRacuna = sc.nextInt();
				}
				System.out.println("Unesite ime korisnika:");
				String unosIme = sc.next();

				manager.racuni.add(new Racun(unosBrRacuna, unosIme));
				for(Racun e: manager.racuni){
					if(e.getBrRacuna()!=unosBrRacuna){
						writer.write(manager.racuni.toString());
						writer.newLine();
					}
				}
				System.out.println("Racun uspjesno kreiran!");

			} else if (izbor == 2) {
				System.out.println("Unesite broj knjige:");
				int unosBrKnjige = sc.nextInt();
				while (unosBrKnjige < 0) {
					System.out
							.println("Broj knjige ne smije biti negativan, pokusajte ponovo:");
					unosBrKnjige = sc.nextInt();
				}
				while (manager.validacijaKnjige(unosBrKnjige) == -1) {
					System.out
							.println("Broj knjige vec postoji u sistemu, pokusajte ponovo:");
					unosBrKnjige = sc.nextInt();
				}

				System.out.println("Unesite naziv knjige:");
				String unosIme = sc.next();

				manager.knjige.add(new Knjiga(unosBrKnjige, unosIme));
				System.out.println("Knjiga uspjesno kreirana!");

			} else if (izbor == 3) {
				System.out.println("Unesite broj racuna:");
				int unosRacuna = sc.nextInt();
				while (manager.vazeciRacun(unosRacuna) == -1) {
					System.out
							.println("Nevazeci broj racuna, pokusajte ponovo:");
					unosRacuna = sc.nextInt();
				}
				System.out.println("Unesite broj knjige:");
				int unosKnjige = sc.nextInt();
				int brojac = 0;
				while (manager.vazecaKnjiga(unosKnjige) == -1) {
					System.out
							.println("Nevazeci broj knjige, pokusajte ponovo:");
					unosKnjige = sc.nextInt();
					if (manager.isKnjigaIzdata(unosKnjige) == -1) {
						System.out.println("Knjiga je vec izdata!");
						brojac++;
					}

					if (manager.validacijaBrojaKnjiga(unosRacuna) == -1) {
						System.out.println("Racun vec ima 3 posudjene knjige!");
						brojac++;
					}

				}
				if (brojac == 0) {
					manager.zapisnik.add(new PodizanjeKnjige(unosRacuna,
							unosKnjige));
					System.out.println("Knjigu " + unosKnjige
							+ " zaduzio racun: " + unosRacuna);
					manager.posudiKnjigu(unosRacuna, unosKnjige);

				}

			} else if (izbor == 4) {
				System.out.println("Unesite broj racuna:");
				int unosRacuna = sc.nextInt();
				while (manager.vazeciRacun(unosRacuna) == -1) {
					System.out
							.println("Nevazeci broj racuna, pokusajte ponovo:");
					unosRacuna = sc.nextInt();
				}
				System.out.println("Unesite broj knjige:");
				int unosKnjige = sc.nextInt();

				while (manager.vazecaKnjiga(unosKnjige) == -1) {
					System.out
							.println("Nevazeci broj knjige, pokusajte ponovo:");
					unosKnjige = sc.nextInt();
				}
				manager.vratiKnjigu(unosRacuna, unosKnjige);
			} else if (izbor == 5) {
				System.out.println("Unesite broj racuna:");
				int brRacuna = sc.nextInt();
				for (Racun e : manager.racuni) {
					if (e.getBrRacuna() == brRacuna) {
						System.out.println(e.toString());
					}
				}
			} else {
				System.exit(izbor);
			}

		}
	}

}
