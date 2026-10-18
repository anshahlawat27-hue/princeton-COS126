public class RandomWalker
{
    public static void main(String[] args)
    {
        double random = Math.random();
        int x = 0;
        int y = 0;
        int distance = 0;
        int moves = 0;

        while (distance < Integer.parseInt(args[0]))
        {
            random = Math.random();
            if (random <= 0.25)
            {
                x += 1;
            }else if (random > 0.25 && random <= 0.5)
            {
                x -= 1;
            } else if (random > 0.5 && random <= 0.75)
            {
                y += 1;
            } else if (random > 0.75)
            {
                y -= 1;
            }

            System.out.println("(" + x + ", " + y+ ")");

            distance = x + y;
            moves += 1;
        }
        System.out.println("steps = " + moves);
    }
}