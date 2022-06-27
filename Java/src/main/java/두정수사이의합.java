public class 두정수사이의합 {
    public long minmax(int a, int b) {
        long answer = 0;

        if(a <= b)
        {
            for(int i=a;i <= b; i++)
            {
                answer += i;
            }
        }
        else
        {
            for(int i=b;i <= a; i++)
            {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String args[]){
        int a = 3, b= 5;

        두정수사이의합 sol = new 두정수사이의합();
        System.out.println(sol.minmax(a,b));
    }
}



