public class Batsman {
  public void printRun() { System.out.println("Batsmen has scored 0"); }

  // func overloading
  public void printRun(int runs) {
    System.out.println("Batsmen has scored " + runs);
  }
}
