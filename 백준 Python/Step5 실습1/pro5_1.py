import sys
score = []
for i in range (5) :
    a = int(sys.stdin.readline())
    if a <= 40 :
        a = 40
    score.append(a)
print((score[0]+score[1]+score[2]+score[3]+score[4])//5)
    
