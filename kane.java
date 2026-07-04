//MAXIMUM SIZE OF K SIZE SUBARRAY
// import java.util.*;
// public class kane
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int k=input.nextInt();
//         int []arr=new int [n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=input.nextInt();
//         }
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]%2==0)
//             {
//                 arr[i]=arr[i]-1;
//             }
//         }
//         int maxsum=0;
//         for(int i=0;i<=n-k;i++)
//         {
//             HashSet<Integer>set=new HashSet<>();
//             int sum=0;
//             for(int j=i;j<i+k;j++)
//             {
//                 set.add(arr[j]);   
//                 sum=sum+arr[j];
//             }
//             if(set.size()==k)
//             {
//                 maxsum=Math.max(sum,maxsum);
//             }
//         }
//         System.out.print(maxsum);
//     }
// }
// MAXIMUM SUBARRAY
// import java.util.*;
// public class kane
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String []s=input.nextLine().split(" ");
//         int n=s.length;
//         int []arr=new int [n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=Integer.parseInt(s[i]);
//         }
//         int max_sum=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++)
//         {
//             int sum=0;
//             for(int j=i;j<n;j++)
//             {
//                 sum=sum+arr[j];
//                 max_sum=Math.max(sum,max_sum);
//             }
//         }
//         System.out.print(max_sum);
//     }
// }
//subarray sum equLals K
// import java.util.*;
// public class kane
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String []s=input.nextLine().split(" ");
//         int n=s.length;
//         int []arr=new int [n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=Integer.parseInt(s[i]);
//         }
//         int k=input.nextInt();
//         int count=0;
//         for(int i=0;i<n;i++)
//         {
//             int sum=0;
//             for(int j=i;j<n;j++)
//             {
//                 sum=sum+arr[j];
//                 if(sum==k)
//                 {
//                     count++;
//                 }
//             }
//         }
//         System.out.print(count);
//     }
// }     
            

