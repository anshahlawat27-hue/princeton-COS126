public class BandMatrix
{
    public static void main(String[] args)
    {
        int width = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[0]);
        
        for (int y = 0 ; y > -n ; y--)
        {
            for (int x = 0 ; x < n ; x++)
            {
                if (y <= width - x && y >= -x -width)
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
    }
}