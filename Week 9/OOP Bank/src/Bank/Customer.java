package Bank;

public class Customer {
    private String firstName, lastName;
    private Account account;
    
    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;
        this.account = new Account(0.0);
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Account getAccount(){
        return this.account;
    }

    public void setAccount(Account acct){
        this.account = acct;
    }
}
