package Problem1;

public class Test {

	public static void main(String[] args) {
		Shapes a = new Cube(4);
		Shapes b = new Cylinder(4, 2);
		Shapes c = new Sphere(4);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}

}
