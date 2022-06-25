public class 짝수와홀수 {
    String evenOrOdd(int num) {
        String result="";

        if (num %  2 == 0)
        {
            result = "EVEN";
        }
        else
        {
            result = "ODD";
        }

        return result;
    }
    public static void main(String[] args) {

        짝수와홀수 oddEven = new 짝수와홀수();

        System.out.println("결과 : " + oddEven.evenOrOdd(3));
        System.out.println("결과 : " + oddEven.evenOrOdd(2));
    }

}