public class CMYKtoRGB{
    public static void main(String[] args){
        if (args.length!=4){
            System.out.println("Give enough arguments");
            System.exit(-1);
        } else {
            double C = Double.parseDouble(args[0]);
            double M = Double.parseDouble(args[1]);
            double Y= Double.parseDouble(args[2]);
            double K = Double.parseDouble(args[3]);

            double W= (1-K);
            int R=(int) Math.round(255*W*(1-C));
            int G=(int) Math.round(255*W*(1-M));
            int B=(int) Math.round(255*W*(1-Y));

            System.out.println("Red: " + R);
            System.out.println("Green: "+G);
            System.out.println("Blue: "+B);
             
        }


    }
}