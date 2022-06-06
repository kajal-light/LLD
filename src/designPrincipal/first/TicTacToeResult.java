package designPrincipal.first;

public class TicTacToeResult {
    public static void main(String[] args) {
        TicTacToe game=new TicTacToe(new Player('X'),new Player('0'),new Board());

Result result=game.start();

if(result.isDraw()){

    System.out.println("the match is drwan");
}else{

    System.out.println(result.getWinner().getSymbol());
}






    }

}
