import java.util.*;
public class face
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        int C=input.nextInt();
        int sum=0;
        int box=1;
        for(int i=0;i<n;i++)
        {
            if(sum+arr[i]>C)
            {
                box++;
                sum=arr[i];
            }
            else
            {
                sum=sum+arr[i];
            }
        }
        System.out.print(box);
    }
}