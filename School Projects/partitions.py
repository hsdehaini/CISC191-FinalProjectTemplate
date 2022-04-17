
def partition(n, k):
    a = [[0 for i in range(k+1)]
        for j in range(n+1)]
    for i in range(n+1):
        a[i][0] = 0
    for i in range(k+1):
        a[0][k] = 0
    for i in range(1, n+1):
        for j in range(1, k+1):
            if (j == 1 or i == j):
                a[i][j] = 1
            else:
                    a[i][j] = (j * a[i-1][j] + a[i-1][j-1])
    return a[n][k]
def part(n):
    ret = 0
    for i in range(0,n+1):
        ret += partition(n,i)
    return ret


for x in range(0,51):
    print('P(' , x,') =' , part(x))