三种解法：

1、顺序合并

以合并两个有序列表为基础，顺序合并k个列表

2、分治合并

以合并两个有序列表为基础，使用分治的方法合并k个列表，关键代码如下：

``` JAVA
private ListNode recursion(ListNode[] lists, int left, int right) {
    if(left == right){
        return lists[left];
    }
    int mid = left+(right-left)/2;
    ListNode leftList = recursion(lists, left, mid);
    ListNode rightList = recursion(lists, mid+1, right);
    return merge2Lists(leftList, rightList);
}
```

3、优先队列

优先级队列这种数据结构有一个很有用的功能，你插入或者删除元素的时候，元素会自动排序。
因此，具体做法为先插入k个有序列表中的头节点，取优先队列中的头节点（最小的），然后插入该节点的
下一个节点，并继续取头节点直到，优先队列为空。

定义一个比较val大小的优先队列:

``` JAVA
PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b)->(a.val - b.val));
```

上述优先队列按照val从小到大排序，若需要从大到小排序则需要改为

``` JAVA
PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b)->(b.val - a.val));
```

优先队列添加元素，和输出队列顶端元素
``` JAVA
pq.peek()//返回队首元素
pq.poll()//返回队首元素，队首元素出队列
pq.add()//添加元素
pq.size()//返回队列元素个数
pq.isEmpty()//判断队列是否为空，为空返回true,不空返回false
```