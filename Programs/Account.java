public class Account {
    private String number;
    private double balance;
    private String customerName;;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        this("56789",2.50,"Default Name","Default address","default phone");

        System.out.println("Empty constructor called");
        

    }

    public Account(String number,double balance,String customerName,String customerEmailAddress,String customerPhoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }
        else{
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);

        }
    }
    

    /**
     * @return String return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return double return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return String return the customerName;
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName; the customerName; to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return String return the customerEmailAddress
     */
    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    /**
     * @param customerEmailAddress the customerEmailAddress to set
     */
    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    /**
     * @return String return the customerPhoneNumber
     */
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    /**
     * @param customerPhoneNumber the customerPhoneNumber to set
     */
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
