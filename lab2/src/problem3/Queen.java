package problem3;

public class Queen extends Piece{
	public Queen() {
		super();
	}
	public Queen(Color color, Position a) {
		super(color, a);
	}
	public boolean checkValid(Position a, Position b) {
		return a.checkValidPosition() && b.checkValidPosition();
	}
	public String name() {
		return "QUEEN";
	}
	@Override
	public boolean isLegalMove(Position b) {
		return checkValid(super.getPosition(), b) && (new Rook(super.getColor(), super.getPosition()).isLegalMove(b) || new Bishop(super.getColor(), super.getPosition()).isLegalMove(b));
	}
}
