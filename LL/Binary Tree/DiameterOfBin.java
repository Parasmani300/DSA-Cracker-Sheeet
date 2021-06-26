/*
Intution:

Diameter = max(leftDiameter,RightDiameter,leftHeight+RightHeight)

Reason: The diameter wither reside in the left or reside in the right or be our common case i.e (left Height + rigth height)

*/
import java.util.*;

public class DiameterOfBin{
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

    // Approach 1-- uncontrolled recusrsion
    static int height(Node root)
    {
        if(root == null)
            return 0;
        
        int left_height = height(root.left);
        int right_height = height(root.right);

        return 1 + Math.max(left_height,right_height); 
    }

    // Approach 2 -- take both height and diameter as pair whenever required to call it saves the no of call made on height
    static class Pair{
        int h;
        int d;

        public Pair(int h,int d)
        {
            this.h = h;
            this.d = d;
        }
    }

    // Approach 2
    public static Pair heightDiameter(Node root)
    {
        if(root == null)
        {
            Pair p = new Pair(0,0);
            return p;
        }

        Pair lp = heightDiameter(root.left);
        Pair rp = heightDiameter(root.right);
        int height = 1 + Math.max(lp.h,rp.h);
        int option1 = lp.h + rp.h;
        int option2 = lp.d;
        int option3 = rp.d;

        int diameter = Math.max(option1,Math.max(option2,option3));
        Pair ans = new Pair(height,diameter);
        return ans;
    }

    // Approach 1
    static int diameter(Node root)
    {
        if(root == null)
            return 0;
        
        int hmax = height(root.left) + height(root.right);
        int ld = diameter(root.left);
        int rd = diameter(root.right);

        return Math.max(hmax,Math.max(ld,rd));
    }


    public static void main(String[] args)
    {
        String s = "10 20 30 40 60 N N";
        Node root = buildTree(s); 

        // int ans = diameter(root);
        Pair ans = heightDiameter(root);
        System.out.println(ans.d);
        // System.out.println(ans);

    }
}