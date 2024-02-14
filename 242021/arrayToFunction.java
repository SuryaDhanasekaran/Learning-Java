public class arrayToFunction {

  public static void main(String[] args) {
    int a[] = {1, 2, 3, 4, 5};

    printArray(a);
  }

  public static void printArray(int[] anyName) {
    for (int i : anyName) {
      System.out.print(i + " ");
    }
  }
}