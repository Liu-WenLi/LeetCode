两数之和这道题可以利用hash表来减少时间复杂度，因为hash表搜索的时间复杂为O(1),所以可以利用hash表来存储数据，遍历数组得到需要找的目标数字再到hash列表中搜索，总时间复杂度为O(n)，但是空间复杂度也为O(n)。对于无序数组，hash表是一种较好的解题思路。

导入hash表包

`import java.util.HashMap;`

初始化hash表

`HashMap<Integer, Integer> index = new HashMap<>();`

为hash加入key, value

`index.put(key, value);`

判断key是否存在hash表中

`index.containsKey(key);`

 取出hash表中key对应的value

 `index.get(key)`
