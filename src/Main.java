import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
        Array a1=new Array();
        int ch;
		do{
			System.out.println("1 Insert Array \n2.Print Array \n3.Insert \n4.Delete \n5.Search \n6.Sorting");
			System.out.println("Enter choice");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
		
			switch(ch)
			{
				case 1: 			
					a1.getData();
					break;
				case 2:
					a1.putData();
					break;
				case 3:
					a1.Insert();
					break;
				case 4:
					a1.Delete();
					break;
				case 5:
					a1.Search();
					break;
				case 6:
					a1.Sorting();
					break;
				default:
					System.out.println("Invalid Case");
					break;
			}
		  }while(ch!=7);		
	}		
}