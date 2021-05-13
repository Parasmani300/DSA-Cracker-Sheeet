#include<stdio.h>
#include<stdlib.h>


int findPivot(int *arr,int low,int high)
{
	
	if(high < low)
		return -1;
	if(high == low)
		return low;
		
	int mid = (low + high)/2;
	
	if(mid < high && arr[mid] > arr[mid+1])
	{
		return mid;
	}
	
	if(mid > low && arr[mid] < arr[mid-1]){
		return (mid-1);
	}
	
	if(arr[low] >= arr[mid])
		return findPivot(arr,low,mid-1);
	return findPivot(arr,mid+1,high);
}

int binarySearch(int *arr,int low,int high,int e)
{
	if(high < low){
		return -1;
	}
		int mid = (low + high)/2;
		if(arr[mid] == e)
			return mid;
		
		if(e >= arr[mid])
			return binarySearch(arr,mid+1,high,e);
		return binarySearch(arr,low,mid-1,e);
	
}

int pivotedBinarySearch(int *arr,int n,int e)
{
	int pivot = findPivot(arr,0,n-1);
	
	if(pivot == -1)
		return binarySearch(arr,0,n-1,e);
	
	if(arr[pivot] == e)
		return pivot;
	if(arr[0] <= e)
		return binarySearch(arr,0,pivot-1,e);
	return binarySearch(arr,pivot+1,n-1,e);
}
int main()
{
	int arr[] = {4,5,6,7,0,1,2};
	int n = sizeof(arr) / sizeof(arr[0]);
	int target = 0;
	
	int ans = pivotedBinarySearch(arr,n,target);
	printf("%d",ans);
	
	
}