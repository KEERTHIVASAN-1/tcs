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
//Frequency of Elements
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
//         LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
//         for(int i=0;i<n;i++)
//         {
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//         }
//         for(int i:map.keySet())
//         {
//             System.out.println(i+" "+map.get(i));
//         }
//     }
// }
//-   Remove Duplicates (Sorted) [x]  Remove Duplicates (Unsorted)
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
//         LinkedHashSet<Integer>set=new LinkedHashSet<>();
//         for(int i=0;i<n;i++)
//         {
//             set.add(arr[i]);
//         }
//         for(int i:set)
//         {
//             System.out.print(i+" ");
//         }
//         System.out.println();
//         int t=set.size();
//         System.out.println(t);
//     }
// }
//Find all repeating elements in an array OR Find all non repeating elements in an array
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
//         LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
//         for(int i=0;i<n;i++)
//         {
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//         }
//         for(int i:map.keySet())
//         {
//             if(map.get(i)==1)
//             System.out.print(i+" ");
//         }
//     }
// }
//LEFT ROTATE,RIGHT ROTATE
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
//         input.nextLine();
//         String st=input.nextLine();
//         int []ans=new int[n];
//         int p=0;
//         int q=0;
//         if(st.equals("left"))
//         {
//             for(int i=k;i<n;i++)
//             {
//                 ans[p]=arr[i];
//                 p++;
//             }
//             for(int i=0;i<k;i++)
//             {
//                 ans[p]=arr[i];
//                 p++;
//             }
//         }

//         else if(st.equals("right"))
//         {
//             for(int i=n-k;i<n;i++)
//             {
//                 ans[q]=arr[i];
//                 q++;
//             }
//             for(int i=0;i<n-k;i++)
//             {
//                 ans[q]=arr[i];
//                 q++;
//             }
//         }
//             System.out.print(Arrays.toString(ans));
//     }
// }
//check circular rotation
// import java.util.*;
// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         String a = input.nextLine();
//         String b = input.nextLine();
//         if((a+" "+a).contains(b))
//         {
//             System.out.println("Yes");
//         }
//         else
//         {
//             System.out.println("No");
//         }
//     }
// }
//Finding Equilibrium index in an array
// import java.util.*;
// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         int n=input.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=input.nextInt();
//         }
//         boolean flag=false;
//         for(int i=0;i<n;i++)
//         {
//             int sum1=0;
//             int sum2=0;
//             for(int j=0;j<i;j++)
//             {
//                 sum1=sum1+arr[j];
//             }
//             for(int k=i+1;k<n;k++)
//             {
//                 sum2=sum2+arr[k];
//             }
//             if(sum1==sum2)
//             {
//                 System.out.print(i);
//                 flag=true;
//                 break;
//             }
//         }
//         if(!flag)
//         {
//             System.out.print(-1);
//         }
//     }
// }
//Symmetric pairs
// import java.util.*;
// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         int n=input.nextInt();
//         LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
//         for(int i=0;i<n;i++)
//         {
//             int x=input.nextInt();
//             int y=input.nextInt();
//             if(map.containsKey(y) && map.get(y)==x)
//             {
//                 System.out.print(x+"->"+y);
//             }
//             else
//             {
//                 map.put(x,y);
//             }
//         }
//     }
// }
// import java.util.*;
// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         int n=input.nextInt();
//         int []arr=new int [n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=input.nextint();
//         }
//         LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
//         for(int i=0;i<n;i++)
//         {
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//         }
        
//     }
// }
//Replace elements by its rank in the array
// import java.util.*;
// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         int n=input.nextInt();
//         int []arr=new int [n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=input.nextInt();
//         }
//         int []brr=arr.clone();
//         Arrays.sort(arr);
//         LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
//         int rank=1;
//         for(int i=0;i<n;i++)
//         {
//             if(!map.containsKey(arr[i]))
//             {
//             map.put(arr[i],rank);
//             rank++;
//             }
//         }
//         for(int i:brr)
//         {
//             System.out.println(i+" -> "+map.get(i)+" ");
//         }
//     }
// }
// import java.util.*;
// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         int n=input.nextInt();
//         int []arr=new int [n];
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=input.nextInt();
//         }
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++)
//         {
//             int product=1;
//             for(int j=i;j<n;j++)
//             {
//                 product=product*arr[j];
//                 if(product>max)
//                 {
//                     max=product;
//                 }
//             }
//         }
//         System.out.print(max);
//     }
// }
//subset of another array
// import java.util.*;
// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         String []s1=input.nextLine().split(" ");
//         String []s2=input.nextLine().split(" ");
//         int n1=s1.length;
//         int n2=s2.length;
//         int []arr1=new int [n1];
//         for(int i=0;i<n1;i++)
//         {
//             arr1[i]=Integer.parseInt(s1[i]);
//         }
//         int []arr2=new int [n2];
//         for(int i=0;i<n2;i++)
//         {
//             arr2[i]=Integer.parseInt(s2[i]);
//         }
//         HashSet<Integer>set=new HashSet<>();
//         for(int i=0;i<n2;i++)
//         {
//             set.add(arr2[i]);
//         }
//         for(int i=0;i<n1;i++)
//         {
//             if(!set.contains(arr1[i]))
//             {
//                 System.out.print("arr1 is not subset of arr2");
//                 return;
//             }
//         }
//         System.out.print("arr1 is a subset of arr2");
//     }
// }
//REVERSE PALINDROME TWO WAYS, 2 POINTERS,STORE AND CHECK 
// import java.util.*;
// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         String s=input.nextLine();
//         int left=0;
//         int right=s.length()-1;
//         while(left<right)
//         {
//             if(s.charAt(left)!=s.charAt(right))
//             {
//                 System.out.print("not palindrome");
//                 return;
//             }
//             left++;
//             right--;
//         }
//         System.out.print("valid palin");
//     }
// }
// import java.util.*;

// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);

//         String s = input.nextLine();

//         String rev = "";

//         for(int i = s.length()-1; i >= 0; i--)
//         {
//             rev = rev + s.charAt(i);
//         }

//         if(s.equals(rev))
//         {
//             System.out.println("Palindrome");
//         }
//         else
//         {
//             System.out.println("Not Palindrome");
//         }
//     }
// }
// import java.util.*;
// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         String s = input.nextLine();
//         s=s.toLowerCase();
//         String rev = "";
//         for(int i=s.length();i>=0;i--)
//         {
//             rev=rev+s.charAt(i);
//         }
//         System.out.print(rev);
//     }
// }
//COUNT VOWELS,CONSONANT,SPACE
// import java.util.*;

// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);

//         String s = input.nextLine();

//         int vowels = 0;
//         int consonants = 0;
//         int spaces = 0;

//         s = s.toLowerCase();

//         for(int i=0;i<s.length();i++)
//         {
//             char ch = s.charAt(i);

//             if(ch=='a' || ch=='e' || ch=='i' ||
//                ch=='o' || ch=='u')
//             {
//                 vowels++;
//             }
//             else if(ch>='a' && ch<='z')
//             {
//                 consonants++;
//             }
//             else if(ch==' ')
//             {
//                 spaces++;
//             }
//         }

//         System.out.println("Vowels: " + vowels);
//         System.out.println("Consonants: " + consonants);
//         System.out.println("White spaces: " + spaces);
//     }
// }
//ASCII value
// import java.util.*;

// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         char ch=input.next().charAt(0);
//         System.out.print((int)ch);
//     }
// }
//REMOVE VOWEL
// import java.util.*;

// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         String s=input.nextLine();
//         String another="";
//         for(int i=0;i<=s.length()-1;i++)
//         {
//             char ch =s.charAt(i);
//             if(ch!='a' && ch!='e' &&ch!='i' &&ch!='o' &&ch!='u' 
//              &&ch!='A' &&ch!='E' &&ch!='I' &&ch!='O' &&ch!='U')
//              {
//                 another=another +ch;
//              }
//         }
//         System.out.print(another);
//     }
// }
//REMOVE SPACES
// import java.util.*;

// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         String s=input.nextLine();
//         String another="";
//         for(int i=0;i<s.length();i++)
//         {
//             char ch =s.charAt(i);
//             if(ch!=' ')
//              {
//                 another=another +ch;
//              }
//         }
//         System.out.print(another);
//     }
// }
//ONLY ALPHABETS PRINT
// import java.util.*;

// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         String s=input.nextLine();
//         String another="";
//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);
//             if((ch>='a' && ch<='z') || ch>='A' && ch<='Z')
//             {
//                 another=another+ch;
//             }
//         }
//         System.out.print(another);
//     }
// }
//Sum of Numbers in String
// import java.util.*;
// public class striver
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         String s=input.nextLine();
//         int sum=0;
//         int num=0;
//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);

