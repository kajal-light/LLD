package designPrincipal.first;

public class Board {

private final char[][] board;

public Board(){
this.board=new char[3][3];
for(int i=0;i<3;i++)
    for(int j=0;j<3;j++)

this.board[i][j] = '.';
}


public void applyMove(Move move, char symbol){
this.board[move.getX()][move.getY()]=symbol;


}


public boolean isFull() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (this.board[i][j] == '.') {
                return false;
            }
        }
    }
return true;
}

public boolean hasWinning(char symbol){

return hasHorizontalwinning(symbol)|| hasVerWinning(symbol)||hasDaigonalWinning(symbol);

}

    private boolean hasDaigonalWinning(char symbol) {

    return (this.board[0][0]==symbol && this.board[1][1]==symbol && this.board[2][2]==symbol) || (this.board[0][2]==symbol && this.board[1][1]==symbol && this.board[2][0 ]==symbol) ;

    }
    private boolean hasVerWinning(char symbol) {

        for(int i=0;i<3;i++) {
            if (this.board[0][i] == symbol && this.board[1][i] == symbol && this.board[2][i] == symbol) {
                return true;

            }
        }
        return false;
    }




    private boolean hasHorizontalwinning(char symbol) {
            for(int i=0;i<3;i++) {
                if (this.board[i][0] == symbol && this.board[i][0] == symbol && this.board[i][0] == symbol) {
                    return true;

                }
            }
            return false;
        }

}


