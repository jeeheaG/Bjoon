a = int(input())
b = int(input())
hunb = int(b/100)
tenb = int(b/10)-hunb*10
oneb = b - tenb*10 - hunb*100
print(a*oneb, a*tenb, a*hunb, a*b, sep='\n')
