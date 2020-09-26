public class NullPiece extends Piece{

    private final String ID = "null";

    protected String getID() {
        return ID;
    }

    protected boolean validMove(int currX, int currY, int movX, int movY) {
        return false;
    }

}
