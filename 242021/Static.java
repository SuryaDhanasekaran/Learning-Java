public class Static {

  public static void main(String[] args) {

    Players ipl1 = new Players("Virat", "Kohli");
    Players ipl2 = new Players("Sachin", "Tendulkar");

    System.out.println(ipl2.getFirstName());

    // Common to all players static function
    System.out.println(Players.getTotal());
  }
}
