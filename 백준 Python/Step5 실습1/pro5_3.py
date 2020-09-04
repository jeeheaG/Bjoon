#자료형이 문자열이어도 크기비교가 된다. 사전순으로.
#그러니 답은 잘 나왔는데 '틀렸습니다'가 뜬다면 답 출력의 자료형이 숫자여야 하는건지 문자여야 하는건지 한번 확인해보자.

import sys
a=[]
for t in sys.stdin.readline().split() :
    a.append(int(t))

a.sort()
print(a[1])

'''이 코드도 잘 돌아감!!! 출력 자료형을 숫자로 안해서 계속 에러나는 거였음
for j in range(len(a)) :
    for i in range(2) :
        if a[i]>a[i+1] :
            a[i],a[i+1] = a[i+1], a[i]
            
print(a[len(a)//2])
'''
