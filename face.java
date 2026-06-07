// NO OF BOXES
// import java.util.*;
// public class face
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++)
//         {
//             arr[i] = input.nextInt();
//         }
//         int C=input.nextInt();
//         int sum=0;
//         int box=1;
//         for(int i=0;i<n;i++)
//         {
//             if(sum+arr[i]>C)
//             {
//                 box++;
//                 sum=arr[i];
//             }
//             else
//             {
//                 sum=sum+arr[i];
//             }
//         }
//         System.out.print(box);
//     }
// }
// DONT COUNT ODD CHAR AND ONLY COUNT EVEN NUMEBR OF CHAR
// import java.util.*;
// public class Main
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         int count=1;
//         int maxcount=0;
//         for(int i=1;i<s.length();i++)
//         {
//             if(s.charAt(i)==s.charAt(i-1))
//             {
//                 count++;
//             }
//             else
//             {
//                 if(count%2==0)
//                 {
//                     maxcount+=count;
//                 }
//                 count=1;
//             }
//         }
//         if(count%2==0)
//                 {
//                     maxcount+=count;
//                 }
//             System.out.print(maxcount);
//     }
// }
// Zero ARRAy with AND operator
// import java.util.*;
// public class face
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int []arr=new int [n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=input.nextInt();
//         }
//         int res=arr[0];
//         for(int i=1;i<n;i++)
//         {
//             res=res&arr[i];
//         }
//         int count=0;
//         while(res!=0)
//         {
//             count=count+res&1;
//             res>>=1;
//         }
//         System.out.print(count);
//     }
// }
// MATHS GENIUS
// import java.util.*;
// public class face
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int fact;
//         int count=0;
//         while(n>0)
//         {
//             fact=1;
//             for(int i=1;i<n;i++)
//             {
//                 if(n%i==0)
//                 {
//                 fact=i;
//                 }
//             }
//             n=n-fact;
//             count++;
//         }
//         System.out.print(count);
//     }
// }
// LARGEST NUMBER POSSIBLE
// import java.util.*;
// public class face
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         char []ch=s.toCharArray();
//         Arrays.sort(ch);
//         for(int i=s.length()-1;i>=0;i--)
//         {
//             System.out.print(ch[i]);
//         }
//     }
// }
