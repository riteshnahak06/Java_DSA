package com.dsa.linkedlist;

public class MySingleLinkedList {
    Node head;
    int size;
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }
    public void printList(){
        if (head==null){
            System.out.println("No Data in the list");
        }
        Node currentNode=head;
        while (currentNode!=null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }
    public int getSize() {
        return this.size;
    }

}
class Test{
    public static void main(String[] args) {
        MySingleLinkedList linkedList=new MySingleLinkedList();
        System.out.println(linkedList.getSize());
        linkedList.addFirst(22);
        linkedList.addFirst(33);
        linkedList.addLast(44);
        linkedList.printList();
        System.out.println(linkedList.getSize());
    }
}
