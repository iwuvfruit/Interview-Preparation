class ListNode:
	def __init__(self, val=0, next=None):
		self.val = val
		self.next = next
class Solution:
	def reverseList(head):
		on = head
		prev = None 
		while on != None:
			temp = on.next
			on.next = prev
			prev = on
			on = temp
		return prev

	def reverseListR(self, on, prev=None):
		if on is None:
			return prev
		temp = on.next
		on.next = prev
		return reverseListR(temp, on)
