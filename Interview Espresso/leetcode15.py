def threeSum(nums):
	output = []
	nums.sort()
	length = len(nums)
	for i in range(length):
		left, right = i+1, length-1
		if nums[i-1] == nums[i]:
			continue 
		while(left < right):
			total = nums[i] + nums[left] + nums[right]
			if total == 0:
				output.append([nums[i], nums[left], nums[right]])
				while nums[left+1] == nums[left]:
					left += 1
				while nums[right-1] == nums[right]:
					right -= 1
				left += 1
				right -= 1
			elif total > 0:
				right -= 1
			else:
				left += 1
	return output 