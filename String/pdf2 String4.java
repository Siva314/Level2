class Solution {
    public boolean isValid(String s) {
        int length=s.length();
        if(length%2!=0){
            return false;
        }
        char temp1=s.charAt(0);
        if(temp1=='}' || temp1==']' || temp1==')'){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<length;i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
                continue;
            }
            if(!stack.empty()){
            char temp=stack.pop();
            if(ch=='}'&& temp!='{'){
                return false;
            }
            if(ch==']'&& temp!='['){
                return false;
            }
            if(ch==')'&& temp!='('){
                return false;
            }
            }
            else{
                return false;
            }
        }
        return stack.empty();
    }
}
