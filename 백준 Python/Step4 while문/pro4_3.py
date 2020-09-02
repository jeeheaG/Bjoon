import sys
n=int(sys.stdin.readline())
num=n
i=0
while True :
    a=num//10
    b=num%10
    m=10*b+(a+b)%10
    i+=1
    num=m
    if m==n :
        break
print(i)