//             if(ch>='0' && ch<='9')
//             {
//                 num=num*10+(ch-'0');
//             }
//             else
//             {
//                 sum=sum+num;
//                 num=0;
//             }
//         }
//         sum=sum+num;
//         System.out.print(sum);
//     }
// }
// reverse A SENTENCE
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         String []arr=s.split(" ");
//         for(int i=arr.length-1;i>=0;i--)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//Frequency of characters in a String
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);
//             map.put(ch,map.getOrDefault(ch,0)+1);
//         }
//         for(char ch='a' ;ch<='z';ch++)
//         {
//             if(map.containsKey(ch))
//             {
//                 System.out.print(ch+""+map.get(ch)+" ");
//             }
//         }
//     }
// }
//NON REPEATING CHARACTERS
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);
//             map.put(ch,map.getOrDefault(ch,0)+1);
//         }
//         for(char ch:map.keySet())
//         {
//             if(map.get(ch)==1)
//             {
//                 System.out.print(ch+",");
//             }
//         }
//     }
// }
//Strings are anagrams of each other
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s1=input.nextLine();
//         String s2=input.nextLine();
//         char []ch1=s1.toCharArray();
//         char []ch2=s2.toCharArray();
//         Arrays.sort(ch1);
//         Arrays.sort(ch2);
//         if(Arrays.equals(ch1,ch2))
//         {
//             System.out.print(true);
//         }
//         else
//         {
//             System.out.print(false);
//         }
//     }
// }
//Maximum Occurring Character
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);
//             map.put(ch,map.getOrDefault(ch,0)+1);
//         }
//         int max=0;
//         char ans=' ';
//         for(char ch:map.keySet())
//         {
//             if(map.get(ch)>max)
//             {
//                 max=map.get(ch);
//                 ans=ch;
//             }
//         }
//         System.out.print(ans);
//     }
// }
//REMOVE DUPLICATES IN A STRING
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         LinkedHashSet<Character>set=new LinkedHashSet<>();
//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);
//             set.add(ch);
//         }
//         for(char ch:set)
//         {
//             System.out.print(ch);
//         }
//     }
// }
//Print ALL DUPLICATES IN A STRING
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
//         for(int i=0;i<s.length();i++)
//         {
//             char ch=s.charAt(i);
//             map.put(ch,map.getOrDefault(ch,0)+1);
//         }
//         for(char ch='a';ch<='z';ch++)
//         {
//             if(map.containsKey(ch) && map.get(ch)>1)
//             {
//                 System.out.print(ch+":"+map.get(ch)+" ");
//             }
//         }
//     }
// }
//Remove Characters from first String present in the Second String
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s1=input.nextLine();
//         String s2=input.nextLine();
//         LinkedHashSet<Character>set=new LinkedHashSet<>();
//         for(int i=0;i<s2.length();i++)
//         {
//             char ch=s2.charAt(i);
//             set.add(ch);
//         }
//         for(int i=0;i<s1.length();i++)
//         {
//             char ch=s1.charAt(i);
//             if(!set.contains(ch))
//             {
//                 System.out.print(ch);
//             }
//         }
//     }
// }
//LARGEST WORD IN A STRING
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         String []arr=s.split(" ");
//         String ans=arr[0];
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i].length()>ans.length())
//             {
//                 ans=arr[i];
//             }
//         }
//         System.out.print(ans);
//     }
// }
//SORT CHARACTER IN A STRING
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         //String []arr=s.split("");
//         char []arr=s.toCharArray();
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }
//     }
// }
//NUMBER OF WORDS IN A STRING
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         String []arr=s.split(" ");
//         System.out.print(arr.length);
//     }
// }
//UPPER TO LOWER VICEVERSA
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         char []arr=s.toCharArray();
//         for(int i=0;i<arr.length;i++)
//         {
//             char ch=arr[i];
//             if(Character.isLowerCase(ch))
//             {
//                 ch=Character.toUpperCase(ch);
//             }
//             else if(Character.isUpperCase(arr[i]))
//             {
//                 ch=Character.toLowerCase(ch);
//             }
//             arr[i]=ch;
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }
//     }
// }
//Concatenate string
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s1=input.nextLine();
//         String s2=input.nextLine();
//         String s3=s1+s2;
//         System.out.print(s3);
//     }
// }
//FIND INDEX OF STRING IF PRESENT IN ANOTHER STRING
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s1=input.nextLine();
//         String s2=input.nextLine();
//         System.out.print(s1.indexOf(s2));
//     }
// }
//Print next character of current char throughout string
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         char []arr=s.toCharArray();
//         for(int i=0;i<arr.length;i++)
//         {
//             char ch=arr[i];
//             if(ch=='z')
//             {
//                 arr[i]='a';
//             }
//             else if(ch=='Z')
//             {
//                 arr[i]='A';
//             }
//             else
//             {
//             arr[i]=(char)(ch+1);
//             }
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//         System.out.print(arr[i]);
//         }
//     }
// }
//Remove brackets
// import java.util.*;
// public class striver
// {
//     public static void main(String[]args)
//     {
//         Scanner input=new Scanner(System.in);
//         String s=input.nextLine();
//         char []arr=s.toCharArray();
//         int count=0;
//         char []brr=new char [arr.length];
//         int k=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             char ch=arr[i];
//             if(ch!='(' && ch!=')')
//             {
//                 brr[k]=ch;
//                 k++;
//             }
//         }
//         for(int i=0;i<k;i++)
//         {
//             System.out.print(brr[i]);
//         }
//     }
// }






   















