public class Reverse1{
    Node head = null;
    static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public static void insert(Reverse1 list,int data)
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

    // Reverse way -1 Time o(n) and space o(n)
    public static void reverse(Reverse1 ll)
    {
        Node temp = ll.head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];   // Inefficent o ignoring
        temp = ll.head;
        int i = count-1;
        while(temp != null){
            arr[i--] = temp.data;
            temp = temp.next;
        }

        i = 0;
        temp = ll.head;
        while(temp != null){
            temp.data = arr[i++];
            temp = temp.next;
        }
    }

    // Efficient process time o(n) space o(1) 
    /*
        ll:  1 -> 2 -> 3 -> 4 -> null

        to convert:
        null <- 1 <- 2 <- 3 <- 4

        Algo:
        three pointers prev,current,next
        prev = null
        next = null
        current = head

        while current is not null:
            next = current -> next;
            current -> next = prev;
            prev = current;
            current = next;
    */

    public static void rev(Reverse1 ll)
    {
        Node prev = null;
        Node next = null;
        Node current = ll.head;

        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        ll.head = prev;
    }

    public static void print(Reverse1 ll)
    {
        Node temp = ll.head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Reverse1 ll =new Reverse1();
        for(int i = 0;i<10;i++)
        {
            insert(ll,i);
        }
        // reverse(ll);
        rev(ll);
        print(ll);
    }
}