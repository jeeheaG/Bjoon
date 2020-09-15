import sys
case = int(sys.stdin.readline())

for j in range(case) :
    score = []
    for i in sys.stdin.readline().split() :
        score.append(int(i))
    total=0
    for i in range(1,score[0]+1) :
        total +=score[i]
    mean = total/score[0]
    high=0
    for i in range(1,score[0]+1) :
        if score[i]>mean :
            high+=1

    print(str("%0.3f" % float(float(high)/score[0]*100))+"%")
#소수점 자릿수 조절해서 나타내려면 식의 숫자 중 하나를 float로 해주고, 앞에 "%0.3f" %를 붙여줘야 함. 3은 소수점 3자리수까지 나타내라는 의미 
#for문은 내가 지정한 횟수까지 실행하는게 아니라 지정한 횟수가 되면 실행하지 않고 멈춘다는 거 꼭 헷갈리지 않기.
