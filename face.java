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
// AUTO IMMUNE DISEASE
// import java.util.*;
// public class face{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int l=sc.nextInt();
//         int high=0;
//         int low=0;
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]<11 || arr[i]>81)
//             {
//                 high++;
//             }
//             else
//             {
//                 low++;
//             }
//         }
//         high=(high+l-1)/l;
//         low=(low+l-1)/l;
//         System.out.print(high+low);
//     }
// }
// ONLINE LOTTERY GAME
// import java.util.*;
// public class face{
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();
//         int [] arr=new int[n];
//         int p1,p2;
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=input.nextInt();
//         }
//         Arrays.sort(arr);
//         int sum=0;
//         p1=arr[n-1]*arr[n-2];
//         p2=arr[0]*arr[1];
//         if(p1>p2)
//         {
//             sum=arr[n-1]+arr[n-2];
//         }
//         else
//         {
//             sum=arr[0]+arr[1];
//         }
//         System.out.print(sum);
//     }
// }
// MAX POSSIBLE NUMBER
// import java.util.*;
// public class face{
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         String s=input.nextLine();
//         int [] arr=new int[10];
//         for(int i=0;i<10;i++)
//         {
//             arr[i]=input.nextInt();
//         }
//         char []ch =s.toCharArray();
//         for(int i=0;i<ch.length;i++)
//         {
//             int d=(int)ch[i]-'0';
//             if(arr[d]>d)
//             {
//                 d=arr[d];
//                 ch[i]=(char)(d+'0');
//             }
//         }
//         System.out.print(new String(ch));

//     }
// }
// CONSECUTIVE CHARACTERS
// import java.util.*;
// public class face{
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         String s=input.nextLine();
        
//         int count=1;
//         int max_count=0;
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
//                     max_count=max_count+count;
//                 }
//                 count=1;  
//             }
//         }
//         if(count%2==0)
//         {
//             max_count=max_count+count;
//         }
//         System.out.print(max_count);
//     }
// }
//NUMBER GAME
// import java.util.*;
// public class face
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int x=input.nextInt();
//         int a=input.nextInt();
//         boolean flag=false;
//         int z;
//         for(int n=1;n<x;n++)
//         {
//             z=x-(a*n);
//             if(z>0 && n%z==0)
//             {
//                 System.out.print(n);
//                 flag=true;
//                 break;
//             }
//         }
//         if(!flag)
//         {
//             System.out.print("None");
//         }
//     }
// }
// Lucky numebr FIRST 3 SUM THEN NEXT 3 SUM
// import java.util.*;
// public class Solution {
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         int l=input.nextInt();
//         int m=input.nextInt();
//         int count=0;
//         for(int i=0;i<m;i++)
//         {
//             String s=input.next();
//             int sum1=0;
//             int sum2=0;
//             for(int j=0;j<l;j++)
//             {
//                 sum1=sum1+s.charAt(j)-'0';
//             }
//             for(int k=l;k<2*l;k++)
//             {
//                 sum2=sum2+s.charAt(k)-'0';
//             }
//             if(sum1==sum2)
//             {
//                 count++;
//             }
//         }
//           System.out.print(count);
//     }
// }
//largest possible total.
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
//         int sum;
//         int max_sum=arr[0];
//         for(int i=0;i<n;i++)
//         {
//             sum=0;
//             for(int j=i;j<n;j++)
//             {
//                 sum=sum+arr[j];
//                 if(sum>max_sum)
//                 {
//                 max_sum=sum;
//                 }
//             }
//         }
//         System.out.print(max_sum);
//     }
// }
//Lanes of city
import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        int ans=0;
        boolean flag=false;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int l1=b+(i*a);
            set.add(l1);
        }
        for(int i=0;i<n;i++)
        {
            int l2=d+(i*c);
            if(set.contains(l2))
            {
                ans=l2;
                flag=true;
                break;
            }    
        }
        if(flag)
        {
            System.out.print(ans);
        }
        else{
            System.out.print("No same amount of fuel found");
        }  
    }
}


