public class multiDimensionalArrays {

  public static void main(String[] args) {
    int[][] myArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    System.out.println(myArray[0][1]);

    for (int row = 0; row < myArray.length; row++) {

      for (int col = 0; col < myArray[row].length; col++) {
        System.out.print(myArray[row][col] + "\t");
      }
      System.out.println();
    }
  }
}