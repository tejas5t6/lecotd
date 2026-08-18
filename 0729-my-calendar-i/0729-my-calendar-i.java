class MyCalendar {
Map<Integer,Integer> mpp;
    public MyCalendar() {
         mpp=new TreeMap<Integer,Integer>();
    }
    
    public boolean book(int startTime, int endTime) {
         mpp.put(startTime,mpp.getOrDefault(startTime,0)+1);
        mpp.put(endTime,mpp.getOrDefault(endTime,0)-1);
        int bookings=0;
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            bookings=bookings+entry.getValue();
            if(bookings>1){
                mpp.put(startTime,mpp.getOrDefault(startTime,0)-1);
                mpp.put(endTime,mpp.getOrDefault(endTime,0)+1);
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */