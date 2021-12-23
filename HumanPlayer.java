import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HumanPlayer extends Player{
  private BufferedReader input;

  public HumanPlayer(char counter){
    super(counter);
    input = new BufferedReader(new InputStreamReader(System.in));
  }

  public HumanPlayer(char counter, String name){
    super(counter,name);
    input = new BufferedReader(new InputStreamReader(System.in));
  }

  public String getMove(){
    String userInput = "";
    try{
      userInput = input.readLine();
    }
    catch(Exception e){
      System.out.println("Cannot read input, please enter valid column number");
    }
    return userInput;
  }

}