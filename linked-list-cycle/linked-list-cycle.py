# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        if head==None or head.next==None:
            return False
    
        curr_node = head
        nodes_seen = set()

        while curr_node:
            node = curr_node
            if node in nodes_seen:
                return True
            else:
                nodes_seen.add(node)

            curr_node = curr_node.next


        return False

            