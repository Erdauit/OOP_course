package Problem1;

public class Sphere extends Shapes{
	
	public Sphere() {
		super();
	}
	
	public Sphere(int radius) {
		super(radius);
	}
	
	
	@Override
	double getVolume() {

		return 4/3 * Pi * Math.pow(shape, 3);
		
	}

	@Override
	double getAreaSurface() {
		
		return 4 * Pi * Math.pow(shape, 2);
		
	}
	public String toString() {
		return "Volume: "+getVolume()+"\n"+"Area Surface: "+getAreaSurface();
	}
}
