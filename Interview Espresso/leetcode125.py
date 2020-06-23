def isPalindrome(s):
	return ''.join(reversed(s)) == s
#but how about special characters such as spaces
def isPalindrome(s):
	#str.isalnums
	#filter(str.isalnums, s)
	#''.join(filter(str.isalnums, s))
	s = ''.join(filter(str.isalnums, s))
	return ''.join(reversed(s)) == s

def isPalindrome(s):
	s = ''.join(filter(str.isalnums, s))
	left = 0
	right = len(s) - 1
	while left < right:
		if s[left] != s[right]:
			return False
		left += 1
		right -= 1
	return True