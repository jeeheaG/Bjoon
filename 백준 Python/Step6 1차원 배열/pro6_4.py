import sys
n=[]
remlist=[]

for i in range(10) :
    here = False                        #!!이거 때문에 헤!! here값은 숫자가 새로 입력될 때마다 False로 초기화되어야 하므로 여기에 선언.
    n.append(int(sys.stdin.readline())) #숫자 하나 입력받음
    rem = n[i]%42                       #그걸 42로 나눈 나머지를 구함
    for j in remlist :                      #방금 구한 나머지와 나머지들을 모아둔 리스트의 항목들 중 같은 게 있는지 비교
        if j == rem :
            here = True                     #같은 게 있으면 here에 False를 지우고 True값을 저장해둠. 반복문 탈출
            break
    if here == False :                      #here값이 False면 같은 게 없었을테니 나머지리스트에 새로 추가함
        remlist.append(rem)
#for i in range(len(remlist)) :          
 #   print(remlist[i])
print(len(remlist))                         #remlist의 길이(서로다른 나머지의 개수)를 출력함
