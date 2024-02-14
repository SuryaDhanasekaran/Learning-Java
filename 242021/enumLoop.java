import java.util.EnumSet;

enum Day {
  SUNDAY,
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY;
}

public class enumLoop {

  public static void main(String[] args) {

    // Day day = Day.SUNDAY;

    // System.out.println(day);

    // System.out.println(Day.values());

    // for (Day day : Day.values()) {

    //   System.out.println(day);
    // }

    for (Day day : EnumSet.range(Day.TUESDAY, Day.FRIDAY)) {

      System.out.println(day);
    }
  }
}
