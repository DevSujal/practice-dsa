public class MakingAClock {
     int hour = 0, min = 0, sec = 0;

     MakingAClock(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
     }

    public String toString(){
        return hour + " : " + min + " : " + sec;
    }
    
    public  void startClock() {

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.err.println("clock is terminated");
        }

        System.out.println(this);
        if(this.sec < 59){
            this.sec++;
        }
        else if(this.min < 59){
            this.min++;
            this.sec = 0;
        }
        else if(this.hour < 23){
            this.hour++;
            this.min = 0;
            this.sec = 0;
        }else{
            this.hour = 0;
            this.min = 0;
            this.sec = 0;
        }
        startClock();
    }

    public static void main(String[] args) {

        MakingAClock myClock = new MakingAClock(0, 0, 0);
        myClock.startClock();
    }
}
