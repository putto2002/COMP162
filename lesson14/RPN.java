public class RPN {
    public static void main(String[] args){
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(RPN(tokens));

    }

    public static int RPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        String operators = "+-*/";
        for(String token : tokens){
            if(!operators.contains(token)){
                stack.push(Integer.valueOf(token));
                continue;
            }
            int a = stack.pop();
            int b = stack.pop();
            if (token.equals("+")){
                stack.push(b + a);   
            }
            else if(token.equals("-")){
                stack.push(b - a);
            }else if(token.equals("*")){
                stack.push(b * a);
            }else {
                stack.push(b / a);
            }
        }
        return stack.pop();
    }
    
}
