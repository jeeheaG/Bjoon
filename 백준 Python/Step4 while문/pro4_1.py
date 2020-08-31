SUM=""
a=b=""
while a!=0 and b!=0 :
    a,b = map(int, input().split())
    if a!=0 and b!=0:
        c=str(a+b)
        SUM+=c+"\n"
print(SUM)
    
