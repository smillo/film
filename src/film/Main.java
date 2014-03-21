package film;

public class Main {
	
	public static void main(String[] args) {
		
		Database database = new Database();
		short choice = Menu.printMenu();
		
		while (choice != Menu.exit){
			switch(choice){
				case Menu.insertFilm:
					Film film = Menu.insertFilm();
					database.insertFilm(film);
				break;
				case Menu.deleteFilm:
					String titolo = Menu.DeleteFilm();
					database.deleteFilm(titolo);
				break;
				case Menu.findFilm:
					String director = Menu.findFilmByDirector();
					database.findFilmByDirector(director);
				break;
				case Menu.changeRate:
					String tit = Menu.getTitolo();
					float valutazione = Menu.getValutazione();
					database.changeRate(tit, valutazione);
				break;
			}
			choice = Menu.printMenu();
		}
		
		
		
	}
	
	

}
