friend_nodes = int(input())
friend_edge = int(input())

arr = {}
for i in range(friend_edge):
    a = int(input())
    b = int(input())
    i = int(input())
    try:
        arr[i].append(a)
        arr[i].append(b)
    except:
        arr[i] = [a,b]
max1 = 0
for i in arr:
    s = list(set(arr[i]))
    print(s)
    p = 1
    for j in s:
        p = p*j
    if p > max1:
        max1 = p
print(max1)
