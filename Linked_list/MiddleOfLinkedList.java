package javadatastrucutres;

public class MiddleOfLinkedList {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(String data) {
        Node newnode1 = new Node(data);
        if (head == null) {
            head = newnode1;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newnode1;
    }
// Function to find the middle value of linked list 
    public void middlelink() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        MiddleOfLinkedList list = new MiddleOfLinkedList();
        list.addfirst("is");
        list.addfirst("suhail");
        list.addfirst("ahmed");
        list.addfirst("tahir");
        list.addfirst("awais");
        list.addfirst("amjad");
        list.middlelink();
    }
}
