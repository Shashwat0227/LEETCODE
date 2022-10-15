import java.util.Scanner;

public class testing {



        // DISPLAYING DIGITS OF A NUMBER
        public static void main(String[] args) {
            int r,n;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number you want to seperate of");
            n = sc.nextInt();
            r=n%10;
            while(r>0)
            {
                r=n%10;
                n=n/10;

                System.out.println(r);
            }

        }
    }


