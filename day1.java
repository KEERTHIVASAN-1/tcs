// PRIME NUMBER
// import java.util.*;
// public class day1
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner (System.in);
//         int n=input.nextInt();
//         if(n<=1)
//             {
//                 System.out.print("Not prime");
//                 return;
//             }
//         for(int i=2;i*i<=n;i++)
//         {
//             if(n%i==0)
//             {
//                 System.out.print("Not Prime");
//                 return;
//             }
            
//         }
//         System.out.print("Prime");
//     }
// PALINDROME
// import java.util.*;
// public class day1
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int org=n;
//         int rev=0,last;
//         while(n!=0)
//         {
//             last=n%10;
//             rev=rev*10+last;
//             n=n/10;
//         }
//         if(rev==org)
//         {
//             System.out.print("palin");
//         }
//         else
//         {
//             System.out.print("not palin");
//         }
//     }
// }
// REVERSE STRING
// import java.util.*;
// public class day1
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.next();
//         for(int i=s.length()-1;i>=0;i--)
//         {
//             System.out.print(s.charAt(i));
//         }
//     }
// }