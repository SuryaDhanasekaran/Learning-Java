import java.util.LinkedList;
import java.util.ListIterator;

public class ll
{
  public static void main(String args[])
  {
    var placesToVisit = new LinkedList<String>();

    placesToVisit.add("Trichy");
    placesToVisit.add(0,"Lalgudi");
    System.out.println(placesToVisit);

    addMoreElements(placesToVisit);
    System.out.println(placesToVisit);
    // removeElements(placesToVisit);
    // System.out.println(placesToVisit);
    // gettingElements(placesToVisit);

    //printItinerary(placesToVisit);
    //printItinerary2(placesToVisit);
    testIterator(placesToVisit);


  }
  private static void addMoreElements(LinkedList<String> list)
  {
    list.addFirst("Surya");
    list.addLast("N");
    
    //Queue methods
    list.offer("Ariyalur");
    list.offerFirst("Poovalur");
    list.offerLast("Pinnavasal");
    //Stack methods
    list.push("Spring boot");
  }
  private static void removeElements(LinkedList<String> list)
  {
    list.remove(4);
    list.remove("Pinnavasal");

    System.out.println(list);
    String s1 = list.remove();//removes first element
    System.out.println(s1 + " was removed");

    String s2 = list.removeFirst();//removes first element
    System.out.println(s2 + " was removed");
    
    String s3 = list.removeFirst();//removes last element
    System.out.println(s3 + " was removed");

    //Queue/Deque poll methods

    String p1 = list.poll(); //removed first element
    System.out.println(p1 + " was removed");

    String p2 = list.pollFirst(); //removed first element
    System.out.println(p2 + " was removed");

    String p3 = list.poll(); //removed last element
    System.out.println(p3 + " was removed"); 

    list.push("Brazil");
    list.push("Kuhoor");
    list.push("Anbil");

    String p4 = list.pop(); //removes first element
    System.out.println(p4 + " was removed");
  }

  public static void gettingElements(LinkedList<String> list)
  {
    System.out.println("Retrieved Element = " + list.get(4));
    System.out.println("First element = " + list.getFirst());
    System.out.println("Last Element = " + list.getLast());

    System.out.println("Brazil is at position = "+ list.indexOf("Brazil"));
    System.out.println("Anbil is at position = "+ list.indexOf("Anbil"));

    //Queue retreival method
    System.out.println("Element from element() = "+list.element());
    //Stack retreival method
    System.out.println("Elements from peek() = " + list.peek());
    System.out.println("Elements from peekFirst() = " + list.peekFirst());
    System.out.println("Element from peekLast() = " + list.peekLast());
  }
  public static void printItinerary(LinkedList<String> list)
  {
    System.out.println("Trip start at " + list.getFirst());
    for(int i=1;i<list.size();i++)
    {
      System.out.println("-->From: " + list.get(i-1) + " to " + list.get(i));
    }
    System.out.println("Trip ends at " + list.getLast());
  }

  public static void printItinerary2(LinkedList<String> list)
  {
    System.out.println("Trip start at " + list.getFirst());
    String previousTown = list.getFirst();
    ListIterator<String> iterator = list.listIterator(1);
    while(iterator.hasNext())
    {
      var town = iterator.next();
      System.out.println("-->From: "+ previousTown + " to " + town);
      previousTown = town;
    }
    System.out.println("Trip ends at " + list.getLast());
  }
  private static void testIterator(LinkedList<String> list)
  {
    var iterator = list.listIterator();
    while(iterator.hasNext())
    {
      // System.out.println(iterator.next());
      if(iterator.next().equals("Ariyalur"))
      {
        // iterator.remove();
        iterator.add("Chennai");
      }
    }
    while(iterator.hasPrevious())
  {
    System.out.println(iterator.previous());
  }
  System.out.println(list);

  var iterator2 = list.listIterator(3);
  System.out.println(iterator2.next());
  System.out.println(iterator2.previous());

  }
  
}