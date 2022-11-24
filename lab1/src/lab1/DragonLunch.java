package lab1;
import java.util.*;

public class DragonLunch {
	private Vector <Person> kidnapped = new Vector <Person>();
	int couple;
	
	public void kidnap(Person p) {
		kidnapped.add(p);
	}
	
	public boolean willDragonEatOrNot() {
		int peoples = 0;
		for(Person p: kidnapped) {
			if (p.gender == Gender.BOY) peoples++;
			else {
			if (peoples == 0) {
				return false;
			} else {
				peoples--;
				couple++;
				}
			}
		}
		if (couple * 2 == kidnapped.size()) return true;
		else return false;
	
	}
	
	public String toString() {	
		if (willDragonEatOrNot() == true) {
			return "Students survived!!..";
		} else {
			return "No one survived in KBTU...";
		}
	}
}

