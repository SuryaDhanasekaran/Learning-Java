import java.io.File;
import java.io.FileWriter;

public class writeFile {

  public static void main(String[] args) {
    try {
      File file = new File("test.txt");

      FileWriter fw = new FileWriter(file);
      fw.write("This is a test file");
      fw.append("\nThis is a second line");
      fw.close();

      System.out.println("Successfully written to file");
    } catch (Exception e) {
      System.out.println("Error occured");
    }
  }
}
