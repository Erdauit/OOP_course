package problem3;

public class Pawn extends Piece{

	public Pawn() {
		super();
	}
	public Pawn(Color color, Position a) {
		super(color, a);
	}
	public boolean checkValid(Position a, Position b) {
		return a.checkValidPosition() && b.checkValidPosition();
	}
	public String name() {
		return "PAWN";
	}
	@Override
	public boolean isLegalMove(Position b) {
		if(checkValid(super.getPosition(), b)) {
			if(super.getPosition().xAxis() == b.xAxis()) {
				if(super.getPosition().yAxis() + 1 == b.yAxis() || super.getPosition().yAxis() + 2 == b.yAxis()) {
					return true;
				}
			}
		}
		return false;
	}
}
