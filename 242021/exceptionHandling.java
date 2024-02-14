import java.util.Scanner;

public class exceptionHandling {

  public static void main(String[] args) {

    try {

      Scanner sc = new Scanner(System.in);

      int num1 = sc.nextInt();
      int num2 = sc.nextInt();

      System.out.println(num1 / num2);

    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Num2 cannot be zero");
    }
  }
}
