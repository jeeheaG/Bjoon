#이건 알파벳 갯수세는 걸로 백준 문제의도랑은 다르게 풀었음.
word=input()
alphaN=[]
alphabet=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
for i in range(26):
    alphaN.append(0)
for i in range(len(word)) :
    n=0
    for j in alphabet :
        if word[i] == j :
            alphaN[n] +=1
            print(i,'번째자리에 알파벳',j)
        n+=1
for j in range(26) :
    if alphaN[j]==0:
        alphaN[j] = -1
print(alphaN)
