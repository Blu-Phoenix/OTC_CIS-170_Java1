
package account;

public class Account {
    
    int id = 0;
    static int idCount = 1;
    double balance = 0;
    String firstName;
    String lastName;
    
    public void withdraw(double withdrawAmount) {   
        balance -= withdrawAmount;
    }
    
    public void deposit(double depositAmount) {    
        balance += depositAmount;
    }
    
    public void printAccount() {    
        System.out.printf("%d %s %s:\n$%.2f\n", id, firstName, lastName, balance);
    }
    
    public int genID() {
        id = idCount;
        idCount++;
        return id;
    }

    void setBalance(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

