H, M = map(int,input().split())
i = int(input())

h = (H + ((M + i) // 60)) % 24
m = (M + i) % 60

print(h,m)