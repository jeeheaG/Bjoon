#아스키 코드를 사용하면 더 깔끔할까?? 알파벳 26개
s = input()
alphabet=["a","A","b","B","c","C","d","D","e","E","f","F","g","G","h","H","i","I","j","J","k","K","l","L","m","M","n","N","o","O","p","P","q","Q","r","R","s","S","t","T","u","U","v","V","w","W","x","X","y","Y","z","Z"]
count = [0]*26
maxi = -1
for i in range(len(s)) :
    for j in range(26) : #알파벳 26개와 비교
        if s[i] == alphabet[2*j] or s[i] == alphabet[2*j+1] :
            count[j] +=1
            #print(s[i],'의 인덱스는' ,j)
#print(["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"])
#print(count)
#print(max(count))
#print(count.index(max(count)))
maxi = count.index(max(count))
only = True
for i in range(26) :
    if max(count) == count[i] :
        if i != maxi :
            only = False
if only == False :
    print('?')
elif only == True :
    print(alphabet[2*maxi+1])
    

        
