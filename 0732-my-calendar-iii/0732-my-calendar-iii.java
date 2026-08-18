class MyCalendarThree {
Map<Integer,Integer> mpp;
    public MyCalendarThree() {
        mpp=new TreeMap<Integer,Integer>();
    }
    
    public int book(int startTime, int endTime) {
         mpp.put(startTime,mpp.getOrDefault(startTime,0)+1);
        mpp.put(endTime,mpp.getOrDefault(endTime,0)-1);
        int bookings=0;
        int maxBookings=0;
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            bookings=bookings+entry.getValue();
             maxBookings = Math.max(maxBookings, bookings);
           
        }
        return maxBookings;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */