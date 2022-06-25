public class 숫자잘라서더하기 {
    public int num(int n) {
        int answer = 0;

        String nn = Integer.toString(n);

        String[] nnn = nn.split("");

        int a = Integer.parseInt(nnn[0]);
        int b = Integer.parseInt(nnn[1]);
        int c = Integer.parseInt(nnn[2]);


        answer = a+b+c;

        return answer;
    }


    public static void main(String [] args) {
        숫자잘라서더하기 num = new 숫자잘라서더하기();

        System.out.println(num.num(153));


    }
}
