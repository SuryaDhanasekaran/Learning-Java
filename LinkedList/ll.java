import java.util.LinkedList;

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
    removeElements(placesToVisit);
    System.out.println(placesToVisit);



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
    System.out.println(p4 + " was removeed");
  }
}