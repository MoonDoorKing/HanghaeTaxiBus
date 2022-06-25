public class 없는숫자더하기 {
    public int sum(int numbers[]) {
        int answer=45;  //0 부터 9까지의 합을 구해서

        for(int i : numbers) // for each 문으로 반복문을 돌려서
        {
            answer -= i;  // 총 합에서 지금 현재 반복문이 돌아가는 numbers 의 합을 빼준다.
        }

        return answer; // 그럼 빠진 숫자의 총 합이 나온다.
    }
    public static void main(String args[]) {
        없는숫자더하기 없는숫자 = new 없는숫자더하기();
        int numbers[] = {0,1,2,3,5,7,8,9};
        System.out.println("결과는 : "+ 없는숫자.sum(numbers));
    }
}
