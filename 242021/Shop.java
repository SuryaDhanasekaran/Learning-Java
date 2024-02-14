public class Shop {

  private int money;

  // Constructor has no return type
  // Constructor name should be same as class name
  // Is called when an object is created
  // Compiler creates a default constructor

  public Shop(int initialMoney) {
    // System.out.println("Constructor called");
    money = initialMoney;
  }

  public void addMoney(int money) { this.money += money; }

  public int getMoney() { return money; }
}
