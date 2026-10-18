public class GeneralizedHarmonic{
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Give correct number of arguments");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double res = 0.0;
        for (int i = 1; i<=n ; i++){
            res = res + 1.0 /(Math.pow(i, r));
        }
        System.out.println(res);
    }
}