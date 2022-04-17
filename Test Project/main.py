p=[]
for i in range(2,2000,1):
    c=0
    for j in range(2,i,1):
        if(i%j==0):
            c=1
            break
    if(c==0):
        p.append(i)
for i in range(len(p)):
        print(p[i])