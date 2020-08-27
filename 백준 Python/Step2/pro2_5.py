h, m = map(int, input().split())
if m>=45 : #분이 45보다 커서 시는 바뀌지 않음.
    m=m-45 
elif m<45 :#시도 바뀜
    #m=60-(45-m)
    m=15+m
    if h == 0 :
        h=23
    else :
        h=h-1
else :
    print("error")
print(h,m)

