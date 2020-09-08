import sys
n = int(sys.stdin.readline())
fl=""
sl=""

for j in range(1,n+1) :
    if j%2==1 : #홀수
        fl+="* "
    else :#짝수
        sl+=" *"

for i in range(n-1) :
    print(fl)
    print(sl+" ")

print(fl)
print(sl)
#백준채점 출력되는 답이 공백까지 맞아야 돼서 이렇게 쓴겨
