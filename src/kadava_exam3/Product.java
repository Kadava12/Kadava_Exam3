/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kadava_exam3;

/**
 *
 * @author chris
 */
public class Product {
   String name;
    double page;
    int priority ;

    public Product(String name, double page, int priority) {
        this.name = name;
        this.page = page;
        this.priority = priority;
    }

    
    public String toString() {
        return "Name: " + name + ", Page " + page + ", Priority: " + priority;
    }
}
