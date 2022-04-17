prime = [True for i in range(2000 + 1)]
p = 2
while(p*p<= 2000):
    if (prime[p] == True):
        for i in range(p*2,2000+1,p):
            prime[i] = False
    p += 1
prime[0]= False
prime[1]= False
l = []
for p in range(2000 + 1):
    if prime[p]:
        l.append(p)
print(l)