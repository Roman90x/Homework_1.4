import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы ч.2");
        System.out.println();

        System.out.println("Сгенерированный массив");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("Задание 1");
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();

        System.out.println("Задание 2");
        int maxSum = 100000;
        int minSum = 200000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxSum) {
                maxSum=arr[i];
            }
        }
        System.out.println(maxSum);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minSum) {
                minSum=arr[i];
            }
        }
        System.out.println(minSum);
        System.out.println();

        System.out.println("Задание 3");
        double middleSum = (double)sum/30;
        System.out.printf("Средняя сумма трат за месяц составила " + "%.2f рублей",middleSum);
        System.out.println();
        System.out.println();

        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i =reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
            public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}