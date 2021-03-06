def reverse(arr,start,end):
    if start >= end:
        return
    arr[start],arr[end] = arr[end],arr[start]
    return reverse(arr,start+1,end-1)

if __name__ == "__main__":
    arr = [1,2,3,4,5,6,7]
    reverse(arr,0,len(arr)-1)
    print(arr)