import sys

T=int(sys.stdin.readline())
c=[]
for i in range(T) :
    a, b= sys.stdin.readline().rsplit()
    a=int(a)
    b=int(b)
    c.append(a+b)
for i in range(T) :
    print (c[i])
