public class 콜라츠추측 {
    public int solution(int num) {
        long n = num; // int 를 쓰면 오버플로우가 나와서 프로그래머스 통과가 안됌...
        int answer= 0;

        while(n != 1) // 1 일시 멈춤
        {  //짝수 일 시
            if(n % 2 ==0)
                n /= 2;
            else //홀수 일 시
                n = n * 3 + 1;

            answer++; // while 문이 돌때마다 answer 를 +1 해줌

            if(answer > 500)
                return -1;
        }


        return answer;
    }

    public static void main(String[] args) {

    }
}
