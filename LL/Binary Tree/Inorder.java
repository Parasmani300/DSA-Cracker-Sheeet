import java.util.*;

public class Inorder{
    static class Node{
        int data;
        Node left = null;
        Node right = null;
        Node(int data)
        {
            this.data = data;
        }
    }

    static Node buildTree(String str)
    {
        if(str.length() == 0 || str.charAt(0) == 'N'){
            return null;
        }

        String[] arr = str.split(" ");
        Node root = new Node(Integer.parseInt(arr[0]));

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while(q.size() > 0 && i < arr.length)
        {
            Node currNode = q.peek();
            q.remove();

            String curVal = arr[i];

            if(!curVal.equals("N")){
                currNode.left = new Node(Integer.parseInt(arr[i]));
                q.add(currNode.left);
            }

            i++;
            if(i >= arr.length)
            {
                break;
            }

            curVal = arr[i];
            if(!curVal.equals("N")){
                currNode.right = new Node(Integer.parseInt(arr[i]));
                q.add(currNode.right);
            }
            i++;

        }

        return root;

    }

    // recursive approach
    static void recursive(Node root)
    {
        if(root == null)
            return;
        
        Stack<Node> s = new Stack<>();

        Node current = root;

        while(current != null || s.size() > 0)
        {
            while(current != null){
                s.push(current);
                current = current.left;
            }

            current = s.pop();
            System.out.print(current.data  + " ");

            current = current.right;
        }
    }

    static void inorder(Node root){
        if(root == null)
            return;
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

   

    public static void main(String[] args) {
        String s = "10 20 30 40 60 N N";
        Node root = buildTree(s);   

        inorder(root);
        System.out.println();
        recursive(root);
    }
}