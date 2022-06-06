package designPrincipal.first;

public class TicTacToe {

   private final Player player1,player2;
   private final Board board;


    public TicTacToe(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

  Result start(){
  Player currentPlayer=player1;
  while(!this.board.isFull()) {
      Move cuurentMove = currentPlayer.play();
      this.board.applyMove(cuurentMove, currentPlayer.getSymbol());

      if (this.board.hasWinning(currentPlayer.getSymbol())) {


          return new Result(false, currentPlayer);
      }
      if (currentPlayer == this.player1)

          currentPlayer = this.player2;
       else


          currentPlayer = this.player1;


  }

      return new Result(true,null);
  }

}
