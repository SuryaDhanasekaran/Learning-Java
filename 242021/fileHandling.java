import java.io.File;

public class fileHandling {

  public static void main(String[] args) {
    File file = new File("test.txt");

    // if (file.exists()) {
    //   System.out.println("File exists");
    // } else {
    //   System.out.println("File does not exist");
    // }

    try {

      if (file.createNewFile()) {
        System.out.println("File created");
      } else {
        System.out.println("File already exists");
      }

    } catch (Exception e) {
      System.out.println("Error occured");
    }
  }
}
