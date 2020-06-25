class TreeNode:
	def __init__(self, x):
		self.value = x
		self.left = None
		self.right = None

class Solution:
	def maxDepth(self, root):
		if not root:
			return 0
		return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))

	def maxDeptUsingBFS(self, root):
		queue= [root]
		depth = 0
		while queue:
			size = len(queue)
			while size > 0:
				item = queue.pop(0)
				if item.left:
					queue.append(item.left)
				if item.right:
					queue.append(item.right)
				size -= 1
		return depth