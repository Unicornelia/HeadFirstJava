public class PhraseOMatic {
  public static void main (String[] args) {
    String[] wordListOne = {"initialize", "front-end", "back-end", "systems", "web-based", "outline", "random"};

    String[] wordListTwo = {"paradigm", "shared", "clustered", "targeted", "value-added", "oriented", "ordered"};

    String[] wordListThree = {"process", "tipping", "strategy", "mission", "solution", "vision", "application"};

    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    int rand1 = (int) (Math.random() * oneLength);
    int rand2 = (int) (Math.random() * twoLength);
    int rand3 = (int) (Math.random() * threeLength);

    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

    System.out.println("What we need is a " + phrase);
  }
}
