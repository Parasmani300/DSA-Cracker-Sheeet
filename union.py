def union(arr1,arr2):
    for i in arr2:
        if i not in arr1:
            arr1.append(i)
    
    print(arr1)

if __name__ == "__main__":
    arr1 = [1,2,3,4,5]
    arr2 = [1,2,3]
    union(arr1,arr2)