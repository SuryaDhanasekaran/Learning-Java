public class varInClass {

  public static void main(String[] args) {
    Shop shop = new Shop(100);
    // shop.money += 1; Error

    shop.addMoney(10);
    shop.addMoney(15);
    shop.addMoney(100);
    shop.addMoney(1000);

    System.out.println(shop.getMoney());
  }
}
