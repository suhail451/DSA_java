package javadatastrucutres;

class ll {
    
    private int size;
    Node head;
    
    ll(){
        this.size=0;

    }
    
    class Node{
        
        String data;
        Node next;
        
        Node(String data){
        this.data=data;
        this.next=null;
        size++;
        }    
                   }
    
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;       
        }
        newnode.next=head;
        head=newnode;
    }
    
    public void addlast(String data){
        Node newnode1=new Node(data);
        if(head==null){
            head=newnode1;
            return;    
        }
        Node current=head;
        while(current.next != null){
            current=current.next;       
        }
        current.next=newnode1;   
    }
    
    public void printlist(){
    
        if(head==null){
            System.out.println("sorry list is empty there is nothing to display ");
        }
        Node current=head;
        while(current != null){
            System.out.println(current.data);
            current=current.next;   
        }
        System.out.println("null");
    }
  
    public void deletefirst(){
        size--;
        if(head==null){
            System.out.println("sorry the list is already empty we can not delte it further");
        }
        head=head.next;
    }
    
    public void deletelast(){
        size--;
        if(head==null){
            System.out.println("sorry the list is already empty we can not delete this ");
        return;
        }
        Node current=head.next;
        Node previous=head;  
        while(current.next != null){
            current=current.next;
            previous=previous.next;
        }
        previous.next=null;
    }
    
    public int getsize(){
        return size;
    }
    
    
 
    public static void main(String[] args) {
            
        ll list=new ll();
        list.addfirst("suhail");
        list.addfirst("you");
        
        list.addlast("great");
        list.deletelast();
        list.deletefirst();
        list.printlist();
        System.out.println(list.getsize());
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

