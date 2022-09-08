import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> s = new ArrayList<String>();
        backtrack(s, 0, 2 * n, 0, 0, new StringBuffer());
        return s;
    }

    public void backtrack(List<String> s, int index, int p, int lr, int ls, StringBuffer combination) {
        if (index == p) {
            s.add(combination.toString());
        }
        else {
            if (ls < (p / 2)) {
                combination.append('(');
                backtrack(s, index + 1, p, lr + 1, ls + 1, combination);
                combination.deleteCharAt(index);
            }
            if (lr > 0) {
                combination.append(')');
                backtrack(s, index + 1, p, lr - 1, ls,  combination);
                combination.deleteCharAt(index);
            }
        }

    }

}