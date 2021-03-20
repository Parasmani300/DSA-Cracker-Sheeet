def ndk(arr,k):
    dic  = {}
    for num in arr:
        try:
            dic[num] = dic[num] + 1
        except:
            dic[num] = 1
    
    div = len(arr)//k
    l = []
    for d in dic:
        if dic[d] >= div:
            l.append(d)
    return l

if __name__ == "__main__":
    arr = [4,5,6,7,8,4,4]
    k = 3
    l = ndk(arr,k)
    print(l)