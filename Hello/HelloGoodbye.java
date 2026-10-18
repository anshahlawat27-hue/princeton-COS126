public class HelloGoodbye{
    public static void main(String[] args){
        if (args.length==2) {
            System.out.println("Hello " + args[0] + " Goodbye " + args[1]);
        } else {
            System.out.println("Please provide both names");

        }
    }
}