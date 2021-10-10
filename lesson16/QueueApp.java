import java.util.*;
public class QueueApp {
    public static void main(String[] args){
        Set<String> validCommands = new HashSet<String>();
        validCommands.addAll(Arrays.asList(
            new String[] { "a", "c" }));
        TwoStackQueue<String> queue = new TwoStackQueue<String>();
        Scanner sc = new Scanner(System.in);
        String s;
        do {
            // prompt user
            System.out.print("> ");
            // get user input
            s = sc.nextLine();
            //split input
            String[] input = s.split(" ");
            // get the command 
            String cmd = input[0];
            // get the arguments
            String[] arg = input.length == 1 ? null : Arrays.copyOfRange(input, 1, input.length);

            

            switch(cmd.toLowerCase()) {
                case "s":
                   System.out.println(queue.size());
                   break;
                case "a":
                   if(arg == null) {
                       System.out.println("Command a require arguments");
                       break;
                   }
                   for(String item: arg){
                       queue.add(item);
                   }
                   break;
                case "d":
                    System.out.println(queue.debug());
                    break;
                case "p":
                    System.out.println(queue.toString());
                    break;
                case "g":
                    if(queue.isEmpty()){
                     System.out.println("Queue is empty!");
                     break;
                    }
                    System.out.println(queue.peek());
                    break;
                case "r":
                    if(queue.isEmpty()) {
                     System.out.println("Queue is empty!");
                     break;
                    }
                    System.out.println(queue.remove());
                    break;
                case "c":
                    queue = new TwoStackQueue<String>();
                    break;
                default:
                   System.out.println("In valid command!");


            }



        } while(!s.toLowerCase().equals("exit"));
        sc.close();

    }
    
}
