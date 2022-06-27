public class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer;
        int cnt1 = 0;
        int cnt2 = 0;

        String s1 = s.toLowerCase(); //소문자로 모두 변환
        for(int i=0; i<s1.length(); i++)
        {
            if('y'==s1.charAt(i)) //char 는 기본자료형 이기때문에 == 로도 값을 비교 가능
                cnt1++;
            if('p'==s1.charAt(i))
                cnt2++;
        }

        if(cnt1 == cnt2) // cnt1 과 cnt2 갯수가 같으면 true 반환
        {
            answer = true;
        }
        else
        {
            answer = false;
        }

        return answer;
    }
    public static void main(String args[]) {
        문자열내p와y의개수 text = new 문자열내p와y의개수();

        System.out.println("결과 : " + text.solution("Pppyyy"));
    }
}



// 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
// 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
// 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
// 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

//입출력 예 #1
//'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.

//입출력 예 #2
//'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.