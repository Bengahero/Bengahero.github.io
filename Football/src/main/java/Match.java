import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Match {
    private Team A;
    private Team B;

    public Team getA() {
        return A;
    }

    public Team getB() {
        return B;
    }

    public void setA(Team a) {
        A = a;
    }

    public void setB(Team b) {
        B = b;
    }

    private void printTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
    public void matchStart(){
       printTime();
    }
    public void stopMatch(){
       printTime();
    }

}
