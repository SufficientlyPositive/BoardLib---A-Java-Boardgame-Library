import java.lang.StringBuilder;


/**
 * Class, for holding tile instances, should include the following functions:
 * 
 * move(*some coordinates*, *some coordinates*)
 * isPiece(*some coordinates*) return boolean
 * euclideanDistance(*some coordinates*, *some coordinates*) return integer
 * validMove(*some coordinates*, *some coordinates*) return boolean
 * onBoard(*some coordinates*)
 * getTileAt(*some coordinates*) return Tile
 * createBoard(*some array of tiles?*) - constructor
 * createCheckerBoard(integer, integer) - constructor v2
 * printBoard()
 */

public class Board {

    private Tile[][] boardTiles;
    private int boardWidth;
    private int boardHeight;
    private boolean looping;

    /**
     * Defaults to 8x8 board (change method later?)
     * Has knights on first row and back row
     */
    public Board() {

        this.boardHeight = 8;
        this.boardWidth = 8;
        this.looping = false;

        this.boardTiles = new Tile[boardHeight][boardWidth];

        for(int i = 0; i < this.boardHeight; i++) {
            for(int j = 0; j < this.boardWidth; j++) {
                this.boardTiles[i][j] = new Tile();
            }
        }

        for(int j = 0; j < boardHeight; j+=(boardHeight-1)) {
            for(int i = 0; i < boardWidth; i++) {
                this.boardTiles[j][i].placePiece();
            }
        }
    }

    /**
     * printBoard puts the board into console with the least fuss possible
     * only prints 1 letter per tile/piece
     */
    public void printBoard() {
        StringBuilder printStr = new StringBuilder();

        String non = "_";
        String Id;

        for(Tile[] tileArr : this.boardTiles) {
            for(Tile tile : tileArr) {

                Id = tile.piece.getID();

                if(!Id.equals("null")) {
                    printStr.append(Id);
                } else {
                    printStr.append(non);
                }
            }
            printStr.append("\n");
        }

        System.out.print(printStr);
    }



    /**
     * isPiece returns whether a piece is at a certain point in the board,
     * Board coordinates start from 1.
     * 
     * @param x - the x coordinate on the board (which row to check)
     * @param y - the y coordinate on the board (which column to check)
     * @return - whether there is a piece at [x][y]
     */
    public boolean isPiece(int x, int y) {
        return getTileAt(x-1, y-1).hasPiece();
    }

    /**
     * move just moves a piece from one place to the next, it does not check if it is a valid move, only if the move is within board boundaries
     * 
     * @param originX x position of the piece
     * @param originY y position of the piece
     * @param destX x position of the movement
     * @param destY y position of the movement
     */
    public void move(int originX, int originY, int destX, int destY) {
        if(onBoard(originX, originY) && onBoard(destX, destY)) {
            this.boardTiles[destX-1][destY-1].placePiece();
            this.boardTiles[originX-1][originY-1].removePiece();
        }
    }

    /**
     * getTileAt gives the Tile object at a specific coordinate.
     * 
     * @param x - which row to look in
     * @param y - which column to look in
     * @return - the Tile object at x, y.
     */
    private Tile getTileAt(int x, int y) {
        return this.boardTiles[x][y];
    }

    /**
     * onBoard gets given a coordinate and returns whether the coordinate is on the board
     * 
     * @param x - the height of the given coordinate (which row is it in).
     * @param y - how far along the row the piece is.
     * @return - whether the coordinate is valid.
     */
    private boolean onBoard(int x, int y) {
        if(!this.looping) {
            return x <= boardHeight &&
                   x > 0            &&
                   y <= boardWidth  &&
                   y > 0;
        }
        return true;
    }

    public static void main(String[] arr) {
        Board board = new Board();
        board.printBoard();

        board.move(8,1,6,1);
        board.printBoard();
    }

}