import sys
n = int(sys.stdin.readline())
for j in range(n) :
    count=0
    score=0
    answer = sys.stdin.readline()
    for i in range(len(answer)) :
        if answer[i] == 'O' :
            count += 1
            score += count
        elif answer[i] == 'X' :
            count = 0;
    print(score)
