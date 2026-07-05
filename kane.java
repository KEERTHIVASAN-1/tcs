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
//ANAGRAM CHECKER 
// import java.util.*;
// public class kane
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s1=input.nextLine();
//         String s2=input.nextLine();
//         char []arr1=s1.toCharArray();
//         char []arr2=s2.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         if(arr1.length!=arr2.length)
//         {
//             System.out.print("Not anagram");
//             return;
//         }

//         else
//         {
//             for(int i=0;i<arr1.length;i++)                          
//             {
//                 char ch1=arr1[i];
//                 char ch2=arr2[i];
//                 if(ch1!=ch2)
//                 {
//                     System.out.print("Not anagram");
//                     return;
//                 }
//             }                                                                       //--------INSTEAD OF FOR LOOP------------
//                                                                                     // if(Arrays.equals(arr1, arr2))
//                                                                                     // {
//                                                                                     //     System.out.print("Anagrams");
//                                                                                     // }
//                                                                                     // else
//                                                                                     // {
//                                                                                     //     System.out.print("Not Anagrams");
//                                                                                     // }
//             System.out.print("Anagram");
//         }
//     }
// }
//REMOVE CONSECUTIVE DUPLIATES
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
//         int []brr=new int[n];
//         int k=0;
//         for(int i=0;i<arr.length-1;i++)
//         {
//             if(arr[i]!=arr[i+1])
//             {
//                 brr[k]=arr[i];
//                 k++;
//             }
//         }
//         brr[k]=arr[arr.length-1];
//         k++;
//         for(int i=0;i<k;i++)
//         {
//             System.out.print(brr[i]+ " ");
//         }
//     }
// }
//First Nonrepeat Mostfreq
import java.util.*;
public class kane
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        char []arr=s.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            if(map.get(ch)==1)
            {
                System.out.print(ch+ " ");
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.print("None ");
        }
        int max=0;
        char maxchar=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            if(map.get(ch)>max)
            {
                max=map.get(ch);
                maxchar=ch;
            }
        }
        System.out.print(maxchar);
    }
}
            

