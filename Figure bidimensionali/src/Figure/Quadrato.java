package Figure;

public class Quadrato extends Rettangolo {
	//costruttori
		Quadrato() {base=0;altezza=0;}
		public Quadrato(int l) {base=l;altezza=0;}
		
	//metodi per modificare e ricevere in output il lato
		public void setl(int l) {base=l;}
		public int getl() {return base;}
		
	//metodi per calcolo dell'area e del perimetro
		double perimetro() {return base*4;}
		double area() {return base*base;}
	
}
