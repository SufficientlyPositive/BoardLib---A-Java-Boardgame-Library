/**
 * SuperClass for storing pieces, each piece should have it's own movement rules and it's own general id to display it on the board
 * 
 * validMove return boolean
 * getID return String
 */

public abstract class Piece {
    
    protected abstract String getID();
    protected abstract boolean validMove(int currX, int currY, int movX, int movY);

}
