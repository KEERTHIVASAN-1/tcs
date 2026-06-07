// // PRIME NUMBER
// // import java.util.*;
// // public class day1
// // {
// //     public static void main(String[]args)
// //     {
// //         Scanner input=new Scanner (System.in);
// //         int n=input.nextInt();
// //         if(n<=1)
// //             {
// //                 System.out.print("Not prime");
// //                 return;
// //             }
// //         for(int i=2;i*i<=n;i++)
// //         {
// //             if(n%i==0)
// //             {
// //                 System.out.print("Not Prime");
// //                 return;
// //             }
            
// //         }
// //         System.out.print("Prime");
// //     }
// // PALINDROME
// // import java.util.*;
// // public class day1
// // {
// //     public static void main(String[]args)
// //     {
// //         Scanner input=new Scanner(System.in);
// //         int n=input.nextInt();
// //         int org=n;
// //         int rev=0,last;
// //         while(n!=0)
// //         {
// //             last=n%10;
// //             rev=rev*10+last;
// //             n=n/10;
// //         }
// //         if(rev==org)
// //         {
// //             System.out.print("palin");
// //         }
// //         else
// //         {
// //             System.out.print("not palin");
// //         }
// //     }
// // }
// // REVERSE STRING
// // import java.util.*;
// // public class day1
// // {
// //     public static void main(String[]args)
// //     {
// //         Scanner input=new Scanner(System.in);
// //         String s=input.next();
// //         for(int i=s.length()-1;i>=0;i--)
// //         {
// //             System.out.print(s.charAt(i));
// //         }
// //     }
// // }
// ARMSTRONG NO
// import java.util.*;
// public class day1
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int org,a,last;
//         int sum=0,count=0;
//         org=n;
//         int main=n;
//         while(n>0)
//         {
//             count++;
//             n=n/10;
//         }
//         while(org>0)
//         {
//             last=org%10;
//             a=(int)Math.pow(last,count);
//             sum=sum+a;
//             org=org/10;
//         }
//         if(main==sum)
//         {
//             System.out.print("Arm");
//         }
//         else
//         {
//             System.out.print("No arm");
//         }
//     }
// }
// Counting Vowels
// import java.util.*;
// public class day1
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         int count=0;
//         s=s.toLowerCase();
//         for(int i=0;i<s.length();i++)
//         {
//             if( s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
//                {
//                 count++;
//                }
//         }
//         System.out.print(count);
//     }
// }
// import java.util.*;
// public class day1
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int a=0;
//         int b=1;
//         int c=0;
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(a+ " ");
//             c=a+b;
//             a=b;
//             b=c;
//         }
//     }
// }
// Factorial
// import java.util.*;
// public class day1
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int fact=1;
//         for(int i=n;i>1;i--)
//         {
//             fact=fact*i;
//         }
//         System.out.print(fact);
//     }
// }

