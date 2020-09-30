import sys
n = int(sys.stdin.readline());
num = sys.stdin.readline();
s = 0;
for i in range(n) :
    s += int(num[i])
print(s);
