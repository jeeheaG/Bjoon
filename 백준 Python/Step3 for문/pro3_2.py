T = int(input())
i=1
c = []
while i<T+1 :
    a, b = map(int, input().split())
    c.append(a+b)
    i=i+1
for i in c :
    print(i)
