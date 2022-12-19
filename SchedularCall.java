import java.util.Timer;

public class SchedularCall {

    public static void main(String [] args) {

        Timer timer = new Timer();
        SchedularMain scMain = new SchedularMain();

        timer.scheduleAtFixedRate(scMain, 0, 5000);
    }
}
