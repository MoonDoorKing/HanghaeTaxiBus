import java.util.ArrayList;
import java.util.Arrays;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";

        int num = Arrays.asList(seoul).indexOf("Kim"); //자바 배열에선 indexOf 미지원으로 asList() 를 사용해 ArrayList 로 변환시켜 인덱스를 구함.

        return answer = "김서방은 " + num + "에 있다";
    }
    public static void main(String[] args) {
        서울에서김서방찾기 kim = new 서울에서김서방찾기();
        String seoul[] = {"king","Jane","Kim","park","john"};
        System.out.println(kim.solution(seoul));
    }
}

//String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아,
//"김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

//seoul은 길이 1 이상, 1000 이하인 배열입니다.
//seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
//"Kim"은 반드시 seoul 안에 포함되어 있습니다.