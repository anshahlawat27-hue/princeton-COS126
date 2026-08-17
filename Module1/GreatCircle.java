public class GreatCircle{
    public static void main(String[] args){
        if (args.length!=4){
            System.out.println("Length small");
            System.exit(-1);
        } else{
            double x1 = Double.parseDouble(args[0]);
            double y1 = Double.parseDouble(args[1]);
            double x2 = Double.parseDouble(args[2]);
            double y2 = Double.parseDouble(args[3]);

            System.out.println(x1+x2+y1+y2);

        }
    }
}