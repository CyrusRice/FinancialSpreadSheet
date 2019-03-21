/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;
import java.util.*;
/**
 *
 * @author Cyrus
 */
public class File {
    private Formatter x;
    
    public File() {
        
    }
    
    public void openFile() {
        try {
            x = new Formatter("sheet.txt");
        } catch (Exception e) {
            System.out.println("unable to create file");
        }
    }
    
    public void addHeader() {
        x.format("%s%n", "------------------------------------------------------------------------------------------------");
        x.format("%s%n", "| Item Number |          Description         |     Debit     |    Credit     |     Balance     |");
        x.format("%s%n", "------------------------------------------------------------------------------------------------");
    }
    
    public void addDebit(int num, String description, float amount) {
        x.format("%s%13s%s%30s%s%15s%s%n", "|", num, "|", description, "|", amount, "|               |                 |");
        x.format("%s%n", "------------------------------------------------------------------------------------------------");
    }
    
    public void addCredit(int num, String description, float amount) {
        x.format("%s%13s%s%30s%s%15s%s%n", "|", num, "|", description, "|               |", amount, "|                 |");
        x.format("%s%n", "------------------------------------------------------------------------------------------------");
    }
    
    public void addBalance(float balance) {
        x.format("%s%17s%s%n", "-----------------------------------------------------------------------------|", balance, "|");
        x.format("%s%n", "------------------------------------------------------------------------------------------------");
    }
    
    public void closeFile() {
        x.close();
    }
}
