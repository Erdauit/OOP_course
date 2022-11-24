package problem3;

public class Rook extends Piece{

	public Rook() {
		super();
	}
	public Rook(Color color, Position a) {
		super(color, a);
	}
	public boolean checkValid(Position a, Position b) {
		return a.checkValidPosition() && b.checkValidPosition();
	}
	public String name() {
		return "ROOK";
	}
	public boolean isLegalMove(Position b) {
		return checkValid(super.getPosition(), b) && (super.getPosition().xAxis() == b.xAxis() || super.getPosition().yAxis() == b.yAxis());
	}

}
