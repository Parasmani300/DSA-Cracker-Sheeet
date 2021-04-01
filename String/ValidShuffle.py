def Valid(first,second,result):
    for r in result:
        f1 = []
        s1 = []
        if len(first) + len(second) != len(r):
            print("No")
            continue
        for s in r:
            if s in first:
                f1.append(s)
            elif s in second:
                s1.append(s)
        if ''.join(f1) == first and ''.join(s1) == second:
            print("YES")
        else:
            print("No")
if __name__ == "__main__":
    first = "XY"
    second = "12"

    result = ["X12Y","Y12X"]
    Valid(first,second,result)
            