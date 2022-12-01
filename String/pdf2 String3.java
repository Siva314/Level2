class Solution {
    public int romanToInt(String s) {
        int answer=0,temp=0,length=s.length();
        for(int i=length-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':
                {
                    temp=1;
                    break;
                }
                case 'V':{
                    temp=5;
                    break;
                }
                case 'X':
                {
                    temp=10;
                    break;
                }
                case 'L':{
                    temp=50;
                    break;
                }
                case 'C':
                {
                    temp=100;
                    break;
                }
                case 'D':{
                    temp=500;
                    break;
                }
                case 'M':
                {
                    temp=1000;
                    break;
                }
            }
            if(4*temp<answer){
                answer-=temp;
            }
            else{
                answer+=temp;
            }
        }
        return answer;
    }
}
