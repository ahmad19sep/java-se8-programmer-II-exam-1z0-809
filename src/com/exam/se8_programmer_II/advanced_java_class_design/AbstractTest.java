package com.exam.se8_programmer_II.advanced_java_class_design;
//  ************************ Bank class ********************************
abstract class Bank {
    public abstract double getBalance();
}
//**************************** ALLIED BANk ************************************
class AlliedBank extends Bank {
    private String name;
    private String bankId;
    private double balance;

    public AlliedBank(String name, String bankId, double balance) {
        this.name = name;
        this.bankId = bankId;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
//**************************** UBL BANk *************************************
class Ubl extends Bank {
    private String name;
    private String bankId;
    private double balance;

    public Ubl (String name, String bankId, double balance) {
        this.name = name;
        this.bankId = bankId;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
//***************************** STATE BANK OF PAKISTAN **************************************
class StateBankOfPakistan extends Bank {
    private String name;
    private String bankId;
    private double balance;

    public StateBankOfPakistan(String name, String bankId, double balance) {
        this.name = name;
        this.bankId = bankId;
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
/**
 * In this example we create three concrete classes and One Abstract class
 *   In this program
 *   1: A person has three accounts in different banks
 *   2: Different persons have different accounts in different Banks
 *   3: All the Banks use the same function (getBalance from Abstract class
 *   4: Now  its time for testing :)
  */


public class AbstractTest {
    public static void main(String[] args) {
        //********************* Without Polymorphism *********************************
        // In Allied Bank
       AlliedBank elon=new AlliedBank("Elon Musk","Em233-Us444-t",39999999);
        // In UBL Bank
        Ubl elon1=new Ubl("Elon Musk","E4422-Us444",3433433);
        // In State Bank of Pakistan
       StateBankOfPakistan elon2=new StateBankOfPakistan("Elon Musk","Emm9172-Us444",99323433);
        //Now checkOut
        System.out.println("*********** Welcome to Allied Bank **************");
        System.out.printf("Customer Name : %s%n%s : %s%n%s= %.2f%n",elon.getName()
        ,"Bank Account Id",elon.getBankId(),"Total Balance",elon.getBalance());

        System.out.println("*********** Welcome to UBL Bank **************");
        System.out.printf("Customer Name : %s%n%s : %s%n%s= %.2f%n",elon1.getName()
                ,"Bank Account Id",elon1.getBankId(),"Total Balance",elon1.getBalance());

        System.out.println("*********** Welcome to State  Bank of Pakistan **************");
        System.out.printf("Customer Name : %s%n%s : %s%n%s= %.2f%n",elon2.getName()
                ,"Bank Account Id",elon2.getBankId(),"Total Balance",elon2.getBalance());

        /**
         * Now using polymorphism
         */
Bank b1=new AlliedBank("Ahmad","A444-3",3500);
        Bank b2=new StateBankOfPakistan("Nasir","D342-0",8500);
        Bank b3=new Ubl("Shahzad","544-6",5500);
        System.out.println("\n Using polymorphism");
        System.out.println("\n** BANK \t\tBalance**");
        System.out.printf("ALLIED BANK: %.2f\nUBL BANK: %.2f\nSTATE BANK OF PAKISTAN: %.2f",
                b1.getBalance(),b2.getBalance(),b3.getBalance());

    }
}
