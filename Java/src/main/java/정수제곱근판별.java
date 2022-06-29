public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;

        for (long i=1; i <= n; i++)
        {
            if(i * i == n)
            {
                answer = (i+1) * (i+1);
                break;
            }
            else answer = -1;
        }

        return answer;
    }
    public static void main(String[] args) {
        정수제곱근판별 num =  new 정수제곱근판별();
        System.out.println("결과 : " + num.solution(100) );
    }
}


// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

// n은 1이상, 50000000000000 이하인 양의 정수입니다.