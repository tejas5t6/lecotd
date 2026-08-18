class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Map<Integer,Integer> mpp=new TreeMap<Integer,Integer>();
        for(int trip[]:trips) 
        {
            mpp.put(trip[1],mpp.getOrDefault(trip[1],0)+trip[0]);
            mpp.put(trip[2],mpp.getOrDefault(trip[2],0)-trip[0]);
         }
        int bookings=0;
        
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            bookings=bookings+entry.getValue();
             if(bookings>capacity)return false;

        }
        return true;
    }
}