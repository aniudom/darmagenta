import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Connect4{

  private Board b;
  private Move m;
  private Counter c;
  private HumanPlayer player1;
  private BotPlayer player2;

  private boolean HumanPlaying;

  public Connect4(){
    b = new Board();
    player1 = new HumanPlayer('r');
    player2 = new BotPlayer('y');
  }

  public void playConnect4(){
		System.out.println("Welcome to Connect 4");
		System.out.println("There are 2 players red and yellow");
		System.out.println("Player 1 is Red, Player 2 is Yellow");
		System.out.println("To play the game type in the number of the column you want to drop you counter in"); 
		System.out.println("A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally");
		System.out.println("");
		b.printBoard();

  boolean win = true;
  while (!win){
    if (HumanPlaying){
     HumanPlayer player = player1;
     System.out.println("It is your turn"); 
     String userInput = player1.getMove();
			int move = Integer.parseInt(userInput);
			b.placeCounter(move, 'r');
			boolean hasWon = false;
			int count = 0;
    }
    else{
     BotPlayer player = player2;
     System.out.println("It is the computer's turn");
     player2.getMove();
     b.placeCounter(m.getCol()-1, player2.getCounter());
     b.printBoard(); 
    }
  }
  }
  
}