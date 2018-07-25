import java.util.Stack;

/**
 * Created by huzaifa.aejaz on 7/24/18.
 */

class MinStack {

        Stack<Integer> stack;
        int min;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<Integer>();
            min = Integer.MAX_VALUE;
        }

        public void push(int x) {
            if(x <= min){
                System.out.println("pushing  " + min);
                stack.push(min);
                min = x;
                System.out.println("min set to" + x);

            }
            stack.push(x);
            System.out.println("pushing  " + x);

        }

        public int pop() {
            int pop = stack.pop();
            if(pop==min) min = stack.pop();
            return pop;
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
}

