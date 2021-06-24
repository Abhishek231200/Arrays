import java.util.Scanner;

public class array{
     int Array1[]=new int [20];
     int n;
    Scanner scan = new Scanner(System.in);
    public void get_data()
    {
        System.out.println("Enter the number of elements in the array\n");

        n = scan.nextInt();
        int i=0;
        System.out.println("Enter the elements of the array\n");
        for(i=0;i<n;i++)
        {
            Array1[i]=scan.nextInt();
        }

    }
    
    public void put_data()
    {
        System.out.println("The element of the array are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(Array1[i]+" ");

        }System.out.println("\n");
    }
    
    public void delete()
    {
        System.out.println("enter the location of the element to be deleted");
        int k=scan.nextInt()-1;
        for(int i=k;i<n-1;i++)
        {
            Array1[i]=Array1[i+1];
        }
        n=n-1;

    }

}
