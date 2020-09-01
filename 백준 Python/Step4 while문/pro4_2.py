c=""
while True :
    nums = input()
    if not nums :
        break
    a = nums.split()
    c+=str(int(a[0])+int(a[1]))+"\n"
    
print(c)
