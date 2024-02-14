public class Birthday {

  int day, month, year;

  public Birthday(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void printBirthday() {
    System.out.println("Birthday :" + day + "/" + month + "/" + year);
  }
}
