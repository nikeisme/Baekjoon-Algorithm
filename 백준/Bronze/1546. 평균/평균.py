cnt=int(input())
list=list(map(int,input().split()))
max_score = max(list)

new_list = []
for score in list:
    new_list.append(score/max_score*100)
avg= sum(new_list)/cnt
print(avg)
