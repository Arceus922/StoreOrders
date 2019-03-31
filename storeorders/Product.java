/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeorders;

/**
 *
 * @author Arceus922
 */
class Product {
    
    public int quantity;
    public float value;
    public String name;
    public Product(int a, float b, String c)
    {
        this.quantity=a;
        this.value=b;
        this.name=c;
    }
}
