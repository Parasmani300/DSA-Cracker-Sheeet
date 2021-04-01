def commonMatrix(mat):
    dic = {}
    for i in range(len(mat)):
        mat[i].sort()
        dic[mat[i][0]] = 1
        for j in range(1,len(mat[0])):
            try:
                if(mat[i][j-1] != mat[i][j]):
                    dic[mat[i][j]] = dic[mat[i][j]] + 1
            except:
                dic[mat[i][j]] = 1
        
        for k in dic:
            if dic[k] == len(mat):
                print(k)

if __name__ == "__main__":
    mat = [[1,2,1,4,8],
            [3,7,8,5,1],
            [8,7,7,3,1],
            [8,1,2,7,9]
          ]
    commonMatrix(mat)