/**
 * Example Piece subclass for Knight in chess.
 */

public class Knight extends Piece{

    private final String ID = "K";

    protected String getID() {
        return ID;
    }

    protected boolean validMove(int currX, int currY, int movX, int movY) {
        return (Math.abs(movX - currX) == 2) && 
               (Math.abs(movY - currY) == 1)
               ||
               (Math.abs(movX - currX) == 1) &&
               (Math.abs(movY - currY) == 2);
    }

}
