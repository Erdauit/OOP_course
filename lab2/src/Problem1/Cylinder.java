package Problem1;

public class Cylinder extends Shapes {
	int h;
	public Cylinder() {
		super();
	}
	
	public Cylinder(int h, int radius) {
		super(radius);
		this.h = h;
	}
	
	
	@Override
	double getVolume() {

		return Pi * Math.pow(shape, 2) * h;
		
	}

	@Override
	double getAreaSurface() {
		
		return 2 * Pi * Math.pow(shape, 2) + 2 * Pi * shape * h;
		
	}
	public String toString() {
		return "Volume: "+getVolume()+"\n"+"Area Surface: "+getAreaSurface();
	}
	
	
}
