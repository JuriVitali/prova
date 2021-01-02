package Figure;

public class Rettangolo extends Figura {
	int base,altezza;
	
	//costruttori
	Rettangolo() {base=0;altezza=0;}
	Rettangolo(int b) {base=b;altezza=0;}
	Rettangolo(int b,int a) {base=b;altezza=a;}
	
	//metodi per modificare base o altezza
	public void setb(int b) {base=b;}
	public void seta(int a) {altezza=a;}
	
	//metodi per ricevere in output base o altezza
	public int getb() {return base;}
	public int geta() {return altezza;}
	
	//metodi per calcolo area e perimetro
	double area() {return base*altezza;}
	double perimetro() {return (base+altezza)*2;}
}
