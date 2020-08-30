n,x = map(int, input().split())
nums = list(map(int, input().split()))
a=""
for i in range(n) :
    if nums[i]<x :
        a=a+str(nums[i])+" "
print(a)
