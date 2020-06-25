Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
    	levels = []
    	queue = [root]
    	while queue:
    		size = len(queue)
    		level = []
    		while size != 0:
    			item = queue(0)
    			level.append(item.val)
    			if item.left:
    				queue.append(item.left)
    			if item.right:
    				queue.append(item.right)
    			size -= 1
    		levels.append(level)
    	return level
        