import sys

T =  int(input())
if T <= 1000000 : 
    for i in (range(1, T+1)) :
        a,b = map(int, sys.stdin.readline().split())
        print(a+b)