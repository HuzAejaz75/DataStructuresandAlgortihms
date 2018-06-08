import java.util.Stack;

/**
 * Created by huzaifa.aejaz on 5/21/18.
 */
public class longestValidParenthesis {
    public int validParenthesis(String s){
    int maxans = 0;
    Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i = 0; i< s.length(); i++){
        if(s.charAt(i)=='('){
            stack.push(i);
        }
        else{
            stack.pop();
            if(stack.empty()){
                stack.push(i);
            }
            else
            {
                maxans = Math.max(maxans,i-stack.peek());
            }
        }
    }
        return maxans;

}
}
