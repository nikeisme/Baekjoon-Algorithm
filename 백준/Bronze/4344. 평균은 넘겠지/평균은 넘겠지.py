n = int(input())

for i in range(n):
    nums = list(map(int, input().split()))
    avg = sum(nums[1:])/nums[0] 
    cnt = 0
    for score in nums[1:]:
        if score > avg:
            cnt += 1 
    result= cnt/nums[0] *100
    print(f'{result:.3f}%')
    
