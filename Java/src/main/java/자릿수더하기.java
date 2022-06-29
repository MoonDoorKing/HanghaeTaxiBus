public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        while(n!=0) // 0 일시 멈춤
        {
            answer += n % 10; // 10으로 나눈 나머지만 answer 에 더해줌

            n = n / 10; // n을 10 으로 나눔 ex) 12345 면 1234 로 만듦.
        }


        return answer;
    }
    public static void main(String args[]) {
        자릿수더하기 sum = new 자릿수더하기();
        System.out.println("결과 : " + sum.solution(12));
    }
}
