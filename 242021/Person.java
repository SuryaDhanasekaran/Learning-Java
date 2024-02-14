public class Person {

  String name;
  Birthday bday; // Class Compostion

  // Constructor
  public Person(String name, Birthday bday) {
    this.name = name;
    this.bday = bday;
  }

  public void printData() {
    System.out.println("Name :" + name);
    bday.printBirthday();
  }
}
