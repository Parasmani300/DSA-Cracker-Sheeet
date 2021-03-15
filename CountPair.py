def countPair(arr,k):
    dic = {}
    for i in arr:
        try:
            dic[i] = dic[i] + 1
        except:
            dic[i] = 1
    
    twice_count = 0
    for i in range(len(arr)):
        try:
            a = dic[k - arr[i]]
            twice_count = twice_count + a

            if k - arr[i] == arr[i]:
                twice_count = twice_count - 1
        except:
            pass
    return twice_count//2

if __name__ == "__main__":
    arr = [1,2,3,4]
    k = 3
    c = countPair(arr,k)
    print(c)