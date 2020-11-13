s = input()
t = 0
for i in range(len(s)): #s의 문자 한개씩
    for j in range(9): #다이얼 버튼 9개 
        a = j+65 #j=0 일때 a=65=A의 아스키코드 j=3일때 a=68=D의 아스키코드
        if s[i] in [chr(a), chr(a+1), chr(a+2)] :
            t += i+3
            continue;
print(t)
    
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
    elif s[i] in 'PQRS' : #5
        t+=8
        continue;
    elif s[i] in 'TUV' :
        t+=9
        continue;
    elif s[i] in 'WXYZ' : #7
        t+=10
        continue;
    elif s[i] in 'DEF' :
        t+=11
        continue;

