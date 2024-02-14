public class Players {

  private String firstName, lastName;
  private static int total;

  public Players(String fname, String lname) {

    firstName = fname;
    lastName = lname;
    total++;

    System.out.println("Total Players: " + total);
  }

  public String getFirstName() { return firstName; }

  // static function returns a static variable

  public static int getTotal() { return total; }
}
