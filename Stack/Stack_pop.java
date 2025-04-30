
package javadatastrucutres;


public class Stack_pop {
    Node head;
    class Node{
    
    String data;
    Node next;
    
    Node(String data){
        this.data=data;
        this.next=null;
    
    }

    }
     public void push(String data){
        Node newnode=new Node(data);
        if(head==null){
        head=newnode;
        return;
        }
        newnode.next=head;
        head=newnode;
         
    
    }
    public void pop_stack(){
    if(head==null){
        System.out.println("stack already empty ");
        return;
    }
     head=head.next;
    
    
    }
     public void printstack(){
        Node current=head;
        if(head==null){
            System.out.println("stack is empty");}
        while(current!=null){
         System.out.println(current.data);
         current=current.next;
         
        
       
        }
        
    
    
    
    
    }
    public static void main(String[] args) {
        Stack_pop list=new Stack_pop();
       
        list.push("1");
        list.push("2");
        list.push("3"); 
        list.push("4");
        System.out.println("Orginal stack\n");
        list.printstack();
        list.pop_stack();
        System.out.println("stack after pop\n");
        list.printstack();
    }
    
}
