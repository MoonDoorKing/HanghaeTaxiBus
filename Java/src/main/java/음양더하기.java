class 음양더하기 {
    public int arraysum(int[] absolutes, boolean[] signs) {
        //같은 크기의 배열
        int answer = 0;

        for(int i=0;i<signs.length; i++) //signs 길이만큼 absolutes에도 반복문을 돌려서 true 면 answer 에 더해주고 false 면 빼준다.
        {
            if(signs[i] == true)  // signs 이 조건이 true 인 개체는 더해주고
            {
                answer += absolutes[i];
            }
            else // false 인 조건은 빼준다.
            {
                answer -= absolutes[i];
            }
        }

        return answer;
    }
    public static void main(String args[]){
        음양더하기 arraysum = new 음양더하기();
        int absolutes[] = {1,2,3,4,5,6,7,8};
        boolean signs[] = {true,false,true,false,true,true,false,true};
                        // 1 + -2 + 3 + -4 + 5 + 6 + -7 + 8 = 10
        System.out.println("결과 : "+arraysum.arraysum(absolutes,signs));
    }
}

// 어떤 정수들이 있습니다.
// 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
// 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

//signs의 길이는 absolutes의 길이와 같습니다.
//signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.