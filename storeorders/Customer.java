/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeorders;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Arceus922
 */
class Customer {
    public String ba;
    public String namec;
    public String adress;
    public float paid;
    public int np;
    int i,j;
    float k;
    String l;
    Scanner in = new Scanner(System.in);
    public ArrayList<Product> Cart=new ArrayList<>();
    public Customer(String a, String b, String c, float d, int e)
    {
        this.ba=a;
        this.adress=b;
        this.namec=c;
        this.paid=d;
        this.np=e;
        for(i=0;i<e;i++)
        {
            System.out.println("For the product "+(i+1));
            System.out.println("Type the name of the ordered product:");
            l=in.nextLine();
            System.out.println("Type the price of the ordered product:");
            k=in.nextFloat();
            in.nextLine();
            System.out.println("Type the ammount of the ordered product:");
            j=in.nextInt();
            in.nextLine();
            Cart.add(new Product(j,k,l));
        }
    }
    
}
