
/**
 *   Class, for holding board pieces, should include the following functions:
 *      placePiece
 */

public class Tile {
    Piece piece;

    public Tile(){
        this.piece = new NullPiece();
    }

    public boolean placePiece(){
        try{
            this.piece = new Knight();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean removePiece(){
        try{
            this.piece = new NullPiece();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean hasPiece(){
        if(this.piece.getID() == "null"){
            return false;
        }else{
            return true;
        }
    }

    public Piece getPiece(){
        return this.piece;
    }
}