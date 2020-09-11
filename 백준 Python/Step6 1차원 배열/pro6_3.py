import sys
n=[]
for i in range(3) :
    n.append(int(sys.stdin.readline()))
mul = n[0]*n[1]*n[2]

mul = str(mul)
c=[]
for i in range(10) :
    c.append(mul.count(str(i)))
for i in c :
    print(i)
