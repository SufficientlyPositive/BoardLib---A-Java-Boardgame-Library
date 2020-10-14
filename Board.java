public class Board {
    
    private Piece[][] pieceBoard;
    private Tile[][] tileBoard;
    
    private String labels;

    public final int height;
    public final int width;

    public Board(int height, int width) {

        this.height = height;
        this.width = width;
        this.pieceBoard = new Piece[height][width];
        this.tileBoard = new Tile[height][width];

        this.initBoard();
        this.createLabels();
    }

    //print board to console
    public void printBoard() {

        StringBuilder toPrint = new StringBuilder();

        toPrint.append(this.labels);

        for(int i = 0; i < height; i++) {
            toPrint.append(" ").append(i+1).append(" ");

            for(int j = 0; j < width; j++) {
                toPrint.append(this.pieceBoard[i][j].prnt);
                toPrint.append(" ");
            }

            toPrint.append(i+1).append("\n");
        }

        toPrint.append(this.labels).append("\n");

        System.out.println(toPrint);
    }

    //print board with colour
    public void printBoardC() {
        StringBuilder toPrint = new StringBuilder();

        toPrint.append(this.labels);

        for(int i = 0; i < height; i++) {
            toPrint.append(" ").append(i+1).append(" ");

            for(int j = 0; j < width; j++) {
                Piece piece = getPieceAt(i,j);
                toPrint.append(this.tileBoard[i][j].colourID).append(piece.colourID).append(piece.prnt).append(ConsoleColours.RESET);
                toPrint.append(" ");
            }

            toPrint.append(i+1).append("\n");
        }

        toPrint.append(this.labels).append("\n");

        System.out.println(toPrint);
    }


    public Piece[][] getPieces() {
        return this.pieceBoard.clone();
    }

    public Piece getPieceAt(int row, int col) {
        return this.pieceBoard[row][col];
    }

    public Tile[][] getTiles() {
        return this.tileBoard.clone();
    }

    public Tile getTileAt(int row, int col) {
        return this.tileBoard[row][col];
    }

    //should place new instance of piece
    public void placePiece(Piece piece, int row, int col) {
        this.pieceBoard[row][col] = piece;
    }

    public void removePiece(int row, int col) {
        this.pieceBoard[row][col] = new Piece();
    }

    public void placeTile(Tile tile, int row, int col) {
        this.tileBoard[row][col] = tile;
    }

    public void removeTile(int row, int col) {
        this.tileBoard[row][col] = new Tile();
    }

    //initialises the board with the default null tiles & pieces
    private void initBoard() {
        for(int i = 0; i < this.height; i++) {
            for(int j = 0; j < width; j++) {
                pieceBoard[i][j] = new Piece();
                tileBoard[i][j] = new Tile();
            }
        }
    }

    //creates the first line of the printable board, this only has to be done once
    private void createLabels() {
        StringBuilder str = new StringBuilder();
        str.append("   ");
        for(int i = 1; i < width + 1; i++) {
            str.append(i).append(" ");
        }
        str.append("\n");

        this.labels = str.toString();
    }

}
