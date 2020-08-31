import sys
c=""
while True :
    a,b=map(int, sys.stdin.readline().rsplit())
    if a==0 and b==0 :
        break
    c+=str(a+b)+"\n"
print(c)
