package problem3;

public class Knight extends Piece{
	public Knight() {
		super();
	}
	public Knight(Color color, Position a) {
		super(color, a);
	}
	public boolean checkValid(Position a, Position b) {
		return a.checkValidPosition() && b.checkValidPosition();
	}
	public String name() {
		return "KNIGHT";
	}
	@Override
	public boolean isLegalMove(Position b) {
		return checkValid(super.getPosition(), b) && 
				((Math.abs(super.getPosition().xAxis() - b.xAxis()) == 2 && 
				Math.abs(super.getPosition().yAxis() - b.yAxis()) == 1) || (Math.abs(super.getPosition().xAxis() - b.xAxis()) == 1 &&
				Math.abs(super.getPosition().yAxis() - b.yAxis()) == 2));
	}
	
}
