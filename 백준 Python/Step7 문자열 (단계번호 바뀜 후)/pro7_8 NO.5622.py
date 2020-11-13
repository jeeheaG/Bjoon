s = input()
t = 0
for i in range(len(s)):
    if s[i] in 'ABC':
        t+=3
        continue;
    elif s[i] in 'DEF' :
        t+=4
        continue;
    elif s[i] in 'GHI' :
        t+=5
        continue;
    elif s[i] in 'JKL' :
        t+=6
        continue;
    elif s[i] in 'MNO' :
        t+=7
        continue;
    elif s[i] in 'PQRS' :
        t+=8
        continue;
    elif s[i] in 'TUV' :
        t+=9
        continue;
    elif s[i] in 'WXYZ' :
        t+=10
        continue;
print(t)
