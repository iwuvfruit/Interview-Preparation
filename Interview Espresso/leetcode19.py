class ListNode(object):
	"""docstring for ListNode"""
	def __init__(self, value):
		self.value = value
		self.next = null

	def removeNthNodeFromTheEnd(head, n):
		on = head
		while(on):
			length += 1
			on = on.next 
		deleteIndex = length - n -1
		on = head
		while(deleteIndex > 1):
			deleteIndex -= 1
			on = on.next
		on = on.next.next
		return head 

