public class AccountMain {
    public static void main(String[] args) {
        Account bobsAccount = new Account();//("12345",0.00,"Surya","suryasedulous@gmail.com","9578236048");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        
        
        
        
        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Surya");
        bobsAccount.setCustomerEmailAddress("suryasedulous@gmail.com");
        bobsAccount.setCustomerPhoneNumber("9578236048");
        bobsAccount.withdrawal(100.0);


        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(101.0);
    }
    
}
