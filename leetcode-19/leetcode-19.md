删除链表中的某个节点

`l.next = l.next.next`

该题还可以用双指针（快慢指针）巧妙解决，首先用一个指针定位到k，再用一个指针定位到开头，两个指针同时移动
当快指针到末尾的时候，慢指针就到倒数第k个数了

该题还可以用栈数据结构做

定义一个栈

`Deque<ListNode> stack = new LinkedList<ListNode>();`

数据入栈

`stack.push(cur);`

数据出栈

`stack.pop();`

获取当前栈顶元素

`ListNode prev = stack.peek();`