//CHECK PALINDROME
// import java.util.*;

// public class striver {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int n = input.nextInt();
//         int temp = n;
//         int rev = 0;

//         while (temp > 0) {
//             int last = temp % 10;
//             rev = rev * 10 + last;
//             temp = temp / 10;
//         }

//         if(rev==n)
//         {
//             System.out.print("true");
//         }
//         else
//         {
//             System.out.print("false");
//         }
//     }
// }
//PALINDROME IN A RANGE
    // import java.util.*;

    // public class striver {
    //     public static void main(String[] args) {
    //         Scanner input = new Scanner(System.in);

    //         int n = input.nextInt();
    //         int m= input.nextInt();
    //         int temp;
    //         for(int i=n;i<=m;i++)
    //         {
    //             temp=i;
    //             int rev = 0;
    //         while (temp > 0) {
    //             int last = temp % 10;
    //             rev = rev * 10 + last;
    //             temp = temp / 10;
    //         }
    //         if(rev==i)
    //         {
    //             System.out.print(i+ " ");
    //         }
    //         }
    //     }
    // }
    //SUM OF DIGITS OF A NUMBER
     import java.util.*;

    public class striver {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int last;
            int sum;
            while(n>=10)
            {
                sum=0;
                while(n>0)
                {
                    last=n%10;
                    sum=sum+last;
                    n=n/10;
                }
                n=sum;
            }
            System.out.print(n);
        }
    }

