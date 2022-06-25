public class 배열의평균구하기 {
    public double avg(int[] arr) {
        double answer = 0;
        double sum=0;
        for(int i : arr)
        {
            sum  += i;
        }

        return answer=sum/arr.length;
    }

    public static void main(String args[]){
        배열의평균구하기 평균 = new 배열의평균구하기();
        int arr[] = {1,4,5,6};
        System.out.println("평균 : " + 평균.avg(arr));
    }
}
