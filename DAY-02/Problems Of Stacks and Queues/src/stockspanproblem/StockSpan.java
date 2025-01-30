package stockspanproblem;

import java.util.Stack;

class StockSpan {

    public void findSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currentPrice = stocks[i];

            while (!s.isEmpty() && currentPrice >= stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                int prevHigh  = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }
}
