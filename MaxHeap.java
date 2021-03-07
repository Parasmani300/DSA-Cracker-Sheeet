public class MaxHeap{
    public static  void sort(int[] arr){
        int n = arr.length;

        // Building heap --> rearrangin array
        for(int i = n/2 - 1;i>=0;i--){
            heapify(arr,n,i);
        }

        // One by one extract an element from heap
        for(int i = n-1;i>0;i--){
            // move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr,i,0);
        }
    }

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
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,7,99,33,2};

        sort(arr);

        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}