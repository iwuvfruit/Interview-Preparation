#given bst and target, find the val that's closest to the target
# recursive
# we set closest to the max
# we traverse comparing target-node.val and if its smaller than the closest, we set closest to target-node.val 
# since it's bst, we traverse such that if target < node.val then ex) 6 < 15 then 6 < right. remove right side --> go to node.left 
# if target > node.val then ex) 6 > 3 then 6 > 2 we remove left side --> go to node.right 

class BST:
	def __init__(self, value):
		self.value = value
		self.left = None
		self.right = None

	def insert(self, value):
		if value < self.value:
			if self.left is None:
				self.left = BST(value)
			else:
				self.left.insert(value)
		else:
			if self.right is None:
				self.right = BST(value)
			else:
				self.right.insert(value)
		return self

test_tree = BST(100).insert(5).insert(15).insert(5).insert(2).insert(1).insert(22) \
		.insert(1).insert(1).insert(3).insert(1).insert(1).insert(502).insert(55000) \
		.insert(204).insert(205).insert(207).insert(206).insert(208).insert(203) \
		.insert(-51).insert(-403).insert(1001).insert(57).insert(60).insert(4500)

def findClosestBST(tree, target):
    return helperIterative(tree, target, float("inf"))





def helper(tree, target, closest):
	if tree is None:
		return closest
	if abs(target - closest) > abs(tree.value - target):
		closest = tree.value
	if target < tree.value:
		return helper(tree.left, target, closest)
	elif target > tree.value:
		return helper(tree.right, target, closest)
	else:
		return closest

def helperIterative(tree, target, closest):
	current_node = tree
	while current_node is not None:
		if abs(target - closest) > abs(current_node.value - target):
			closest = current_node.value
		if target < current_node.value: 
			current_node = current_node.left
		elif target > current_node.value:
			current_node = current_node.right
		else:
			break
	return closest

closest_val = findClosestBST(test_tree, 10)
print(closest_val)