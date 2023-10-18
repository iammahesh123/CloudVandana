import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5, 6, 7};
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        // Print shuffled array
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
