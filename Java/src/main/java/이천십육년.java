import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class 이천십육년 {
    public String solution(int a, int b) {
        String answer = "";

        Calendar cal = Calendar.getInstance();

        cal.set(2016, a-1, b);
        Date date = cal.getTime();

        SimpleDateFormat y2016 = new SimpleDateFormat("E", Locale.ENGLISH);

        answer = y2016.format(date).toUpperCase();

        return answer;
    }

    public static void main(String args[]) {
        이천십육년 y2016 = new 이천십육년();
        System.out.println("결과는 : "+ y2016.solution(1,1));

    }
}
