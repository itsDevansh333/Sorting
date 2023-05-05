/*insertion sort*/
import java.util.Scanner;
public class insertion_sort {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++) {
            int j = i - 1;
            int selected=nums[i];
            while (j >= 0 && (nums[j] > selected)) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = selected;
        }
        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
