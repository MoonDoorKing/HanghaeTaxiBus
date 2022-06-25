public class 핸드폰번호가리기 {
    public String phonenumber(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length(); i++) {  // 폰 넘버의 길이만큼 반복문을 돌리고
            if (i < phone_number.length() - 4)     // i 는 폰 넘버의 마지막 4개를 제외 하곤 * 을 넣고
            {
                answer += "*";
            }
            else
            {
                answer += phone_number.charAt(i); // 마지막 4개는 그대로 출력
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        핸드폰번호가리기 phone = new 핸드폰번호가리기();

        System.out.println(phone.phonenumber("01099998888"));
    }
}

