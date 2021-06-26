import java.util.*;

public class LevelOrderTraversal{
    // Node root;
    static class Node{
        int data;
        Node left = null;
        Node right = null;
        Node(int data)
        {
            this.data = data;
        }
    }

    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null)
        {
            return al;
        }
        // Your code here
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        while(q.size() != 0)
        {
            Node current = q.peek();
            al.add(current.data);
            if(current.left != null){
                q.add(current.left);
            }
            
            if(current.right != null)
            {
                q.add(current.right);
            }
            
            q.remove();
        }
        
        return al;
        
        
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
    public static void main(String[] args) {
        String s = "10 20 30 40 60 N N";
        Node root = buildTree(s);
        ArrayList<Integer> al = levelOrder(root);

        for(Integer i : al)
        {
            System.out.print(i + " ");
        }
    }
}