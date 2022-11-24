package problem3;

public class Position {
	private int x;
	private int y;
	public Position(){};
	public Position(String pos) {
		x = pos.charAt(0) - 'a' + 1;
		y = pos.charAt(1) - '0';
	}
	public void setPosition(String pos) {
		x = pos.charAt(0) - 'a' + 1;
		y = pos.charAt(1) - '0';
	}
	public boolean checkValidPosition() {
		if(this.x > 0 && this.x < 8 && this.y < 8 && this.y > 0) {
			return true;
		}
		return false;
	}
	public int xAxis() {
		return x;
	}
	public int yAxis() {
		return y;
	}
 	
}
