package Bank;
import java.util.*;

public class Bank {
    private Map<Integer, Customer> customer = new HashMap<Integer, Customer>();
    private int numberOfCustomers;
    private String bankName;
    
    public Bank(String bName){
        this.bankName = bName;
    }

    public String getBank(){
        return this.bankName;
    }

    public void addCustomer(String f, String l){
        this.numberOfCustomers += 1;
        Customer user = new Customer(f , l);
        this.customer.put(this.numberOfCustomers, user);
    }

    public String removeCustomer(int index){
        String removedUser = this.customer.get(index).getFirstName() + " " + this.customer.get(index).getLastName();
        this.customer.remove(index);
        int num = 1;
        for (int i = 1; i < this.numberOfCustomers + 1; i++){
            Customer temp = this.customer.get(i);
            if (temp == null){
                continue;
            } else {
                String f = this.customer.get(i).getFirstName();
                String l = this.customer.get(i).getLastName();
                Customer user = new Customer(f, l);
                this.customer.remove(i);
                this.customer.put(num, user);
                num++;
            }
        }
        this.numberOfCustomers -= 1;
        return removedUser + " has been removed from OOP Bank !!";
    }

    public int getNumOfCustomers(){
        return this.customer.size();
    }

    public Customer getCustomer(int index){
        return this.customer.get(index);
    }

    public String getCustomerName(int index){
        return this.customer.get(index).getFirstName() + " " + this.customer.get(index).getLastName();
    }

    public void getCustomerList(){
        if (this.numberOfCustomers != 0){
            System.out.println("This is the list of customer in " + getBank() + " !!");
            for (int i = 1; i < this.numberOfCustomers + 1; i++){
                System.out.println((i) + ". " + this.customer.get(i).getFirstName() + " " + this.customer.get(i).getLastName());
            }
        } else {
            System.out.println("There is no customer that is registered in " + getBank() + " right now !!");
        }
    }

    public String getUserName(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String input = scan.nextLine();
        System.out.print("Enter your last name : ");
        String input2 = scan.nextLine();
        Customer user = new Customer(input, input2);
        String temp = user.getFirstName() + " " + user.getLastName();
        return temp;
    }
}