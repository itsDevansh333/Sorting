import java.util.Scanner;
public class selection_sort {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int min=nums[i];
            int minindex=i;
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]<min)
                {
                    min=nums[j];
                    minindex=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[minindex];
            nums[minindex]=temp;
        }
        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
