import sys
n = int(sys.stdin.readline())
num = []
for i in map(int, sys.stdin.readline().split()) :
    num.append(i)
    
print(min(num), max(num))
