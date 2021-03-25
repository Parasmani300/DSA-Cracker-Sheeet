def ascii(s):
    asc1 = [ord(i) for i in s]
    ans = asc1[0]
    for i in range(1,len(asc1)):
        ans = ans^asc1[i]
    return ans

s = "Qwert"
a = ascii(s)
print(a)