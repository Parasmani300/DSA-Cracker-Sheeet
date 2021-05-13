public class ReverseLL{
    Node head = null;
    static class Node{
        int data;
        Node next;
    }

    public static void printNode(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args)
    {
        Node n1 = new Node();
        n1.data = 12;
        n1.next = null;

        head = n1;
        head->next = null;
    }
}