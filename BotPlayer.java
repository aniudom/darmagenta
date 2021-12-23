

import java.util.Random;

public class BotPlayer extends Player{

  private Random random;

  public BotPlayer(char counter){
    super(counter);
    random = new Random();
  }

  public BotPlayer(char counter, String name){
    super(counter,name);
    random = new Random();
  }

  public String getMove(){
    int r = random.nextInt(7);
    String userInput = ""+r;
    return userInput;
  }

}