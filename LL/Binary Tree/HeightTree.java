import java.util.*;
public class HeightTree{
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

    static int height(Node root)
    {
        if(root == null)
            return 0;
        
        int left_height = height(root.left);
        int right_height = height(root.right);

        return 1 + Math.max(left_height,right_height); 
    }
    public static void main(String[] args) {
        String s = "10 20 30 40 60 N N";
        Node root = buildTree(s); 
        int ans = height(root);
        
        System.out.println(ans);
    }
}