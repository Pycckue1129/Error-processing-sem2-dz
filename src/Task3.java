public class Task3 {
    public static void main(String[] args){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2,};
            abc[1] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль запрещено!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
