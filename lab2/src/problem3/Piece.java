package problem3;

import java.util.Objects;

abstract public class Piece {
	
	private Color color;
	private Position positionA;
	
	public Piece() {
		
	}
	
	public Piece(Color color, Position a) {
		this.positionA = a;
		this.color = color;
	}
	
	public Position getPosition() {
		return positionA;
	}
	
	public Color getColor() {
		return color;
	}
	public abstract String name(); 
	
	public abstract boolean isLegalMove(Position b);
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Piece p = (Piece)o;
		return this.positionA == p.positionA && this.color == p.color;
	}
	
	public int hashCode() {
		return Objects.hash(positionA, color);
	}
}
