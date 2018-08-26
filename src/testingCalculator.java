import java.util.Stack;

/**
 * Created by huzaifa.aejaz on 8/25/18.
 */
public class testingCalculator {
   int basicCalculator(String expression){
            int num = 0;
            Stack<Integer> stack = new Stack<>();
            int in = 0;
            char sign = '+';
            while( in < expression.length()){
                char ch = expression.charAt(in);
                if(Character.isDigit(ch)){
                    num = num * 10 + ch - '0';
                }
                if(!Character.isDigit(ch) || in == expression.length()-1){
                    if(sign =='+'){
                        stack.push(num);
                    }else
                    if(sign=='-'){
                        stack.push(-num);
                    }else
                    if(sign == '*'){
                        stack.push(stack.pop()*num);
                    }else
                    if(sign =='/'){
                        stack.push(stack.pop()*num);
                    }
                    sign = ch;
                    num = 0;
                }
                in++;
            }
            int sum = 0;

            for(int k = 0; k < stack.size(); k++){
                sum += stack.pop();
            }
            return sum;
        }
}
