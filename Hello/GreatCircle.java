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

            double A = Math.toRadians((x2-x1)/2);
            double B= Math.toRadians(x1);
            double C= Math.toRadians(x2);
            double D= Math.toRadians((y2-y1)/2);

            double inside=Math.pow(Math.sin(A), 2)+Math.cos(B)*Math.cos(C)*Math.pow(Math.sin(D), 2);
            inside= Math.pow(inside, 0.5);
            double total= 2*6371*Math.asin(inside);
            System.out.println(total);
        }

    }
}