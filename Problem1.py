#find missing element from array

def findMissingElement(nums):
  start, end = 0, len(nums)-1
  while start <= end:
    mid = start + (end - start) // 2
    if nums[mid] - mid != nums[start] - start:
      end = mid
    elif nums[end] - end != nums[mid] - mid:
      start = mid
    if end - start <= 1:
      return nums[start]+1
    

x = findMissingElement([1,2,3,5,6,7,8,9])
print(x)
