total = int(input())
cnt = int(input())

for i in range(cnt):
    
    price,units = map(int,input().split())
    total -= (price * units)
    
print("Yes" if total== 0 else "No")