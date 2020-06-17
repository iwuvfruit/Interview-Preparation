class BinaryTree:
	def __init__(self, value):
		self.value = value
		self.left = None
		self.right = None

def branchSums(root):
	sums = []
	helper(root, root.value, sums)
	return sums

def helper(node, runningSum, sums):
	if node is None:
		return
	newRunningSum = runningSum + node.value
	if node.left is None and node.right is None:
		sums.append(newRunningSum)
		return

	helper(node.left, runningSum, sums)
	helper(node.right, runningSum, sums)



