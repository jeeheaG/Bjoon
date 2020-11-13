#아스키코드 사용하면 반복문돌려서 더 짧아질 줄 알았는데 숫자도 헷갈리고(이건 공부가 되는거니까 괜찮지만) 버튼 당 알파벳갯수가 4개인 것들이 섞여있어서 어차피 경우를 나누어 주어야 했다.
s = input()
t = 0
for i in range(len(s)): ### s의 문자 한개씩
    for j in range(8): ### 다이얼 버튼 8개-버튼 번호에 따라 아래if문 중 한가지로 들어감.
        #print(i,'번째 문자와 숫자 ',j+2,'번 버튼 비교')
        if j <= 4 :
            a = 65+j*3 ### j=0 일때 a=65=A의 아스키코드 j=1일때 a=68=D의 아스키코드...
            #print(i,'번째 문자의 아스키코드',ord(s[i]),'와  숫자',a,a+1,a+2,'비교') 
            if s[i] in [chr(a), chr(a+1), chr(a+2)] :
                t += j+3
                #print('2~6번 버튼',t, j+3)
                break
        elif j == 5 :
            a = 65+j*3 ### j=5 일때 a=80=P의 아스키코드, 문자 4개 비교.
            #print(i,'번째 문자의 아스키코드',ord(s[i]),'와  숫자',a,a+1,a+2,a+3,'비교') 
            if s[i] in [chr(a), chr(a+1), chr(a+2), chr(a+3)] :
                t += j+3
                #print('7번 버튼',t, j+3)
                break
        elif j == 6 :
            a = 65+j*3+1 ### j=6 일때 a=84=T의 아스키코드
            #print(i,'번째 문자의 아스키코드',ord(s[i]),'와  숫자',a,a+1,a+2,'비교') 
            if s[i] in [chr(a), chr(a+1), chr(a+2)] :
                t += j+3
                #print('8번 버튼',t, j+3)
                break
        elif j == 7 :
            a = 65+j*3+1 ### j=7 일때 a=87=W의 아스키코드, 문자 4개 비교.
            #print(i,'번째 문자의 아스키코드',ord(s[i]),'와  숫자',a,a+1,a+2,a+3,'비교') 
            if s[i] in [chr(a), chr(a+1), chr(a+2), chr(a+3)] :
                t += j+3
                #print('9번 버튼',t, j+3)
                break
        #print(i,'번째 문자 비교 끝~~');
print(t)

''' 풀이 흔적
                        #65 66 67 #0 #65+0 +1 +2 #3*0
    elif s[i] in 'DEF' : #68 69 70 #1 #+3 +4 +5 #3*1
        t+=4
        continue;
    elif s[i] in 'GHI' : #71 72 73 #2 #+6 +7 +8
        t+=5
        continue;
    elif s[i] in 'JKL' : #74 75 76 #3 #+9 +10 +11
        t+=6
        continue;
    elif s[i] in 'MNO' : #77 78 79 #4 #+12 +13 +14
        t+=7
        continue;
    elif s[i] in 'PQRS' : #80 81 82 83 #5 #+15 +16 +17 +18 #3*5
        t+=8
        continue;
    elif s[i] in 'TUV' : #84 85 86 #6 #+19 +20 +21 #3*6+1
        t+=9
        continue;
    elif s[i] in 'WXYZ' : #87 88 89 90 #7 #+22 +23 +24 +25 #3*7+1
        t+=10
        continue;
'''
