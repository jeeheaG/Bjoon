#답은 맞는 거 같은데 백준 채점 시간초과 뜸.. 내일 다시!!!!

num = list(range(10000))

for n in range(10000) :
    while True :    #n이 초기생성자로 d(n) 무한 반복
        gen = n + n%10 + n//10 + n//100 + n//1000 + n//10000
        #print(n," 일 때 생성된 수는",gen)
        n = gen     #d(n)의 반복을 위함.
        if gen >10000 or gen == 0 :     #생성된 수가 10000을 넘으면 while문을 break하고 다음 생성자로
            break
        try :
            num.remove(gen)
        except :    #이미 삭제한 숫자라면 다음 d(n)반복으로.
            continue
        
for i in num :
    print(i)
