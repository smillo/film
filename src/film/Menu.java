package film;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
	
	public static final short exit = 0;
	public static final short insertFilm = 1;
	public static final short deleteFilm = 2;
	public static final short findFilm = 3;
	public static final short changeRate = 4;
	

	
	public static short printMenu(){
		
		short choice = -1;
		String line = "-1";
		while(choice < 0 || choice > 4){
			
			System.out.println("0. Exit");
			System.out.println("1. Insert Film");
			System.out.println("2. Delete Film");
			System.out.println("3. Find Film By Director");
			System.out.println("4. Change Rate");
		
			BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
			try {
				line = bufferedreader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			choice = Short.parseShort(line);
		}
		
		return choice;
	}
	
	public static Film insertFilm(){
		String titolo = "";
		String regista = "";
		int anno = 0;
		String genere = "";
		float valutazione = 0;
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("titolo: ");
			titolo = bufferedreader.readLine();
			System.out.println("regista: ");
			regista = bufferedreader.readLine();
			System.out.println("anno: ");
			anno = Integer.parseInt(bufferedreader.readLine());
			System.out.println("genere: ");
			genere = bufferedreader.readLine();
			System.out.println("valutazione: ");
			valutazione = Float.parseFloat(bufferedreader.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Film(titolo, regista, anno, genere, valutazione);
	}
	
	public static String DeleteFilm(){
		String titolo = "";
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("titolo: ");
			titolo = bufferedreader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return titolo;
	}
	
	public static String findFilmByDirector(){
		String director = "";
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("regista: ");
			director = bufferedreader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return director;
	}
	
	public static String getTitolo(){
		String titolo = "";
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("titolo: ");
			titolo = bufferedreader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return titolo;
	}
	
	public static float getValutazione(){
		float valutazione = 0;
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("valutazione: ");
			valutazione = Float.parseFloat(bufferedreader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return valutazione;
	}
	
}
