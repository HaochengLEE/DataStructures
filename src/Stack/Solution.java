package Stack;
import java.util.Stack;

/**
 * @author lihaocheng
 * @create 2018-08-01 上午10:30
 **/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        for (int i=0;i<s.length();i++){
            //字符
            char c=s.charAt(i);
            //括号进栈
            if(c=='('||c=='['||c=='{') {
                stack.push(c);
            }
            else {
                if (stack.empty()){
                    return false;
                }

                char topChar=stack.pop();
                if(c==')'&&topChar!='(')
                    return false;
                if (c==']'&&topChar!='[')
                    return false;
                if (c=='}'&&topChar!='{')
                    return false;

            }
        }

        return stack.isEmpty();

    }

//    //测试用例
//    public static void main(String[] args) {
//        System.out.println(new Solution().isValid("{}[]()"));
//        System.out.println(new Solution().isValid("{}[()"));
//    }
}
