public class RandomWalkers
{
    public static void main(String[] args)
    {
        int trials = Integer.parseInt(args[1]);
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int total = 0;
        int distance = 0;
        int random = 0;

        for (int i = 0, i <= trials, i++)
        {
            while (distance < r)
            {
                random = Math.random()
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
            }
        }
    }
}