import sys
n = int(sys.stdin.readline())
score=[]
newSc =[]
total=0
for i in sys.stdin.readline().split() :
    score.append(int(i))

for i in score :
    newSc.append(i/max(score)*100)
for i in newSc :
    total += i
print(total/n)
    
