public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long pay =0; //처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수

        for(int i=0; i <= count; i++)
        {
            pay += (price * i);  // price 가 100원 이면 100 + 200 + 300 식으로 더해져야함 pay = pay + price * i 와 같음

            if(pay <= money) // 가진 돈이 내야할 돈보다 많으면 0을 반환
            {
                answer = 0;
            }
            else // 가진 돈이 내야할 돈보다 적으면
            {
                answer = pay - money;   // pay 에서 money 를 빼서 모자란 금액을 반환
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        부족한금액계산하기 Account = new 부족한금액계산하기();
        System.out.println("결과 : "+ Account.solution(100,1000,6));
    }
}

//새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
// 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
//놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
//단, 금액이 부족하지 않으면 0을 return 하세요.

//입출력 예 #1
//이용금액이 3인 놀이기구를 4번 타고 싶은 고객이 현재 가진 금액이 20이라면,
// 총 필요한 놀이기구의 이용 금액은 30 (= 3+6+9+12) 이 되어 10만큼 부족하므로 10을 return 합니다.