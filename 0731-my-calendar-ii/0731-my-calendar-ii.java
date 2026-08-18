class MyCalendarTwo {
Map<Integer,Integer> mpp;
    public MyCalendarTwo() {
        mpp=new TreeMap<Integer,Integer>();
    }
    
    public boolean book(int startTime, int endTime) {
        mpp.put(startTime,mpp.getOrDefault(startTime,0)+1);
        mpp.put(endTime,mpp.getOrDefault(endTime,0)-1);
        int bookings=0;
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            bookings=bookings+entry.getValue();
            if(bookings>2){
                mpp.put(startTime,mpp.getOrDefault(startTime,0)-1);
                mpp.put(endTime,mpp.getOrDefault(endTime,0)+1);
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */