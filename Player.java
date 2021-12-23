
public abstract class Player{
  private char counter;
  private String name;

  public Player(char counter){
    this.counter = counter;
    name = "player";
  }
  
  public Player(char counter, String name){
  this.counter = counter;
  this.name = name;
  }

  public char getCounter(){
    return counter;
  }

  public String getName(){
    return name;
  }

  public abstract String getMove();

}




