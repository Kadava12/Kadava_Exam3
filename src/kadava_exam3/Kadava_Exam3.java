/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kadava_exam3;



import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Kadava_Exam3 {
private class PriorityQueuesArray{
            
            int priority;
            int data;
          
       PriorityQueuesArray next;           
        }

    private PriorityQueuesArray front = null;
   static int printCount = 0;
    public int deletion() throws Exception{
          if (front == null){
              throw new Exception("Queue is Empty");
          } 
          int temporary = front.data;
          front = front.next;
            
           return temporary; 
        
        }
    private void insertion(int item, int priority){
            PriorityQueuesArray node = new PriorityQueuesArray();
            node.data=item;
            node.priority = priority;
            node.next = null;
            
            
            if (front == null || priority <= front.priority) {
                node.next = front;
                front = node;
            }
            else{
                PriorityQueuesArray temporary = front;
                while (temporary.next != null && temporary.next.priority <= priority) {                    
                    temporary = temporary.next;
                }
                   node.next = temporary.next;
                   temporary.next = node;
               printCount++;
               
               }
            
        }
     
        public void display() throws Exception{
            if (front == null){
              throw new Exception("Queue is Empty");
          }
            PriorityQueuesArray temporary = front;
            System.out.println("=======================");
            System.out.println("Priority \t\t Number");
            
            while(temporary != null){
                
                      
                   System.out.println(temporary.priority + "\t\t" + temporary.data);
                temporary = temporary.next;

            }
            System.out.println("\n");
        }

    public static void main(String[] args) throws Exception {
       Kadava_Exam3 list=new Kadava_Exam3();
        Scanner scanner = new Scanner(System.in);
        boolean ins = true;
        while (ins) {            
            System.out.println("=======================================");
            System.out.println("Enter Number: ");
                    int item = scanner.nextInt();
                    System.out.println("==============================================");
                    System.out.println("Enter Priority: ");
                    int priority = scanner.nextInt();
                      
                    list.insertion(item, priority);
                     if(printCount>4){
                         list.deletion();
                     }
                        
                    
                    list.display();
        }
                
    }
    
}
            