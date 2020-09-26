
/**
 * Class, for holding tile instances, should include the following functions:
 * 
 * move(*some coordinates*, *some coordinates*) return boolean
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

    /**
     * Defaults to 8x8 board (change method later?)
     */
    public Board() {

        this.boardHeight = 8;
        this.boardWidth = 8;

        this.boardTiles = new Tile[boardHeight][boardWidth];

        for(int i = 0; i < 8; i++) {
            for(int j = 0; i < 8; i++) {
                this.boardTiles[i][j] = new Tile();
            }
        }
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

        return getTileAt(x-1, y-1).hasPiece;
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

    
}