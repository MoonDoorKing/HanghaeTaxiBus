public class 행렬의덧셈 {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr1[0].length];

            for(int i=0; i < arr1.length; i++)
            {
                for(int a=0; a<arr1[0].length; a++)
                {
                    answer[i][a] = arr1[i][a] + arr2[i][a];
                }
            }
            return answer;
        }
    public static void main(String args[]) {
        행렬의덧셈 arraySum = new 행렬의덧셈();

        int[][] A = { { 1, 2 }, { 2, 3 } };
        int[][] B = { { 3, 4 }, { 5, 6 } };
        int[][] answer = arraySum.solution(A, B);
        if (answer[0][0] == 4 && answer[0][1] == 6 &&
                answer[1][0] == 7 && answer[1][1] == 9)
        {
            System.out.println("맞았습니다. 제출을 눌러 보세요");
        }
        else
        {
            System.out.println("틀렸습니다. 수정하는게 좋겠어요");
        }
    }
}




//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행
//같은 열의 값을 서로 더한 결과가 됩니다.
// 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.