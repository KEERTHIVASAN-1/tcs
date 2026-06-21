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
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int org=n;
//         int sum=0;
//         int last=0;
//         while(n>0)
//         {
//             int fact=1;
//             last=n%10;
//             for(int i=1;i<=last;i++)
//             {
//                 fact=fact*i;
//             }
//             sum=sum+fact;
//             n=n/10;
//         }
//         if(sum==org)
//         {
//             System.out.print("strong");
//         }
//         else
//         {
//             System.out.print("no strong");
//         }
//     }
// }
//automorphic
// import java.util.*;

// public class striver {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int n = input.nextInt();
//         int sq = n * n;

//         int count = 0;
//         int temp = n;

//         while (temp > 0) {
//             count++;
//             temp = temp / 10;
//         }

//         int power = 1;

//         for (int i = 1; i <= count; i++) {
//             power = power * 10;
//         }

//         if (sq % power == n) {
//             System.out.print("Automorphic Number");
//         } else {
//             System.out.print("Not Automorphic Number");
//         }
//     }
// }
//SMALLEST NUMBER
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String []s=input.nextLine().split(" ");
//         int n=s.length;
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=Integer.parseInt(s[i]);
//         }
//         int min=arr[0];
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]<min)
//             {
//                 min=arr[i];
//             }
//         }
//         System.out.print(min);
//     }
// }
//SECOND MIN,SECOND MAX 
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String [] s=input.nextLine().split(" ");
//         int n=s.length;
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=Integer.parseInt(s[i]);
//         }
//         int min=arr[0];
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]>min)
//             {
//                 min=arr[i];
//             }
//         }
//         int secondmin=arr[0];
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]<min)
//             {
//                 secondmin=arr[i];
//                 break;
//             }
//         }
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]<min && arr[i]>secondmin)
//             {
//                 secondmin=arr[i];
//             }
//         }
//         System.out.print(secondmin);
//     }
// }
//avg of array
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=input.nextInt();
//         }
//         int sum=0;
//         for(int i=0;i<n;i++)
//         {
//             sum=sum+arr[i];
//         }
//         double avg=(double)sum/n;
//         System.out.printf("%.1f",avg);
//     }
// }
//search a element
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String []s=input.nextLine().split(" ");
//         int n=s.length;
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=Integer.parseInt(s[i]);
//         }
//         int k=input.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             if(k==arr[i])
//             {
//                 System.out.print(i);
//                 return;
//             }
//         }
//         System.out.print(-1);
//     }
// }
///Reverse a array

// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
        
//         int n=input.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=input.nextInt();
//         }
//         for(int i=n-1;i>=0;i--)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
//reverse with swap
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
        
//         int n=input.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=input.nextInt();
//         }
//         int temp=0;
//         int p1=0;
//         int p2=n-1;
//         while(p1<p2)
//         {
//             temp=arr[p1];
//             arr[p1]=arr[p2];
//             arr[p2]=temp;
//             p1++;
//             p2--;

//         }
//         for(int i=0;i<n;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
//Add element in array
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         input.nextLine();
//         String []s=input.nextLine().split(" ");
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=Integer.parseInt(s[i]);
//         }
//         int first=input.nextInt();
//         int last=input.nextInt();
//         int element=input.nextInt();
//         int position=input.nextInt();
//         int []ans=new int [n+3];
//         ans[0]=first;
//         for(int i=0;i<n;i++)
//         {
//             ans[i+1]=arr[i];
//         }
//         for(int i=n;i>=position-1;i--)
//         {
//             ans[i+1]=ans[i];
//         }
//         ans[position-1]=element;
//         ans[n+2]=last;
//         for(int i=0;i<n+3;i++)
//         {
//             System.out.print(ans[i]+ " ");
//         }
//     }
// }
//Median of Array
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String []s=input.nextLine().split(" ");
//         int n=s.length;
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=Integer.parseInt(s[i]);
//         }
//         double median=0;
//         Arrays.sort(arr);
//         if(n%2==0)
//         {
//             median=(double)((arr[n/2-1])+(arr[n/2]))/2;
//         }
//         else
//         {
//             median=arr[(n/2)];
//         }
//         System.out.print(median);
//     }
// }
//gcd,lcm
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int m=input.nextInt();
//         int gcd=1;
//         int lcm=1;
//         for(int i=1;i<=Math.min(n,m);i++)
//         {
//             if(n%i==0 && m%i==0)
//             {
//                 gcd=i;
//             }
//         }
//         lcm=(n*m)/gcd;
//         System.out.println(gcd);
//         System.out.println(lcm);
//     }
// }
//REPLACE 0 WITH 1
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         int n=s.length();
//         for(int i=0;i<n;i++)
//         {
//             if(s.charAt(i)=='0')
//             {
//                 System.out.print("1");
//             }
//             else
//             {
//             System.out.print(s.charAt(i));
//             }
//         }
//     }
// }

