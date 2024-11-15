import java.util.Scanner;
public class LinearSearch244107060101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int numberArray = sc.nextInt();

        int [] arrayInt = new int[numberArray];
        int result = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Enter the key you want to search for: ");
        int key = sc.nextInt();
        for (int i = 0; i < arrayInt.length; i++) {
            if(key == arrayInt[i]){
                result = i;
                break;
            }
        }
        if(result == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("The key in the array is located at index position " + result);
        }
    }
}