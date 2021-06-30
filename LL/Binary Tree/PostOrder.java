import java.util.*;

public class PostOrder{
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

    // recursive
    static void recursive(Node root)
    {
        if(root == null)
            return;
        
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>(); 

        s1.push(root);

        while(s1.size() > 0)
        {
            Node temp = s1.pop();
            s2.push(temp);

            if(temp.left != null){
                s1.push(temp.left);
            }

            if(temp.right != null)
            {
                s1.push(temp.right);
            }
        }

        while(s2.size() > 0)
        {
            Node temp = s2.pop();
            System.out.print(temp.data  + " ");
        }
    }

    static void postorder(Node root){
        if(root == null)
            return;
        
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
        

    }

   

    public static void main(String[] args) {
        String s = "10 20 30 40 60 N N";
        Node root = buildTree(s);   

        postorder(root);
        System.out.println();
        recursive(root);
        
    }
}