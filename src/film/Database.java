package film;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	private Connection connection;

	public Database (){
		createConnection();
	}
	
	public void createConnection(){
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cliente", "root" , "emmeesse90");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void insertFilm(Film f){
		
		String sql = "INSERT INTO film VALUES('" + f.getTitolo() + "','" + f.getRegista() + "'," + 
		        f.getAnno() + ",'" + f.getGenere() + "'," + f.getValutazione() + ")";
		Statement statement = null;
		
		try {
			
			statement = connection.createStatement();
			statement.executeUpdate(sql);
			System.out.println(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}
	
    public void deleteFilm(String titolo){
		
		String sql = "DELETE FROM film WHERE titolo = '" + titolo + "'";
		Statement statement = null;
		
		try {
			
			statement = connection.createStatement();
			statement.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}
    
    public void findFilmByDirector(String director){
		
		String sql = "SELECT titolo, regista, anno, genere, valutaz FROM film WHERE regista = '" + 
		director + "'";
		Statement statement = null;
		
		try {
			
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
	        while (rs.next()) {
	            String titolo = rs.getString("titolo");
	            String regista = rs.getString("regista");
	            int anno = rs.getInt("anno");
	            String genere = rs.getString("genere");
	            float valutazione = rs.getFloat("valutaz");
	            System.out.println(titolo + ", " + regista +", " + anno + ", " + genere +", " + valutazione);
	        }

			
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}
    
    public void changeRate(String titolo, float valutazione){
    }
	
	
}
