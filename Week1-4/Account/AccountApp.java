
package account;

public class AccountApp {

    public static void main(String[] args) {
        
        Account a1 = new Account();
        a1.firstName = "Sarah";
        a1.lastName = "Bellum";
        a1.setBalance(20000.00);
        a1.genID();
        a1.withdraw(2500.00);
        a1.deposit(3000.00);        
        a1.printAccount();
        
        Account a2 = new Account();
        a2.firstName = "Lou";
        a2.lastName = "Tenant";
        a2.setBalance(25.00);
        
        a2.genID();
        a2.withdraw(25);
        a2.printAccount();   
    }
    
}
