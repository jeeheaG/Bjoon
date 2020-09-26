import sys
n = int(sys.stdin.readline());
hanCount = 0;
for test in range(1, n+1) : #한수인지 테스트해볼 숫자 test
    each =[];
    big = len(str(test)); #몇자리수인지 구하기.
    for i in range(big-1,-1,-1) : #자리수별로 찢기. 4자리수라면 3부터 -1까지로 범위를 정해줘야 인덱스 3 2 1 0 로 자리에 맞게 4번 실행됨.
        each.append(int((test/10**i)%10));
       # print(each)
    han = False;
    if big == 1 or big == 2 : #한자리수,두자리수면 모두 한수.
        han = True;
        #print('한자리수, 두자리수=한수')
    else :
        for i in range(big-2) : #몇번 비교할지. 세자리수면 1번, 네자리수면 2번만 하면 비교하면 됨.
            if each[i]-each[i+1] == each[i+1]-each[i+2] :
                han = True;
                #print('한수통과',test,i,' : ',han)
            else :
                han = False;
                #print('한수아님.break',test,i,' : ',han)
                break; # 하나라도 같지 않으면 등차수열이 아니므로 반복문 탈출.
    if han == True :
        hanCount += 1;
        #print(hanCount)
print(hanCount);
