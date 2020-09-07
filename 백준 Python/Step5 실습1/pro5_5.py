import sys
n = int(sys.stdin.readline())
a=""
for k in range(n) :
    a=k*" "+(2*(n-k)-1)*"*"
    print(a)
for j in range(n-1) :
    a=(n-j-2)*" "+(2*j+3)*"*"
    print(a)
