public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 1;
            int[] doubleArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8,};
            int catchedRes1 = doubleArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
