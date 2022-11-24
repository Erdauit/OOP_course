package problem3;

public class Bishop extends Piece{
	public Bishop() {
		super();
	}
	public Bishop(Color color, Position a) {
		super(color, a);
	}
	public boolean checkValid(Position a, Position b) {
		return a.checkValidPosition() && b.checkValidPosition();
	}
	public String name() {
		return "BISHOP";
	}
	public boolean isLegalMove(Position b) {
		return checkValid(super.getPosition(), b) && 
				(Math.abs(super.getPosition().xAxis() - b.xAxis()) == Math.abs(super.getPosition().yAxis() - b.yAxis()));
	}
}
