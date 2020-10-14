import java.util.Objects;

public class Piece {
    
    //player should start from 1
    public final int player;

    public final String name;
    public final String colourID;

    //prnt is used for printing inside Board class
    public final char prnt;




    /**
     * Piece() - constructor for default "null" piece, has white text colour by default.
     * Board objects initialise with a board full of default pieces
     */
    public Piece() {

        this.player = 0;
        this.name = "nullPiece";
        this.colourID = ConsoleColours.WHITE;
        this.prnt = '_';

    }

    /**
     * Piece() - constructor taking 3 arguments, prnt variable is decided automatically by taking the first non-space character of the name
     * 
     * @param name name of the piece, for use in game rule logic, not null required
     * @param player which player the piece belongs to, must be greater than zero
     * @param colourID the colourID to print the piece in, not null required - if you want it to work correctly it should be colour code.
     */
    public Piece(String name, int player, String colourID) {

        Objects.requireNonNull(name, "Name string must not be null");
        Objects.requireNonNull(colourID, "ColourID string must not be null");

        if(!(player > 0)) {
            throw new IllegalArgumentException("Player number must be above 0!");
        }

        this.name = name;
        this.player = player;
        this.colourID = colourID;

        this.prnt = name.strip().charAt(0);
    }

    /**
     * Piece() - constructor taking all 4 arguments
     * 
     * @param name name of the piece, for use in game rule logic, not null required
     * @param prnt the character to print to the board
     * @param player which player the piece belongs to, must be greater than zero
     * @param colourID the colourID to print the piece in, not null required - if you want it to work correctly it should be colour code.
     */
    public Piece(String name, char prnt, int player, String colourID) {

        Objects.requireNonNull(name, "Name string must not be null");
        Objects.requireNonNull(colourID, "ColourID string must not be null");

        if(!(player > 0)) {
            throw new IllegalArgumentException("Player number must be above 0!");
        }

        this.name = name;
        this.player = player;
        this.colourID = colourID;
        this.prnt = prnt;
    }

}
