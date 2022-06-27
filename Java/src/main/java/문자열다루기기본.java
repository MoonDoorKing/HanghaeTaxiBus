public class 문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6) //s 의 길이는 4이거나 6이다.
        {
            for(int i=0; i<s.length(); i++) // 문자열 s의 크기만큼 반복문을 돌린 뒤
            {
                if(!Character.isDigit(s.charAt(i))) // Character.isDigit는 문자열이 숫자가 아닌경우 false 숫자인 경우 true
                    answer=false; // 반복문을 돌려 각각의 문자를 비교해서 문자라면 false 반환
            }
        }
        else
        {
            answer = false; // s 의 길이가 4나 6이 아닐시 false 반환
        }

        return answer;
    }
    public static void main(String args[]) {
        문자열다루기기본 text = new 문자열다루기기본();
        System.out.println("결과 : "+ text.solution("a1234"));
    }
}

//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
// 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.