public class Tile {

    public final String name;
    public final String colourID;

    /**
     * Tile() - constructor for a default "null" tile. It has a black background by default.
     * Board objects initialise with a board of default tiles.
     */
    protected Tile() {

        this.name = "nullTile";
        this.colourID = ConsoleColours.BLACK_BACKGROUND;

    }

    /**
     * Tile() - constructor for a more customisable tile.
     * 
     * @param name - the name parameter, for identifying the tile in any game logic.
     * @param colourID - the ANSI colour code for printing colour to console.
     */
    public Tile(String name, String colourID) {

        this.name = name;
        this.colourID = colourID;

    }
}
