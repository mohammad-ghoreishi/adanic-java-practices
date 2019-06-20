



public class jadval
{


    public static void main(String[] args)
    {

        for (int i = 0; i < 11; i++)
        {

            for (int j = 1; j < 11; j++)
            {

                System.out.print(j + "*" + i + "=" + i * j + "\t\t");


                if (j == 10)
                {

                    System.out.print("\n");
                }
            }
        }
    }
}