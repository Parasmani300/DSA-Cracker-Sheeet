def swap(l,i,j):
    temp = l[i]
    l[i] = l[j]
    l[j] = temp

def reverse(l,start):
    i = start
    j = len(l)-1
    while i < j:
        swap(l,i,j)
        i = i + 1
        j = j - 1

def nextPermutation(l):
    i = len(l)-2
    while i >= 0 and l[i+1] <= l[i]:
        i = i - 1
    
    if i >= 0:
        j = len(l)-1
        while j >= 0 and l[j] <= l[i]:
            j = j - 1
        
        swap(l,i,j)
    reverse(l,i+1)

    
if __name__ == "__main__":
    l = [1,2,3]
    nextPermutation(l)
    print(l)

