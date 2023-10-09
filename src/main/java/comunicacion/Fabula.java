package comunicacion;

public class Fabula extends Escrito {

	private String ensenanza;
	private String interpretacion;
	
	public Fabula (String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	public String interpretacion() {
		return getInterpretacion();
	}
	public String toString() {
		String informacion = getOrigen()+ "\n"+getTitulo()+"\n"+ getAutor()+ "\n"+getPaginas()+"\n"+ getEnsenanza();
		return informacion;
	}
	public int palabrasTotales(int paginas) {
		int numeroPalabras = getPaginas()*paginas*1;
		return numeroPalabras;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}
	public void setEnseñanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
