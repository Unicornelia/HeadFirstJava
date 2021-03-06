public class SimpleDotComTestDrive {

  public static void main (String [] args) {

    int numOfGuesses = 0;
    //make a variable to track how many guesses the user makes

    GameHelper helper = new GameHelper();

    SimpleDotCom dot = new SimpleDotCom();

    int randomNum = (int) (Math.random() * 5);

    int[] locations = {randomNum, randomNum + 1, randomNum + 2};

    dot.setLocationCells(locations);

    boolean isAlive = true;

    while (isAlive == true) {
      String guess = helper.getUserInput("enter a number");
      String result = dot.checkYourself(guess);
      numOfGuesses++;
      if (result.equals("kill")) {
        isAlive = false;
      }
      System.out.println("You took " + numOfGuesses + " guesses");
    }
  }
}
