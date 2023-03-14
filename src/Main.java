

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int maximum = arr[0];
        int minimum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }

        }

        System.out.println("Минимальная сумма трат за день составила " + minimum + " рублей. Максимальная сумма трат за день составила " + maximum + " рублей.");
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average = average + (double) arr[i] / arr.length;

        }
        System.out.printf("Средняя сумма трат за месяц составила " + " %.2f рублей", average);

    }

    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
        System.out.print(reverseFullName[i]);
        }
    }

}





        //Как сравнить два массива
        //int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        //// Создаем массив
        //int[] weightsCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
// Создаем копию массива
//
        //boolean arraysAreEqual = true;
// Объявляем переменную «массивыРавны», присваиваем ей значение true
//arraysAreEqual = weights.length == weightsCopy.length;
// Сравниваем длину массива weights с длинной массива weightsCopy
        //    if (arraysAreEqual) {
        //    for (int i = 0; i < weights.length; i++) {
        //   Сравниваем значения внутри массивов
        //    if (weights[i] != weightsCopy[i]) {
        //   Если значения внутри массивов не равны
        //    arraysAreEqual = false;
        //   то arraysAreEqual (массивыРавны) — false
        //    }
        //    }
        //    }
        //    if (arraysAreEqual) {
        //    System.out.println("Массивы одинаковые");
        //    } else {
        //    System.out.println("Массивы разные");
        //    }