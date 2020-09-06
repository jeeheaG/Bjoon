import sys
n = int(sys.stdin.readline())
a=""
for i in range(n) :
    a+="*"
    print(a)
for i in range(n-1) :
    a=(n-1-i)*"*"
    print(a)
