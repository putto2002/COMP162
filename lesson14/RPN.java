public class RPN {
    public static void main(String[] args){
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(RPN(tokens));
        
      String expression_1 = "2, 1, +, 3, *"; 
      String expression_2 = "4, 13, 5, /,+" ; 
      String expression_3 = "10, 6, 9, 3, +, -11, *, /, *, 17, +, 5, +";
      
      System.out.println(RPN(expression_1.split(",")));//should be 9
      System.out.println(RPN(expression_2.split(",")));//should be 6
      System.out.println(RPN(expression_3.split(",")));//should be 22

    }

    public static int RPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        String operators = "+-*/";
        for(String token : tokens){
            token = token.strip();
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
