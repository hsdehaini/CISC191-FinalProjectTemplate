def gcf(x, y):
    while(y):
        x, y = y, x % y
    return x
def diophantine(a,b,c):
    (d, x, y) = extend(a, b)
    i = c / d
    return (i * x, i * y)
def dioph(a , b):
    g = gcf(a,b)
    (x0, y0) = diophantine(a, b, g) # The initial value
    d = gcf(a, b)
    p = a // d
    q = b // d
    print('Solutions:')
    for i in range(2):
        x = x0 + i * q
        y = y0 - i * p
        print('x =',x,'y =', y)

def greatestCommonDivisor(a, b):
    if a < b:
        a, b = b, a
    while a % b != 0:
        a, b = b, a % b
    return b
def extend(a, b):
    if b == 0:
        d, x, y = a, 1, 0
        return (d, x, y)
    else:
        (d, p, q) = extend(b, a % b)
        x = q
        y = p - q * (a // b)
        return (d, x, y)
dioph(2,5)
dioph(3,6)
dioph(5,15)
dioph(20,66)
dioph(55,32)
dioph(24,16)