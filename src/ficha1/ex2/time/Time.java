package ficha1.ex2.time;

import java.time.Duration;
import java.time.LocalDateTime;

public class Time {

    public long tempoGasto() {

        LocalDateTime init = LocalDateTime.now();

        long fact = 1;
        for (int i = 1; i <= 5000; i++) fact *= i;

        LocalDateTime end = LocalDateTime.now();
        
        return Duration.between(init, end).toMillis();

    }

}
