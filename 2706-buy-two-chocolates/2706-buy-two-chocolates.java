class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int aa=prices[0]+prices[1];
        return money-aa>=0?money-aa:money;
    }
}