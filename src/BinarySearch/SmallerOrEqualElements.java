package BinarySearch;

/**
 * Problem Description
 * <p>
 * Given an sorted array A of size N. Find number of elements which are less than or equal to B.
 * <p>
 * NOTE: Expected Time Complexity O(log N)
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 106
 * <p>
 * 1 <= A[i], B <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * First agument is an integer array A of size N.
 * <p>
 * Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the number of elements which are less than or equal to B.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 3, 4, 4, 6]
 * B = 4
 * Input 2:
 * <p>
 * A = [1, 2, 5, 5]
 * B = 3
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 4
 * Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Elements (1, 3, 4, 4) are less than or equal to 4.
 * Explanation 2:
 * <p>
 * Elements (1, 2) are less than or equal to 3.
 */
public class SmallerOrEqualElements {
    public static int solve(int[] A, int B) {
        int low = 0, high = A.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid] > B)
                high = mid - 1;
            else if (A[mid] < B)
                low = mid + 1;
            else
                low = mid + 1;
        }
        return high + 1;
    }

    public static void main(String[] args) {
        int array[] = {1, 3, 4, 4, 6};
        System.out.println(solve(array, 4));
    }
}
