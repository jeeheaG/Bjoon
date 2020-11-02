t=int(input())
for _ in range(t):
    r,s=input().split(' ')
    p=''
    for i in range(len(s)):
        for j in range(int(r)) :
            p += s[i]
    print(p)
