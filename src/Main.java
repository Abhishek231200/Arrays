import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        array a1=new array();

        int ch;
        do { System.out.println("1: Insert array\n2: Print array");
        System.out.println("Enter your choice");
		Scanner scan=new Scanner(System.in);
        ch=scan.nextInt();

            switch (ch) {
                case 1:
                    a1.get_data();
                    break;
                case 2:
                    a1.put_data();
                    break;
                default:
                    System.out.println("It is Invalid choice");
            }

        }while(ch!=8);
    }
}
