
def twoSum(array, target):
	for i in range(len(array)-1):
		current = array[i]
		for j in range(i+1, len(array)-1):
			second = array[j]
			if current + second == target:
				return [first, second]
	return []

def twoSum2(array, target):
	nums = {}
	for num in array:
		find = target - num
		if find in nums:
			return [find, num]
		else:
			nums[num] = True
	return {}

def twoSum3(array, target):
	array.sort()
	left = 0
	right = len(array) -1
	while left < right:
		val = array[left] + array[right]
		if val == target:
			return [array[left], array[right]]
		elif val < target:
			left += 1
		elif val > target:
			right -= 1
	return []
