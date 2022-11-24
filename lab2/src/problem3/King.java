package problem3;

public class King extends Piece{
	public King() {
		super();
	}
	public King(Color color, Position a) {
		super(color, a);
	}
	public boolean checkValid(Position a, Position b) {
		return a.checkValidPosition() && b.checkValidPosition();
	}
	public String name() {
		return "KING";
	}
	@Override
	public boolean isLegalMove(Position b) {
		return checkValid(super.getPosition(), b) && 
				(Math.abs(super.getPosition().xAxis() - b.xAxis()) <= 1 && 
				Math.abs(super.getPosition().yAxis() - b.yAxis()) <= 1);
	}
}
