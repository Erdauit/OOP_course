package Problem2;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet <Apple> ppp= new HashSet <Apple>();
		Apple a = new Macbook("Black", 2021, 13);
		Apple b = new Iphone("Black", 2012, 8);	
		Apple c = new Macbook("Black", 2000, 13);
		Apple b1 = new Iphone("Black", 2012, 8);	
		ppp.add(a);
		ppp.add(b);
		ppp.add(c);
		ppp.add(b1);
		System.out.print(ppp.size());
		
		
		for (Apple p: ppp) {
			if(p instanceof Iphone) {
				Iphone p2 = (Iphone) p;
				p2.getCall();
			}
			else if (p instanceof Macbook) {
				Macbook p2 = (Macbook) p;
				p2.getCoding();
			}
		}
	}

}
