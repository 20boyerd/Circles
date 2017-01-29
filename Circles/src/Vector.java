public class Vectors {
	private double x;
	private double y;
	
	public Vectors(){
		x = 0;
		y = 0;
	}
	
	public Vectors(double x, double y){
		x = this.x;
		y = this.y;
	}

	public Vectors(double t){
		x = Math.cos(t);
		y = Math.sin(t);
	}
}
