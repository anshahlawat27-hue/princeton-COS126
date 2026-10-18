public class RightTriangle{
    public static void main(String[] args){
        if (args.length!=3){
            System.out.println("Provide exactly 3 numbers");
            System.exit(-1);
        }
        int a= Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a<=0 || b<=0 || c<=0){
            System.out.println("Sides need to be positive");
            System.exit(-1);
        }

        if (a>=b){
            if (a>=c){
                if (a*a == (b*b)+(c*c)){
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else{
                if (c*c == (b*b)+(a*a)){
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }

        } else{
            if (b>=c){
                if (b*b == (a*a)+(c*c)){
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else{
                if (c*c == (b*b)+(a*a)){
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }
    }
}
    
