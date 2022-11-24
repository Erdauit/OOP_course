package problem3;

import java.util.Vector;

public class Test {

	  public static void main(String[] args) {
	    
	    Vector<Piece> pieces = new Vector<Piece>();
	    
	    Piece p1 = new Pawn(Color.BLACK, new Position("d2"));
	    Piece p2 = new Pawn(Color.BLACK, new Position("b2"));
	    Piece p3 = new Queen(Color.WHITE, new Position("d1"));
	    Piece p4 = new King(Color.BLACK, new Position("e8"));
	    Piece p5 = new Knight(Color.BLACK, new Position("b1"));
	    Piece p6 = new Bishop(Color.WHITE, new Position("b4"));
	    
	    
	    pieces.add(p1);
	    pieces.add(p2);
	    pieces.add(p3);
	    pieces.add(p4);
	    pieces.add(p5);
	    pieces.add(p6);
	    
	    
	    Position checkPos = new Position("b4");
	    
	    for(Piece p : pieces) {
	      System.out.println( p.name());
	      if(p.isLegalMove(checkPos)) {
	        System.out.println("Yes you can move with " + p.name() + " from " + p.getPosition() + " to " + checkPos);
	      }
	      else {
	        System.out.println("Oh no, it doesn't allowed to move here");
	      }
	    }
	    
	    
	    
	    
	    
	  }

}
