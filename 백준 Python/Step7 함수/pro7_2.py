#답은 맞는 거 같은데 백준 채점 시간초과 뜸.. 내일 다시!!!!
big = 10001
num = list(range(big))

for n in range(big) : #n이 초기생성자
        gen = n + n%10 + n//10%10 + n//100%10 + n//1000%10 + n//10000
        try :
            num.remove(gen)
            ''' 오류를 캐냈던 코드
            if gen == 9993 :
                    print(gen,'을 지운 생성자는', n)
                    print(n, '일 때 ', n//10000, n//1000%10, n//100%10, n//10%10, n%10, n, " 생성된 수는",gen)
                '''
        except :    #이미 삭제한 숫자라면 다음 n으로.
            continue

#print(num)
for i in num :
    print(i)
