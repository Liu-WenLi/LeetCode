import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new LinkedList<>();
        boolean flag = false;
        int len = s.length();

        if (len % 2 == 1){
            return false;
        }

        for (int i = 0; i < len; i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else { // 字符 c 是右括号
                if (!stack.isEmpty() && leftOf(c) == stack.peek())
                    stack.pop();
                else
                    // 和最近的左括号不匹配
                    return false;
            }

        }
        return stack.isEmpty();
    }

    char leftOf(char c) {
        if (c == '}') return '{';
        if (c == ')') return '(';
        return '[';
    }
}

