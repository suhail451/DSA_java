
package javadatastrucutres;


public class Stack_push {
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
        System.out.println("main method formed");
        Stack_push list=new Stack_push();
        list.push("1");
        list.push("2");
        list.push("3"); 
        list.push("4");
        list.printstack();

    }
    }

    
    
    
    
    
    

