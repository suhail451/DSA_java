/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatastrucutres;

/**
 *
 * @author arain
 */
public class reverse_linked {
    

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

    public void printlist() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public static void main(String[] args) {
        reverse_linked list = new reverse_linked();
        list.addfirst("is");
        list.addfirst("suhail");
        list.addfirst("ahmed");
        list.addfirst("tahir");
        list.addfirst("awais");
        list.addfirst("amjad");

        System.out.println("Original List:");
        list.printlist();

        list.reverse();

        System.out.println("Reversed List:");
        list.printlist();
    }
}


