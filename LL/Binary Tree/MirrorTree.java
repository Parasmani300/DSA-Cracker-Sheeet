public class MirrorTree{
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

    static Node mirrorit(Node node){
        // Your code here
        if(node == null)
            return null;
            
       Node left = mirrorit(node.left);
       Node right = mirrorit(node.right);
       
       node.left = right;
       node.right = left;
       
       return node;
    }

    void mirror(Node node) {
        mirrorit(node);
    }

    public static void main(String[] args) {
        String s = "10 20 30 40 60 N N";
        Node root = buildTree(s);   
        
        
    }
}