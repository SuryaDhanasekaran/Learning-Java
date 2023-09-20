import java.util.*;
public class RemoveElement
{
  public static void main(String[] args) {
    
    //Create an array from which we need to remove the element
    int[] originalArray = {1,2,3,4,5};
    //Create an variable that holds value which we need to remove
    int elementToRemove = 3;
    
    int[] newarray = remove(originalArray,elementToRemove);
    System.out.println("Original Array="+Arrays.toString(originalArray));
    System.out.println("New Array="+Arrays.toString(newarray));

  }
  public static int[] remove(int[] array,int element)
  {
    int[] newarray = new int[array.length-1];
    int index = 0;
    for(int i=0;i<array.length;i++)
    {
      if(array[i]!=element)
      {
        newarray[index] = array[i];
        index++;
      }
    }
    return newarray;
  }
}