import sys
n=sys.stdin.readline()
n=int(n)
for i in range (n) :
    a=""
    for j in range(n-i-1) :
        a=a+" "
    for k in range(i+1) :
        a=a+"*"
    print(a)
