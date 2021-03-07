public class KthSmallest{
    public static void heapify(int[] arr,int n,int i)
    {
        int largest = i; //Initialize the largest as root
        int l = 2*i + 1; //left 
        int r = 2*i + 2; //right

        // if left child is larger than the largest so far
        if(l < n && arr[l] > arr[largest]){
            largest = l; 
        }

        // if right child is larget than the largest so far
        if(r < n && arr[r] > arr[largest]){
            largest = r;
        }

        // if largest is  not the root
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // recurisvely heapify the affected sub tree
            heapify(arr,n,largest);
        }
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int n = arr.length;
        for(int i = arr.length/2 -  1;i>=0;i--){
            heapify(arr,n,i);
        }
        
        for(int i = n-1;i>k-1;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr,i,0);
        }
        
        return arr[k-1];
    } 
    public static void main(String[] args)
    {
        int[] arr = {1,3,5,2,7,99,33,2};
        int a = kthSmallest(arr,0,arr.length-1,3);
        
        System.out.print(a);
        
    }
}