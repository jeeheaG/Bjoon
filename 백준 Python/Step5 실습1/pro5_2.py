import sys
burger=[]
drink=[]
for n in range(3) :
    burger.append(int(sys.stdin.readline()))
for m in range(2) :
    drink.append(int(sys.stdin.readline()))
'''실행은 되는데 백준 채점 오류남..
for i in range(2) :
    if burger[i]<burger[i+1] :
        b = burger[i]
    else:
        b = burger[i+1]
if drink[0]<drink[1] :
    d = drink[0]
else :
    d = drink[1]
'''
#b = min(burger)
#d = min(drink)
#print (b,d)
print(min(burger)+min(drink) - 50)

