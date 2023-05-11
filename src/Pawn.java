public class Pawn extends Piece{


    public Pawn(Logic l, int Getx, int Gety, String Getnam) {
        super(l, Getx, Gety, Getnam);
        l.board[x][y] = nam;
    }

    public void Move(){

    }


}
