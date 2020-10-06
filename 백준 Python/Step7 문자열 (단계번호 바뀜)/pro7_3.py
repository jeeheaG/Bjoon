word=input()
alphaN=[]
alphabet=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
for i in range(26):     #출력에 쓰일 문자열 기본틀 생성
    alphaN.append(-1)
    
for i in range(len(word)) :
    washere = False
    if i != 0:          #인덱스0 제외 실행. 앞에 동일 문자가 있을 경우 반복문 탈출, 다음 반복 실행
        for j in range(i):
            if word[i] == word[j]:
                washere = True;
    if washere :
        continue
    
    for j in alphabet :
        if word[i] == j :
            alphaN[alphabet.index(j)] = i
            #print(i,'번째자리에 알파벳',j)
            break
        
p=""        #출력용 코드
for i in alphaN:
    p+=str(i)
    p+=" "
print(p)
