class FizzBuzz
{
    public static void main(String args[])
    {
        int n = 100;

        for (int i=1; i<=n; i++)
        {
            if (i%15==0)
                System.out.println(i+" FizzBuzz");

            else if (i%11==0)
                System.out.println(i+" Jazz");

            else if (i%7==0)
                System.out.println(i+" Rizz");

            else if (i%5==0)
                System.out.println(i+" Buzz");

            else if (i%3==0)
                System.out.println(i+" Fizz");

            else
                System.out.println(i+" ");
        }
    }
} 