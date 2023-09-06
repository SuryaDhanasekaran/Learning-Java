import java.util.Arrays;
import java.util.Random;

public class UsingArrays {

  public static void main(String args[])
  {
    int[] firstArray = getRandomArray(10);
    System.out.println(Arrays.toString(firstArray));

    int[] secondArray = getRandomArray(10);
    System.out.println(secondArray);
    System.out.println(Arrays.toString(secondArray));
    Arrays.fill(secondArray,5);
    System.out.println(Arrays.toString(secondArray));

    int[] thirdArray = getRandomArray(10);
    System.out.println(Arrays.toString(thirdArray));

    int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
    System.out.println(Arrays.toString(fourthArray));
    Arrays.sort(fourthArray);
    System.out.println(Arrays.toString(thirdArray));
    System.out.println(Arrays.toString(fourthArray));

    int[] smallArray = Arrays.copyOf(thirdArray, 5);
    System.out.println(Arrays.toString(smallArray));

    int[] largeArray = Arrays.copyOf(thirdArray, 15);
    System.out.println(Arrays.toString(largeArray));

    String[] sArray = {"Surya","Nivas:","Tillaq","Siva","Wasiv","Subin"};

    System.out.println(Arrays.toString(sArray));

    if(Arrays.binarySearch(sArray,"Surya") >= 0)
    {
      System.out.println("Element found");
    }

    int[] s1 = {1,2,3,4,5};
    int[] s2 = {1,2,3,4,5};

    if(Arrays.equals(s1, s2))
    {
      System.out.println("Arrays are equal");
    }
    else
    {
      System.out.println("Arrays are not equal");
    }
   
    


  }
  private static int[] getRandomArray(int len)
  {
    Random random = new Random();
    int[] newInt = new int[len];

    for(int i=0;i<len;i++)
    {
      newInt[i] = random.nextInt(100);
    }
    return newInt;


  }
  
}
