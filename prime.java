package LabTest_tarungothwal;

public class prime

{

    int  i, j,num1 = 2, num2 = 20;

    void primeNumber()

    {



        for (i = num1; i <= num2; i++)

        {

            for (j = 2; j <= i; j++)

            {

                if (i % j == 0)

                    break;

            }

            if (i == j)

                System.out.print(" \n " + j);

        }



    }



    public static void main(String[] args)

    {

        prime x = new prime();

        x.primeNumber();

    }

}

	



