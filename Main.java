public class Main{
    public static void main(String[] args){
        Stack <String> stack = new Stack <String> ();
        stack.push("Hello");
        stack.push("This is cool");
        
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }

}