public class arry_mul{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        if (array1.length != array2.length) {
            System.out.println("Arrays must be of equal length for multiplication.");
            return;
        }

        int[] productArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            productArray[i] = array1[i] * array2[i];
        }

        System.out.println("Product of the arrays:");
        for (int num : productArray) {
            System.out.print(num + " ");
        }
    }
}
