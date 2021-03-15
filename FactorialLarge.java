public class FactorialLarge{
    static class Node{
        int data;
        Node prev;
        Node(int data){
            this.data = data;
            this.prev = null;
        }
    }

    public static void multiply(Node tail,int n)
    {
        Node temp = tail;
        Node prevNode = tail;

        int carry = 0;
        while(temp != null){
            int data = temp.data*n + carry;
            temp.data = data % 10;
            carry = data /10;
            prevNode = temp;
            temp = temp.prev;
        }

        while(carry != 0){
            prevNode.prev = new Node((int)carry%10);
            carry = carry / 10;
            prevNode = prevNode.prev;
        }
    }

    public static void print(Node tail)
    {
        if(tail == null)
            return;
        print(tail.prev);
        System.out.print(tail.data);

    }
    public static void main(String[] args) {
        int n = 1000;
        Node tail = new Node(1);
        for(int i = 2;i<= n;i++)
        {
            multiply(tail,i);
        }
        print(tail);
        System.out.println();
    }
}