package Problem1;

abstract public class Shapes {
	public int shape;
	public final double Pi = 3.14;
	
	public Shapes() {
	}
	
	public Shapes(int shape) {
		this.shape = shape;
	}
	
	abstract double getVolume();
	
	abstract double getAreaSurface();
	
	
}
