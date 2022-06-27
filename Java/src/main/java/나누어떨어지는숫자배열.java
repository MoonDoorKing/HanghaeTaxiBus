import java.util.*;


public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int n : arr) // foreach 문 사용
        {
            if (n % divisor == 0) // n 을 divisor 로 나눴을때 나머지가 0이면
            {
                list.add(n);
            }
        }

        if (list.isEmpty()) // 리스트에 아무것도 없으면 -1 을 추가
        {
            list.add(-1);
        }

        Collections.sort(list); // 오름차순 정렬

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String args[]) {
        나누어떨어지는숫자배열 list = new 나누어떨어지는숫자배열();

        int arr[] = {5, 9, 7, 10};

        System.out.println("결과 : " + Arrays.toString(list.solution(arr,5))); //배열 출력력

    }
}

//aray의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

//arr은 자연수를 담은 배열입니다.
//정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//divisor는 자연수입니다.
//array는 길이 1 이상인 배열입니다.