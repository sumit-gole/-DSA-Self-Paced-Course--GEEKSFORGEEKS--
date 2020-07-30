if __name__ == "__main__":
    t = int(input())
    while(t>0):
        matsize = [int(x) for x in input().strip().split()]
        n = matsize[0]
        m = matsize[1]
        mat = [[0 for i in range(m)] for j in range(n)]
        row = [0 for i in range(n)]
        for i in range(n):
            list = [int(x) for x in input().strip().split()]
            for j in range(m):
                mat[i][j] = list[j]
                if(mat[i][j]==1):
                    row[i]=1
        for i in range(n):
            for j in range(m):
                if(row[i]==1):
                    print(1, end=" ")
                else:
                    print(0, end=" ")
            print()
        t=t-1
