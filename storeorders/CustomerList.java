/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeorders;

import java.util.ArrayList;

/**
 *
 * @author Arceus922
 */

public class CustomerList {
public ArrayList<Customer> Customers=new ArrayList<>();

public void ProductList(int a)
    {
        int i,j,h;
        float k;
        k=TotalPrice(a);
        a--;
        System.out.println("The customer has bought:");
        for(i=0;i<this.Customers.get(a).np;i++)
        {
            
            System.out.println((i+1)+") "+this.Customers.get(a).Cart.get(i).name+"("+this.Customers.get(a).Cart.get(i).value+" euro per unit), quantity: "+this.Customers.get(a).Cart.get(i).quantity+" Price: "+((float)this.Customers.get(a).Cart.get(i).quantity*this.Customers.get(a).Cart.get(i).value));
            
        }
        System.out.println("Total price: "+k);
    }
    public float TotalPrice(int a)
    {
        float h;
        int i;
        a--;
        h=0;
        for(i=0;i<this.Customers.get(a).np;i++)
        {
            h=h+( (float)this.Customers.get(a).Cart.get(i).quantity * this.Customers.get(a).Cart.get(i).value);
        }
        return h;
    }
    public float RemainingPrice(int a)
    {
        float h;
        h=TotalPrice(a);
        a--;
        h=h-this.Customers.get(a).paid;
        return h;
    }
    public void AddCustomer(String a, String b, String c, float d, int e){
        Customers.add(new Customer(a,b,c,d,e));
    }
    public void ListCust()
    {
        int i;
        System.out.println("The current custimers in the kist are:");
        for(i=0;i<this.Customers.size();i++)
        {
            System.out.println((i+1)+") "+this.Customers.get(i).namec);
        }
    }
     public void DelCust(int a)
     {
         this.Customers.remove(a-1);
     }
     public void NewPaid(int a, float b)
     {
         a--;
         this.Customers.get(a).paid=b;
     }
     public void SendInv(int a)
     {
         float b;
         b=TotalPrice(a);
         a--;
         if(this.Customers.get(a).paid==b)
         {
             System.out.println("This invoice got send to "+this.Customers.get(a).ba+" billing account");
             ProductList(a);
             System.out.println("Those products were sent to "+this.Customers.get(a).adress);
         }
         else
         {
             System.out.println("The ammount paid is not equal to the total amount of the products! Please try again after the paid value has been changed!");
         }
     }
     public void AddProd(int a,String b,float c,int d)
     {
         a--;
         this.Customers.get(a).Cart.add(new Product(d,c,b));
         this.Customers.get(a).np++;
     }
     public void RemoveProd(int a, int b)
     {
         a--;
         b--;
         this.Customers.get(a).Cart.remove(b);
     }
}