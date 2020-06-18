#we pass in empty array and put the root node to the array
#we recursively call depth first search on it's child- reaching it to the deppest branch 

class Node:
	def __init__(self, name):
		self.children = []
		self.name = name

	def addChildren(self, name):
		self.children.append(Node(name))

	def depthFirstSearch(self, array):
		array.append(self.name)
		for child in self.children:
			child.depthFirstSearch(array)
		return array