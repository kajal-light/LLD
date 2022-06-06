package designPrincipal.first;

import java.util.Scanner;

public class Player {


    private final char symbol;

     public Player(char symbol){
         this.symbol=symbol;}

     public Move play(){
         System.out.println("Fecting move from console");
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         int y=sc.nextInt();
         return new Move(x,y);


     }

    public char getSymbol() {
        return symbol;
    }
}
