import java.util.Scanner;

public class RemoveMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Find minimum and maximum
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < min)
                min = nums[i];
            if (nums[i] > max)
                max = nums[i];
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        // Print array after removing min and max
        System.out.print("Array after removing min and max: ");
        for (int i = 0; i < n; i++) {
            if (nums[i] != min && nums[i] != max)
                System.out.print(nums[i] + " ");
        }
    }
}
