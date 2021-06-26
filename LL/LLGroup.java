public class LLGroup{
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static void print(Node head)
    {
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void insert(Node head,int data)
    {
        Node temp = head;

        Node new_node = new Node(data);
        new_node.next = null;
        
        if(temp == null)
        {
            head = new_node;
        }else{
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }  
    public static void main(String[] args) {
        LLGroup ll = new LLGroup();

        int[] arr = {1,3,4,5,6,2,6};
        int k = 3;

        for(int i = 0;i<n;i++){
            insert(ll.head,arr[i]);
        }


    }
}