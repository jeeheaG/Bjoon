import sys

T=sys.stdin.readline()
T=int(T)
for i in range(T) :
    a,b = sys.stdin.readline().rsplit()
    a=int(a)
    b=int(b)
    c=str(a+b)
    d=str(i+1)
    print("Case #"+d+":",a,"+",b,"=",c)
