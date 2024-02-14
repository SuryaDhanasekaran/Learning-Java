public class conditionalOperators {

  public static void main(String[] args) {
    int number = 5;
    // if (number % 2 == 0) {
    //   System.out.println("Number is even");
    // } else {
    //   System.out.println("Number is odd");
    //   ;
    // }

    System.out.println(number % 2 == 0 ? "Number is even" : "Number is odd");
  }
}