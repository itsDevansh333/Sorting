import java.util.Scanner;
public class Quick_sort {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int number_of_elemens=sc.nextInt();
        int []arr=new int[number_of_elemens];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<number_of_elemens;i++)
        {
            arr[i]=sc.nextInt();
        }
        Quick_sort object=new Quick_sort();
        arr=object.quick_sort(arr,0,number_of_elemens-1);
        System.out.println("The sorted array is: ");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    int[] quick_sort(int []A,int lb,int ub)
    {
        if(lb<ub)
        {
            int loc=partition(A,lb,ub);
            A=quick_sort(A,lb,loc-1);
            A=quick_sort(A,loc+1,ub);
        }
        return A;
    }
    int partition(int []A,int lb,int ub)
    {
        int start=lb;
        int end=ub;
        int pivot=A[lb];
        while(start<=end)
        {
            while(A[start]<=pivot&&start<=ub)
                start++;
            while(A[end]>pivot&&end>=lb)
                end--;
            if(start<end)
            {
                int temp=A[start];
                A[start]=A[end];
                A[end]=temp;
            }
        }
        int temp=A[end];
        A[end]=A[lb];
        A[lb]=temp;
        return end;
    }
}
