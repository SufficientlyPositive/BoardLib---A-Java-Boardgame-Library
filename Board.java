
/**
 * Class, for holding tile instances, should include the following functions:
 * 
 * move(*some coordinates*, *some coordinates*) return boolean
 * isPiece(*some coordinates*) return boolean
 * euclideanDistance(*some coordinates*, *some coordinates*) return integer
 * validMove(*some coordinates*, *some coordinates*) return boolean
 * getTileAt(*some coordinates*) return Tile
 * createBoard(*some array of tiles?*)
 * createCheckerBoard(integer, integer)
 * printBoard()
 */

public class Board {

    /**
     * Tile array from which to access the board tiles.
     */
    private Tile[][] boardTiles;

    /**
     * Defaults to 8x8 board (change method later?)
     */
    public Board() {

        this.boardTiles = new Tile[8][8];

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
    public static boolean isPiece(int x, int y) {

        //return getTileAt(x-1, y-1).hasPiece;

        return false;
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