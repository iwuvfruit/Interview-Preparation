#tail recursive 
#passing trhough everything we need on each recursive call, 
#calculated before recursive call
def addZeroToN(n, sum = 0):
	if n == 0:
		return sum
	return addZeroToN(n-1, n + sum)

#normal recursive
#performing addition on bubble up steps/expression wait for stack frames to finish 
def addZeroToN(n):
	if n == 0:
		return 0
	return n + addZeroToN(n-1)