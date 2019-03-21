/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;
import java.util.Scanner;
/**
 *
 * @author Cyrus
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account cardAcc = new Card();
        Account bankAcc = new Bank();
        Account businessAcc = new Business();
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Welcome to Cyrus's Financial Software");
        System.out.println("-------------------------------------");
        System.out.println("You have 3 accounts, bank, card, and business");
        System.out.println("To add to an account: a");
        System.out.println("To search an account: s");
        System.out.println("To remove from an account: r");
        System.out.println("To print the account spreadsheet: p");
        System.out.println("To quit: q");
        String choice = input.nextLine();
        while(choice != "q") {
            switch (choice) {                
                case "a": 
                        System.out.println("Enter key for account type-> (b)ank, (c)ard, (B)usiness: ");
                        choice = input.next();
                        System.out.println("Enter item number: ");
                        int num = input.nextInt();
                        System.out.println("Enter item description: ");
                        String description = input.next();
                        System.out.println("Enter monetary amount: ");
                        float amt = input.nextFloat();
                        switch(choice) {
                            case "c":
                                    cardAcc.add(num, description, amt);
                                    break;
                            case "b":
                                    bankAcc.add(num, description, amt);                                    
                                    break;
                            case "B":
                                    businessAcc.add(num, description, amt);
                                    break;
                            default:
                                    System.out.println("Invalid input");
                                    break;
                        }
                        break;
                case "s": 
                        System.out.println("Enter key for account type-> (b)ank, (c)ard, (B)usiness: ");
                        choice = input.next();
                        System.out.println("Enter item description: ");
                        description = input.next();
                        switch(choice) {
                            case "c":
                                    cardAcc.search(description);
                                    break;
                            case "b":
                                    bankAcc.search(description);                                   
                                    break;
                            case "B":
                                    businessAcc.search(description);
                                    break;
                            default:
                                    System.out.println("Invalid input");
                                    break;
                        }
                        break;            
                case "r": 
                        System.out.println("Enter key for account type-> (b)ank, (c)ard, (B)usiness: ");
                        choice = input.next();
                        System.out.println("Enter item description: ");
                        description = input.next();
                        switch(choice) {
                            case "c":
                                    cardAcc.remove(description);
                                    break;
                            case "b":
                                    bankAcc.remove(description);                                    
                                    break;
                            case "B":
                                    businessAcc.remove(description);
                                    break;
                            default:
                                    System.out.println("Invalid input");
                                    break;
                        }
                        break;   
                case "p": 
                        System.out.println("Enter key for account type-> (b)ank, (c)ard, (B)usiness: ");
                        choice = input.next();                        
                        switch(choice) {
                            case "c":
                                    cardAcc.identify();
                                    cardAcc.print();
                                    break;
                            case "b":
                                    bankAcc.identify();
                                    bankAcc.print();                                    
                                    break;
                            case "B":
                                    businessAcc.identify();
                                    businessAcc.print();
                                    break;
                            default:
                                    System.out.println("Invalid input");
                                    break;
                        }
                        break;            
                case "q": 
                        return;                                
                default:  
                        System.out.println("Invalid request, try again");
                        break;                              
            }
            System.out.println("You have 3 accounts, bank, card, and business");
            System.out.println("To add to an account: a");
            System.out.println("To search an account: s");
            System.out.println("To remove from an account: r");
            System.out.println("To print the account spreadsheet: p");
            System.out.println("To quit: q");
            choice = input.next();
        }
    }
    
}
