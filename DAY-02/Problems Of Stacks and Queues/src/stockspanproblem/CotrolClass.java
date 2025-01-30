package stockspanproblem;

public class CotrolClass {
    public static void main(String[] args) {
    int[] stocks = {100,80,60,70,60,85,100};
    int[] span = new int [stocks.length];

    StockSpan obj = new StockSpan();
    obj.findSpan(stocks,span);

    for(int num : span){
        System.out.print(num+" ");
    }
    }
}
