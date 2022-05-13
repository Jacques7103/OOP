import Bank.Bank;
import Bank.Customer;
import java.util.*;

public class Driver {
    public static void main(String args[]){
        boolean lcv = true;
        Bank bank = new Bank("OOP Bank");
        System.out.println("Welcome to " + bank.getBank() + " Application System !!");

        while(lcv){                         
            System.out.println("Are you an admin or a customer?");          //For the user to login as an admin or customer
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Exit");
            System.out.print("Enter a number : ");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();

            boolean lcv2 = true;
            while(lcv2){
                switch(input){
                case 1:     //Login as an admin
                    boolean lcv3 = true;
                    while(lcv3){        
                        System.out.println("==========================================================================");       
                        System.out.println("What would you like to do?");           //The thing that admin can do
                        System.out.println("1. Add new customer");
                        System.out.println("2. Remove a customer");
                        System.out.println("3. Get the list of customer");
                        System.out.println("4. Get number of customer");
                        System.out.println("5. Get customer name");
                        System.out.println("6. Get customer code");
                        System.out.println("7. Back to main menu");
                        System.out.println("8. Exit");
                        System.out.print("Choose an option : ");
                        int input2 = scan.nextInt();

                        switch(input2){
                            case 1:     //Adding customer into the bank
                                System.out.println("==========================================================================");
                                System.out.print("Enter user's first name : ");
                                Scanner scan2 = new Scanner(System.in);
                                String input3 = scan2.nextLine();
                                System.out.print("Enter user's last name : ");
                                String input4 = scan2.nextLine();
                                bank.addCustomer(input3, input4);
                                System.out.println(input3 + " " + input4 + " is successfully added into " + bank.getBank() + " !!");
                                break;
                            
                            case 2:     //Removing the existing customer
                                System.out.println("==========================================================================");
                                System.out.println("This is the list of customer in " + bank.getBank() + " !!");
                                bank.getCustomerList();
                                System.out.print("Enter the index of customer that you want to remove : ");
                                int input5 = scan.nextInt();
                                String name = bank.getCustomerName(input5);
                                bank.removeCustomer(input5);
                                System.out.println(name + " is successfully removed from " + bank.getBank() + " !!");
                                break;
                            
                            case 3:     //Getting the list of customer in the bank
                                System.out.println("==========================================================================");
                                bank.getCustomerList();
                                break;

                            case 4:     //Get the ammount of customer that is registered in the bank
                                System.out.println("==========================================================================");
                                System.out.println("The number of customer in " + bank.getBank() + " is " + bank.getNumOfCustomers() + " !!");
                                break;

                            case 5:     //Get the name of a specific customer
                                System.out.println("==========================================================================");
                                System.out.print("Enter the index of customer you want to get : ");
                                int input6 = scan.nextInt();
                                System.out.println("The customer with index " + input6 + " named " + bank.getCustomerName(input6));
                                break;

                            case 6:     //Get the code of a customer to access their account
                                System.out.println("==========================================================================");
                                System.out.println("This is the list of customer in " + bank.getBank() + " !!");
                                bank.getCustomerList();
                                System.out.print("Enter the index of customer : ");
                                int input7 = scan.nextInt();
                                System.out.println("The customer with index " + input7 + " has code : " + bank.getCustomer(input7));
                                break;

                            case 7:     //Back to main menut
                                lcv2 = false;
                                lcv3 = false;
                                System.out.println("==========================================================================");
                                break;

                            case 8:     //Exit the app
                                System.out.println("==========================================================================");
                                System.out.println("Thank you for using " + bank.getBank() + " Application System !!");
                                System.out.println("See you next time !!");
                                lcv3 = false;
                                lcv2 = false;
                                lcv = false;
                                break;

                            default:    //If user's input isn't valid
                                System.out.println("==========================================================================");
                                System.out.println("Your input isn't valid !!");
                                lcv3 = false;
                                break;
                        }
                    }
                    break;
                
                case 2:     //Login as an customer || To login as customer, they need to be registered by the admin first !!
                    ArrayList<String> custList = new ArrayList<String>();
                    System.out.println("==========================================================================");
                    String temp = bank.getUserName();       //Entering their name that is registered in the bank

                    for (int i = 1; i < bank.getNumOfCustomers() + 1; i++){
                        String temp2 = bank.getCustomer(i).getFirstName() + " " + bank.getCustomer(i).getLastName();
                        custList.add(temp2);
                    }

                    if (custList.contains(temp)){       //Check if their name is registered in the bank
                        for (int i = 1; i < bank.getNumOfCustomers() + 1; i++){
                            String temp3 = bank.getCustomer(i).getFirstName() + " " + bank.getCustomer(i).getLastName();
                            if (temp.equals(temp3) == true){        //If the name was found in the list
                                Customer user = bank.getCustomer(i);
                                System.out.println("Welcome to " + bank.getBank() + " " + user.getFirstName() + " " + user.getLastName() + " !!");
                                boolean lcv4 = true;
                                while(lcv4){
                                    System.out.println("==========================================================================");
                                    System.out.println("What would you like to do?");       //The thing that customer can do
                                    System.out.println("1. Check balance");                 
                                    System.out.println("2. Deposit");
                                    System.out.println("3. Withdraw");
                                    System.out.println("4. Check transaction history");
                                    System.out.println("5. Clear transaction history");
                                    System.out.println("6. Back to main menu");
                                    System.out.println("7. Exit");
                                    System.out.print("Choose an option : ");
                                    int input10 = scan.nextInt();

                                    switch(input10){
                                        case 1:     //Check the balance they have in their account
                                            System.out.println("==========================================================================");
                                            System.out.println("The balance in your account is $" + user.getAccount().getBalance());
                                            break;
                                        
                                        case 2:     //Deposit money to their own account
                                            System.out.println("==========================================================================");
                                            System.out.print("Please enter the ammount to be deposit : ");
                                            double ammount = scan.nextDouble();
                                            user.getAccount().deposit(ammount);
                                            break;

                                        case 3:     //Withdraw money from their own account
                                            System.out.println("==========================================================================");
                                            System.out.print("Please enter the ammount to be withdraw : ");
                                            double ammount2 = scan.nextDouble();
                                            user.getAccount().withdraw(ammount2);
                                            break;

                                        case 4:     //Print out the transaction history in their account
                                            System.out.println("==========================================================================");
                                            user.getAccount().getHistory();
                                            break;

                                        case 5:     //Clear transaction history in their account
                                            System.out.println("==========================================================================");
                                            user.getAccount().clearHistory();
                                            break;

                                        case 6:     //Back to main menu
                                            lcv2 = false;
                                            lcv4 = false;
                                            System.out.println("==========================================================================");
                                            break;
                                        
                                        case 7:     //Exit the app
                                            System.out.println("==========================================================================");
                                            System.out.println("Thank you for using " + bank.getBank() + " Application System !!");
                                            System.out.println("See you next time !!");
                                            lcv4 = false;
                                            lcv2 = false;
                                            lcv = false;
                                            break;

                                        default:    //If user's input isn't valid
                                            System.out.println("==========================================================================");
                                            System.out.println("Your input isn't valid !!");
                                            // lcv4 = false;
                                            break;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        break;
                    } else {    //If not registered
                        System.out.println("==========================================================================");
                        System.out.println("Sorry, you are not the customer of " + bank.getBank() + " yet !!");
                        System.out.println("==========================================================================");
                        lcv2 = false;
                        break;
                    }

                case 3:     //Exit the app
                    System.out.println("==========================================================================");
                    System.out.println("Thank you for using " + bank.getBank() + " Application System !!");
                    System.out.println("See you next time !!");
                    lcv2 = false;
                    lcv = false;
                    break;

                default:    //If user's input isn't valid
                    System.out.println("==========================================================================");
                    System.out.println("Your input isn't valid !!");
                    System.out.println("==========================================================================");
                    lcv2 = false;
                    break;
                }
            }
        }
    }
}
