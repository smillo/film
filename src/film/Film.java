package film;

public class Film {
	
	private String titolo;
	private String regista;
	private int anno;
	private String genere;
	private float valutazione;
	
	public Film(String t, String r, int a, String g, float v){
		setTitolo(t);
		setRegista(r);
		setAnno(a);
		setGenere(g);
		setValutazione(v);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public float getValutazione() {
		return valutazione;
	}

	public void setValutazione(float valutazione) {
		this.valutazione = valutazione;
	}
	
}
