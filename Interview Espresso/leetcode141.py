# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
    	nodes = set()
    	on = head
    	while on != None:
    		if on in nodes:
    			return True
    		nodes.add(on)
    		on = on.next
    	return False
    def hasCycle(self, head: ListNode) -> bool:
    	fast = slow = head
    	while fast and fast.next:
    		slow = slow.next
    		fast = fast.next.next
    		if slow == fast:
    			return True
    	return False 


        