import java.util.Scanner;
public class assignmentNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of elements: ");
        int numElement = sc.nextInt();

        int array[] = new int[numElement];
        double total = 0, average;
        int keyhighest = 0, keylowest = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Input value of element " + i + " : ");
            array[i] = sc.nextInt();
        }
        int highest = array[0];
        int lowest = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > highest){
                highest = array[i];
                keyhighest = i;
            }
            if(array[i] < lowest){
                lowest = array[i];
                keylowest = i; 
            }
            total += array[i];
        }
        average = total / numElement;
        System.out.println("The highest value is " + highest + " at index " + keyhighest);
        System.out.println("The lowest value is " + lowest + " at index " + keylowest);
        System.out.println("The average of all the value is " + average);
    }
}