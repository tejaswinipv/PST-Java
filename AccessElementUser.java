import java.util.Scanner;

public class AccessElementUser {
    public static void main(String[] args) {

        int[] arr = {5, 15, 25, 35, 45};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index number: ");
        int index = sc.nextInt();

        if (index >= 0 && index < arr.length) {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Invalid index!");
        }
    }
}
