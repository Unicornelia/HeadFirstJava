class SimpleDotCom {

  int guess = Integer.parseInt(String stringGuess);
  // convert the string to an integer

  String result = "miss";
  // make a variable to hold the result we will return

  for (int cell : locationCells) {
    // repeat with each cell in the locationcell array
    if (guess == cell) {
      // compare the user guess to the element in the array
      result  = "hit";
      numOfHits++;
      // we got a hit, increment the numbers
      break;
      //get out of the loop
    }
  }

  if (numOfHits == locationCells.length()) {
    result = "kill";
  }

  System.out.println(result);
  //display result for user

  return result;
  //return the result back to the calling method


  int[] locationCells;
  int numOfHits = 0;

  String checkYourself(String userGuess) {
  }

  void setLocationCells(int[] cellLocations) {
  }


}
