#0 1 1 2 3 5 8 13 21 34

#O(2^n time)
#O(n) space
#using recursion
def getNthFib(n):
	if n == 2:
		return 1
	elif n == 1:
		return 0
	else:
		return getNthFib(n-1) + getNthFib(n-2)

#using memoization
#O(n) time
#O(n) space
def getNthFib(n, memoize = {1:0, 2:1}):
	if n in memoize:
		return memoize[n]
	else:
		memoize[n] = getNthFib(n-1, memoize) + getNthFib(n-2, memoize)
		return memoize[n]

#using iterative approach
def getNthFib(n):
	lastTwo = [0, 1]
	counter =  3 #start from 3 since 0 for the first, 1 for the second
 	while counter <= n:
		nextFib = lastTwo[0] + lastTwo[1]
		lastTwo[0] = lastTwo[1]
		lastTwo[1] = nextFib
		counter += 1
	return lastTwo[1] if n > 1 else lastTwo[0] #edge case: if we the input is 1, we want to return 0 


