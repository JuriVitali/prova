package Figure;

/**
 * Descrive un cerchio
 * 
 * @author juriv
 * 
 */
public class Cerchio extends Figura {
	/**
	 * Constante pi greco
	 */
	final double pi=3.14;
	/**
	 * Descrive il raggio del cerchio
	 */
	private int raggio;
	
	/**
	 * Costruttore senza parametri che setta il raggio a 0
	 */
	Cerchio() {raggio=0;}
	/**
	 * Costruttore che permette di decidere il raggio
	 * 
	 * @param r descrive il raggio
	 */
	Cerchio(int r) {raggio=r;}
	
	/**
	 * Setta il raggio
	 * @param r descrive il raggio
	 */
	public void setr(int r) {raggio=r;}
	
	/**
	 * Permette di ottenere il raggio
	 * 
	 * @return il raggio
	 */
	public int getr() {return raggio;}
	
	/**
	 * Permette di ottenere l'area
	 * 
	 * @return area del cerchio
	 */
	double area() {return raggio*raggio*pi;}
	
	/**
	 * Permette di ottenere il perimetro del cerchio
	 * 
	 * @return perimetro del cerchio
	 */
	double perimetro() {return 2*pi*raggio;}
}
