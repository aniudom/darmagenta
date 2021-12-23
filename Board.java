
public class Board{
  //This class needs a field for board and one for the counters
  private static int rows = 6;
  private static int columns = 7;

  private static Counter[][]myboard = new Counter [rows][columns];

  public Board(){
    for(int row = 0; rows < rows; rows++){
			for(int col = 0; col < columns; col++){
        myboard[row][col] = null;
      }
    }
  }


// method to print the board. This will be used each time a new counter is added to the board
  public void printBoard(){
		for(int row = 0; row < rows; row++){
      System.out.print("|");
			for(int col = 0; col < columns ; col++){
        if(myboard[row][col] == null) {
          System.out.print("_");
        }
        else {
          System.out.print(myboard[row][col].getCounter());
        } 
      System.out.print("|");
		  }
		 System.out.println();
	  }
    System.out.println(" 1 2 3 4 5 6 7");
    System.out.println();
  }


  // this is a method to place counters and check if counters have been placed or not 
  public boolean placeCounter(int colPlaced, char counter){
    if(colPlaced >= 0 && colPlaced < columns - 1){
    
      if(myboard[0][colPlaced] == null){
        boolean placed = false;
        for(int row = rows -1; row >= 0; row--) {
          if(myboard[row][colPlaced] == null){
            myboard[row][colPlaced] = new Counter();
            myboard[row][colPlaced].setCounter(counter);
            placed = true;
            break;
          }
        }
        return placed;
     }
      else{
        System.out.println ("Column full, try again");
        return false;
      }
    }
    else{
      System.out.println (" Cannot place counter there");
      return false;
      } 
  }

    // check for win
  public boolean hasWon(Counter player){
    return checkVertical(player) || checkHorizontal(player) || checkDiagonal(player);
  }

  private boolean checkVertical(Counter player){
    for(int row = 0; row < rows; row++){
      boolean allMatch = true;
      for(int col = 0; col < columns; col++){
        allMatch = allMatch && (myboard[row][col]== player);
      }
      if(allMatch){
        return true;
      }
    }
    return false;
  }

  private boolean checkHorizontal(Counter player){
    for(int row = 0; row < rows; row++){
      boolean allMatch = true;
      for(int col = 0; col < columns ; col++){
        allMatch = allMatch && (myboard[row][col]==player);
      }
      if(allMatch){
        return true;
      }
    }
    return false;
  }

  private boolean checkDiagonal(Counter player){
    // top-left
    int row = 0;
    int col = 0;
    boolean allMatch = true;
    while(row < rows && col < columns){
      allMatch = allMatch && (myboard[row][col]==player);
      row++;
      col++;
    }
    if(allMatch){
      return true;
    }

    row = 0;
    col = myboard[row].length-1;
    allMatch = true;
    while(row < rows && col >= 0){
      allMatch = allMatch && (myboard[row][col]==player);
      row++;
      col--;
    }
    return allMatch;
  }

}






