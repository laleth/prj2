import java.util.Arrays;
import java.util.Scanner;
class sort{
 public static void main(String args[]) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=s.nextInt();
        int arr1[]=new int[n];
        String arr2[]=new String[n];
        System.out.println("Enter the array 1 value....");
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter the array 2 value....");
        for(int i=0;i<n;i++){
            arr2[i]=s.next();
        }
        System.out.println("Original int array series"+Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("The sorted int array series"+Arrays.toString(arr1));
        System.out.println("Original String array series"+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("The sorted int array series"+Arrays.toString(arr2));
    }

}