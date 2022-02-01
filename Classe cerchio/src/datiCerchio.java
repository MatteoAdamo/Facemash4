public class datiCerchio{
	 
	double raggio;
	
	public datiCerchio(double raggio, double l2, double l3) {
		super();
		this.raggio = raggio;
	}
	
	public double Ccirconferenza(double raggio) {
		double circonferenza=0;
		 circonferenza =raggio * 3.14;
		 return circonferenza;
	}
	public double Carea(double raggio) {
		double area=0;
		area= (raggio*raggio*3.14);
		return area;
	}
}