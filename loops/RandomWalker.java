public class RandomWalker
{
    public static void main(String[] args)
    {
        double random = 0;
        int x = 0;
        int y = 0;
        float distance = 0;
        int moves = 0;

        while (distance < Integer.parseInt(args[0]))
        {
            System.out.println("(" + x + ", " + y+ ")");
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

            distance = Math.abs(x) + Math.abs(y);
            moves += 1;
        }
        System.out.println("steps = " + moves);
    }
}