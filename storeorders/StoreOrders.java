/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeorders;

import java.util.Scanner;

/**
 *
 * @author Arceus922
 */
public class StoreOrders {
    
    
    
    int i,j;
    public static void main(String[] args) {
        
        CustomerList Customers=new CustomerList();
        Scanner in = new Scanner(System.in);
        int b,c,d,e;
        float f;
        String bac,na,adr;
        b=1;
        do
        {   
            if(b==1)
            {
            System.out.println("Add a customer:");
            System.out.println("Type the name of the customer:");
            na=in.nextLine();
            System.out.println("Type the adress of the customer:");
            adr=in.nextLine();
            System.out.println("Type the bank account of the customer:");
            bac=in.nextLine();
            System.out.println("Type the number of different products the customer ordered:");
            c=in.nextInt();
            in.nextLine();
            System.out.println("Type the amonunt of money the customer already paid(if none then type 0 ):");
            f=in.nextFloat();
            in.nextLine();
            Customers.AddCustomer(bac,adr,na,f,c);
            }
            if(b==2)
            {
                Customers.ListCust();
            }
            if(b==3)
            {
                System.out.println("Type the index number of the customer you want to delete:");
                d=in.nextInt();
                in.nextLine();
                Customers.DelCust(d);
            }
            if(b==4)
            {
                System.out.println("Type the index number of the customer you want to change the value of paid money:");
                c=in.nextInt();
                in.nextLine();
                System.out.println("Type total amount that the customer paid up untill now:");
                f=in.nextFloat();
                in.nextLine();
                Customers.NewPaid(c, f);
            }
            if(b==6)
            {
                System.out.println("Type the index number of the customer you want to check the ammount of money he owes:");
                c=in.nextInt();
                in.nextLine();
                f=Customers.RemainingPrice(c);
                System.out.println("The customer still owes "+f+" (if f<0 it means that we owe the customer money therefore this should be mentioned to your supervisor!)");
            }
            if(b==5)
            {
                System.out.println("Type the index number of the customer you want to send the invoice and products:");
                c=in.nextInt();
                in.nextLine();
                Customers.SendInv(c);
            }
            if(b==7)
            {
                System.out.println("Type the index number of the customer you want to list the products:");
                c=in.nextInt();
                in.nextLine();
                Customers.ProductList(c);
            }
            if(b==8)
            {
                System.out.println("Type the index number of the customer you want to add a product");
                c=in.nextInt();
                in.nextLine();
                System.out.println("Type the name of the product:");
                na=in.nextLine();
                System.out.println("Type the price of the product");
                f=in.nextInt();
                in.nextLine();
                System.out.println("Type the quantity of the product");
                e=in.nextInt();
                in.nextLine();
                Customers.AddProd(c, na, f, e);
            }
            if(b==9)
            {
                System.out.println("Type the index number of the customer you want to remove a product");
                c=in.nextInt();
                in.nextLine();
                System.out.println("Type the index number of the product you want to remove");
                d=in.nextInt();
                in.nextLine();
                Customers.RemoveProd(c, d);
            }
            if(b>9||b<0)
            {
                 System.out.println("The choice you entered dont match to any given choice! Try again.");
            }
            System.out.println("Chose an option:(with the coresponding number as input)");
            System.out.println("1 Add a customer and their order");
            System.out.println("2 List the customers");
            System.out.println("3 Remove a customer");
            System.out.println("4 change the ammount paid by a customer");
            System.out.println("5 send invoice and products");
            System.out.println("6 check for the remainig ammount of money to be paid");
            System.out.println("7 list the bought products of a customer");
            System.out.println("8 add a product to a customer");
            System.out.println("9 remove a product from a customer");
            System.out.println("0 exit");
            b=in.nextInt();
            in.nextLine();
        }
        while(b!=0);
       
    }
    
}
