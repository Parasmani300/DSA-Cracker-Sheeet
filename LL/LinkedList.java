public class LinkedList{
    Node head = null;
    static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public static void insert(LinkedList list,int data)
    {
        Node nn = new Node(data);
        nn.next = null;

        if(list.head == null)
        {
            list.head = nn;
        }else{
            Node temp = list.head;
            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = nn;
        }
    }

    public static void print(LinkedList ll)
    {
        Node temp = ll.head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        for(int i = 0;i<10;i++)
        {
            insert(ll,i);
        }

        print(ll);
    }
}