import java.util.*;

public class pattern 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // For Pattern 1 
        
        System.out.println("1. ");

        for (int i = 1 ; i <= 4 ; i++)
        {
            for (int j = 1 ; j <= 5 ; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // For considering index values or matrix index's....
        System.out.println("Next....");

        for (int i = 1 ; i <= 4 ; i++)
        {
            for (int j = 1 ; j <= 5 ; j++)
            {
                System.out.print(i + "," + j + " ");
            }
            System.out.println("");
        }

        // For Pattern 2...

        System.out.println("2. ");

        for (int i = 1 ; i <= 4 ; i++)
        {
            for (int j = 1 ; j <= 5 ; j++)
            {
                if ((i == 1 ) || (j == 5) || (j == 1) || (i == 4))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        // For Pattern 3...

        System.out.println("3. ");

        for (int i = 1 ; i <= 4 ; i++)
        {
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // For Pattern 4

        System.out.println("4. ");

        for (int i = 1 ; i <= 4 ; i++)
        {
            for (int j = 1 ; j <= 5 ; j++)
            {
                if (j >= i )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        // For Pattern 5

        System.out.println("5.. ");

        for (int i = 4 ; i >= 1 ; i--)
        {
            for (int j = i ; j >= 1 ; j--)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // For Pattern 6...

        System.out.println("6. ");

        for (int i = 1 ; i <= 4 ; i++)
        {
            // loop for space
            for (int j = 1 ; j <= 4 - i  ; j++)
            {
                System.out.print("  ");
            }

            // loop for star
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // For Pattern 7

        System.out.println("7. ");

        for (int i = 1 ; i < 5 ; i++)
        {
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print(j);
            }
            System.err.println("");
        }

        // For Pattern 8...

        System.out.println("8. ");
        // 38.27
        for (int i = 1 ; i <= 5 ; i++)
        {
            for (int j = 1 ; j <= 5 - i + 1 ; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }

        // For Pattern 9..

        System.out.println("9. ");
        
        int c = 1;
        for (int i = 1 ; i <= 5 ; i++)
        {
            for (int j = 1 ; j <= i ; j++)
            {
                
                if (j <= i)
                {
                    System.out.print(c + " ");
                    c= c + 1;
                }
            }
            System.out.println();
        }

        // For Pattern 10...

        System.out.println("10. ");

        for (int i = 1 ; i <= 5 ; i++)
        {
            for (int j = 1 ; j <= i ; j++)
            {
                if ( j<= i)
                {
                    if((i+j) % 2 == 0)
                    {
                        System.out.print(1);
                    }
                    else
                    {
                        System.out.print("0");
                    }
                }
            }

            System.out.println();
        }



        System.out.println("Advanced patterns..... ");
        // two different for loop will be used for 11th
        System.out.println("11. ");

        int n = 8;
        int m = 4;
        for (int i = 1 ; i <= m ; i++)
        {
            for (int j = 1 ; j <= n ; j++)
            {
                if ((j <= i) || (j >= n-i+1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }    
            }
            System.out.println();
        }
        int consta = -2;
        for (int i = 1 ; i <= m ; i++)
        {
            for (int j = 1 ; j <= n ; j++)
            {
                if ((j <= i+1-(consta)) || (j >= n-i+consta))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
                
            }
            consta = consta + 2 ;
            System.out.println();
        }

        // For Pattern 12...

        System.out.println("12. ");
        int h = 5;
        int g = 9;
        int cnst = 0;
        for (int i = 1 ; i <= h ; i++)
        {
            for (int j = 1 ; j <= g ; j++)
            {
                if ((j >= h-i+1) && (j <= g-i+1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

                //cnst = cnst + 1 ;
            }
            System.out.println();
        }

        // For Pattern 13...

        System.out.println("13. ");

        for (int i = 1 ; i <= 5 ; i++)
        {
            for (int j = 1 ; j <= 5-i ; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // For Pattern 14...

        System.out.println("14. ");

        for (int i = 1 ; i <= 5 ; i++)
        {
            for ( int j = 1 ; j <= n-i ; j++)
            {
                System.out.print(" ");
            }

            for (int j = i ; j >= 1 ; j--)
            {
                System.out.print(j + "");
            }

            for (int j = 2 ; j <= i ; j++)
            {
                System.out.print(j + "");
            }

            System.out.println();
        }

        // For Pattern 15...

        System.out.println("15. ");
        int no = 8;
        for (int i = 1 ; i <= (no/2) ; i++)
        {
            for (int j = 1 ; j <= (no/2)-i ; j++)
            {
                System.out.print(" ");
            }

            for (int j = i ; j >= 1 ; j--)
            {
                System.out.print("*");
            }

            for ( int j = 2 ; j <= i ; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for ( int i = 1 ; i <= (no/2) ; i++ )
        {
            for (int j = 1 ; j <= i-1 ; j++)
            {
                System.out.print(" ");
            }

            for ( int j = i ; j <= (no/2) ; j++)
            {
                System.out.print("*");
            }

            for ( int j = 1 ; j <= ((no/2)-i) ; j++ )
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
