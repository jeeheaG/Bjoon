a,b = input().split()
a=int(a)
b=int(b)
at = a%10*100 + int(a/10)%10*10 + int(a/100)%10
bt = b%10*100 + int(b/10)%10*10 + int(b/100)%10
m = at
if at<bt :
    m=bt
print(m)
