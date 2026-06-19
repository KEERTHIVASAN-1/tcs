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
    //  import java.util.*;

    // public class striver {
    //     public static void main(String[] args) {
    //         Scanner input = new Scanner(System.in);
    //         int n = input.nextInt();
    //         int last;
    //         int sum;
    //         while(n>=10)
    //         {
    //             sum=0;
    //             while(n>0)
    //             {
    //                 last=n%10;
    //                 sum=sum+last;
    //                 n=n/10;
    //             }
    //             n=sum;
    //         }
    //         System.out.print(n);
    //     }
    // }
//PRIME NUMBER OR NOT
// import java.util.*;

// public class striver
//  {
//     public static void main(String[] args) 
//     {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         boolean flag=true;
//         if(n<2)
//         {
//             System.out.print(false);
//             return;
//         }
//         for(int i=2;i*i<=n;i++)
//         {
//             if(n%i==0)
//             {
//                 flag=false;
//                 System.out.print(false);
//                 break;
//             }  
//         }
//         if(flag)
//         {
//             System.out.print(true);
//         }
//     }
// }
//PRIME IN A RANGE
// import java.util.*;

// public class striver
//  {
//     public static void main(String[] args) 
//     {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int m= input.nextInt();
//         int temp;
//         for(int k=n;k<=m;k++)
//         {
//             boolean flag=true;
//              if(k<2)
//             {
//                 flag=false;
//                 continue;
//             }
//             for(int i=2;i*i<=k;i++)
//             {
//                 if(k%i==0)
//                 {
//                     flag=false;
//                     break;
//                 }
//             }
//             if(flag)
//             {
//                 System.out.print(k+ " ");
//             }
//         }
//     }
// } 
//factors of a number
// import java.util.*;

// public class striver
//  {
//     public static void main(String[] args) 
//     {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         for(int i=1;i<=n;i++)
//         {
//             if(n%i==0)
//             {
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }
//Print all Prime Factors of the given number
// import java.util.*;
// public class striver
//  {
//     public static void main(String[] args) 
//     {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         for(int i=2;i<=n;i++)
//         {
//             boolean flag=true;
//             if(n%i==0)
//             {
//                 for(int j=2;j*j<=i;j++)
//                 {
//                     if(i%j==0)
//                     {
//                         flag=false;
//                         break;
//                     }
//                 }
//                 if(flag)
//                 {
//                     System.out.print(i+" ");
//                 }
//             }
//         }
//     }
// }
//GREATEST OF 3 NUMEBRS
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         double n=input.nextDouble();
//         double m=input.nextDouble();
//         double s=input.nextDouble();
//         double max;
//         if(n>=m && n>=s)
//         {
//             max=n;
//         }
//         else if(m>=n && m>=s)
//         {
//             max=m;
//         }
//         else
//         {
//             max=s;
//         }
//         System.out.print(max);
//     }
// }
//ARMSTRONG
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int org=n;
//         int og=n;
//         int last=0 ;
//         int sum=0 ;
//         int count=0;
//         while(n>0)
//         {
//             count++;
//             n=n/10;
//         }
//             while(org>0)
//             {
//                 last=org%10;
//                 sum=sum+(int)(Math.pow(last,count));
//                 org=org/10;
//             }
//         if(sum==og)
//         {
//             System.out.print(true);
//         }
//         else
//         {
//             System.out.print(false);
//         }
//     }
// }
//PERFECT NUMEBR
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int sum=0;
//         for(int i=1;i<n;i++)

//             {
//                 if(n%i==0)
//                 {
//                     sum=sum+i;
//                 }
//             }
//             if(sum==n)
//             {
//                 System.out.print("perfect");
//             }
//             else
//             {
//                 System.out.print("no perfect");
//             }
//     }
// }
//strong numberr
import java.util.*;
public class striver
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int org=n;
        int sum=0;
        int last=0;
        while(n>0)
        {
            int fact=1;
            last=n%10;
            for(int i=1;i<=last;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==org)
        {
            System.out.print("strong");
        }
        else
        {
            System.out.print("no strong");
        }
    }
}