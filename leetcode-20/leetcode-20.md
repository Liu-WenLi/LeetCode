栈是一种先进后出的数据结构，处理括号问题的时候尤其有用。

遇到左括号就入栈，遇到右括号就去栈中寻找最近的左括号，看是否匹配。

双端队列接口 Deque 即可以当队列又可以当栈

`Deque deque = new LinkedList()`

出栈和入栈操作(元素添加到末尾)

`deque.pop()` `deque.push()`

出队列和入队列（元素添加到开头）

`deque.add()` `deque.off()`

读取双端队列开头元素（队列和栈都适用）

`deque.peek()`