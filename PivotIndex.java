import java.util.*;

public class PivotIndex {
public static int findPivotIndex(int[] nums) {
int totalSum = 0;
for (int num : nums)
totalSum += num;

```
    int leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
        int rightSum = totalSum - leftSum - nums[i];
        if (leftSum == rightSum)
            return i;
        leftSum += nums[i];
    }
    return -1; // if no pivot index found
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();

    int[] nums = new int[n];
    System.out.println("Enter elements:");
    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    int pivot = findPivotIndex(nums);
    if (pivot != -1)
        System.out.println("Pivot Index: " + pivot);
    else
        System.out.println("No pivot index found.");
}
```

}
