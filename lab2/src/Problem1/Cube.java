package Problem1;

public class Cube extends Shapes{
	public Cube() {
		super();
	}
	
	public Cube(int a) {
		super(a);
	}
	
	@Override
	double getVolume() {

		return shape * shape * shape;
		
	}

	@Override
	double getAreaSurface() {
		return 6 * Math.pow(shape, 2);
	}
	
	public String toString() {
		return "Volume: "+getVolume()+"\n"+"Area Surface: "+getAreaSurface();
	}
}
