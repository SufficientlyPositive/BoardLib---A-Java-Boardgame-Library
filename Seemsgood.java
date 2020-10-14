public class Seemsgood {
    public static void main(String[] args) {
        Board board = new Board(8, 8);

        Piece whitePawn = new Piece("Pawn", 'P', 1, ConsoleColours.YELLOW);
        Piece blackPawn = new Piece("Pawn", 'P', 2, ConsoleColours.BLUE);
        Tile whiteTile = new Tile("WHITE", ConsoleColours.WHITE_BACKGROUND);
        Tile blackTile = new Tile("BLACK", ConsoleColours.BLACK_BACKGROUND);

        for(int j = 0; j < board.width; j++) {
             board.placePiece(whitePawn, 0, j);
        }
        
        for(int j = 0; j < board.width; j++) {
            board.placePiece(blackPawn, 7, j);
        }

        for(int i = 0; i < board.height; i++) {
            for(int j = 0; j < board.width; j++) {
                if(i + j % 2 == 0) {
                    board.placeTile(blackTile, i, j);
                } else {
                    board.placeTile(whiteTile, i, j);
                }
            }
        }

        board.printBoardC();
    }
}