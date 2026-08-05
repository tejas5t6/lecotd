class Solution {
    public int minOperations(String[] logs) {
      int count = 0 ;

        for(var log : logs)
        {
            if(log.equals("../"))
            {
                if(count > 0)
                    count-- ;
            }
            else if(log.equals("./"))
                continue ;

            else
                count++ ;

        }
        return count ;
    }
}