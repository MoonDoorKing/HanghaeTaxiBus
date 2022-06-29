class 가운데글자가져오기 {
    String getMiddle(String s) {
        String answer= "";

        if(s.length() % 2 == 0)
        {
            answer = s.substring(s.length()/2-1,s.length()/2+1); //substring(이상,미만) ex) substring(2,4)면 2번째와 3번째 글자만 가져옴
        }
        else if(s.length() % 2 != 0)
        {
            answer = s.substring(s.length()/2,s.length()/2+1);
        }

        return answer;
    }
        public static void main (String[]args){
            가운데글자가져오기 se = new 가운데글자가져오기();
            System.out.println(se.getMiddle("power"));
            System.out.println(se.getMiddle("test1234"));
    }
}
