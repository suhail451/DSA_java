
package javadatastrucutres;

class linked {
    
    Node head;

   class Node{
    String data;
    Node next;
   
    Node(String data){
    this.data=data;
    this.next=null;
 
        }
   
   }
    public void addfirst(String data){
        Node newnode=new Node(data);
    if (head==null){
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
    Node current=head;
    while(current != null){
        System.out.println(current.data);
    current=current.next;
       
    
                  }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        
        linked list=new linked();
        
        
        list.addfirst("is");
        list.addfirst("suhail");
        list.addlast("genius");
         
       list.printlist();
    }
}
