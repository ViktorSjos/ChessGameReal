public class Logic {

    String[][] board = new String[8][8];

    public Logic(){
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                board[x][y] = "  ";
            }
        }
        /*
        // Rooks
        board [0][0] = "BR";
        board [7][0] = "BR";
        board [0][7] = "WR";
        board [7][7] = "WR";

        // Knights
        board [1][0] = "BN";
        board [6][0] = "BN";
        board [1][7] = "WN";
        board [6][7] = "WN";

        //Bishops
        board [2][0] = "BB";
        board [5][0] = "BB";
        board [2][7] = "WB";
        board [5][7] = "WB";

        //Queens
        board [3][0] = "BQ";
        board [3][7] = "WQ";

        //Kings
        board [4][0] = "BK";
        board [4][7] = "WK";
        //Pawns
        */

            for (int x = 0; x < 8; x++) {
                for (int y = 0; y < 8; y++) {
                    System.out.print(board[y][x]+" ");
                }
                System.out.println("");
            }

    }

    public void drawBoard(){
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                System.out.print(board[y][x]+" ");
            }
            System.out.println("");
        }
    }


    }


