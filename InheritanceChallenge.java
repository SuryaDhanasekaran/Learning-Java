public class InheritanceChallenge{
  public static void main(String[] args)
  {

    Employee surya = new Employee("surya","11/12/2002","01/01/2020");

    Employee siva = new Employee("siva","11/11/2002","02/02/2020");

    System.out.println(surya);
    System.out.println("Age = " + surya.getAge());
    System.out.println("Pay = " + surya.collectPay());

    System.out.println(siva);
    System.out.println("Age = " + siva.getAge());
    System.out.println("Pay = " + siva.collectPay());

  }
}