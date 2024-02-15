import java.util.Scanner;

class DynamicArray<T> implements Iterable<T> {
  final int initialCapacity = 16;
  private T arr[];
  private int size;
  private int capacity;

  @SuppressWarnings("unchecked") // annotations
  DynamicArray() {
    capacity = initialCapacity;
    size = 0;
    arr = (T[]) new Object[initialCapacity];
  }

  public void add(T val) {

    if (size == capacity) {
      expandArray();
    }
    arr[size++] = val;
  }

  private void expandArray() {

    capacity *= 2;
    arr = java.util.Arrays.copyOf(arr, capacity);
  }

  public void display() {
    System.out.println("Elements in the list are: ");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public void insertAtPos(T val, int pos) {
    if (pos < 0 || pos > size) {
      System.out.println("Invalid position");
    } else {
      if (size == capacity) {
        expandArray();
      }
      for (int i = size; i >= pos; i--) {
        arr[i + 1] = arr[i];
      }
      arr[pos] = val;
      size++;
    }
  }

  public void deleteAtPos(int pos) {

    if (pos < 0 || pos > size) {
      System.out.println("Invalid position");
    } else {
      for (int i = pos + 1; i < size; i++) {
        arr[i - 1] = arr[i];
      }
      size--;

      if (capacity > initialCapacity && capacity > 3 * size) {
        shrinkArray();
      }
    }
  }
  private void shrinkArray() {
    capacity /= 2;
    arr = java.util.Arrays.copyOf(arr, capacity);
  }

  public int length() { return size; }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      int index = 0;

      public T next() { return arr[index++]; }
      public boolean hasNext() { return index < size; }
    };
  }
}

public class listArray {
  public static void main(String[] args) {
    int val, pos;
    DynamicArray<Integer> list = new DynamicArray<Integer>();
    Scanner sc = new Scanner(System.in);

    while (true) {

      System.out.println("\n ---------- List Menu ----------\n");
      System.out.println("1.Insert at End\n");
      System.out.println("2.Display the list\n");
      System.out.println("3.Insert at specified position\n");
      System.out.println("4.Delete from specified position\n");
      System.out.println("5.Exit\n");
      System.out.println("\n---------------------------------\n");
      System.out.println("Enter your choice:\t ");

      int choice = sc.nextInt();
      switch (choice) {
      case 1:
        System.out.println("Enter the data to be inserted:\t ");
        val = sc.nextInt();
        list.add(val);
        break;
      case 2:
        list.display();
        for (int a : list.arr) {
        }
        break;
      case 3:
        System.out.println("Enter the pos(starts at 0): ");
        pos = sc.nextInt();
        if (pos < 0) {
          System.out.println("Invalid position");
          break;
        }
        System.out.println("Enter the data to be inserted:\t ");
        val = sc.nextInt();
        list.insertAtPos(pos, val);
        break;
      case 4:
        System.out.println("Enter the pos(starts at 0): ");
        pos = sc.nextInt();
        if (pos < 0) {
          System.out.println("Invalid position");
          break;
        }
        list.deleteAtPos(pos);
        break;
      case 5:
        System.out.println("Exiting...");
        System.exit(0);
      default:
        System.out.println("Invalid choice");
        break;
      }
    }
  }
}

/*
 * delete at end
 * delete from start
 * insert at start
 * get element at pos get(index)
 * update element at pos(index, value)
 * search element search(value) -> returns index of element
 * sort the array
 * clear the array
 * contains(value)
 * reverse the array
 */