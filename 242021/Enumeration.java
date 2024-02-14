
enum Day {
  SUNDAY,
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY;

  private Day() { System.out.println("Constructor called"); }
}

// public class Day{

//     public static final Day SUNDAY = new Day();
// }

public class Enumeration {

  public static void main(String[] args) {

    Day day = Day.MONDAY;

    System.out.println(day);

    switch (day) {
    case MONDAY:
      System.out.println("Monday");
      break;
    case TUESDAY:
      System.out.println("Tuesday");
      break;
    case WEDNESDAY:
      System.out.println("Wednesday");
      break;
    case THURSDAY:
      System.out.println("Thursday");
      break;
    case FRIDAY:
      System.out.println("Friday");
      break;
    case SATURDAY:
      System.out.println("Saturday");
      break;
    case SUNDAY:
      System.out.println("Sunday");
      break;
    }
  }
}
