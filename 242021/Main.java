import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // int age = 35;
    // double decimal = 35.6;
    // char letter = '$';
    // String name = "Noob in java";
    // boolean yesorno = false;
    // Scanner scanner = new Scanner(System.in);

    // int scAge = scanner.nextInt();
    // System.out.println("Your age is " + scAge);

    // // System.out.println("Bye Cruel world");
    // System.out.println(age);
    // System.out.println(decimal);
    // System.out.println(letter);
    // System.out.println(name);
    // System.out.println(yesorno);

    Birthday bday = new Birthday(11, 12, 2002);

    Person person = new Person("Surya", bday);

    person.printData();
  }
}