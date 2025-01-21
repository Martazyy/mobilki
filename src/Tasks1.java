import java.util.Scanner;

public class Tasks1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Выберите номер задачи (1-20):");
            choice = scanner.nextInt();
            System.out.println("###############################");
            //scanner.nextLine();

            switch (choice) {
                case 1:
                    FisrtTask(scanner);
                    break;
                case 2:
                    SecondTask(scanner);
                    break;
                case 3:
                    ThirdTask();
                    break;
                case 4:
                    FourthTask(scanner);
                    break;
                case 5:
                    FifthTask(scanner);
                    break;
                case 6:
                    SixthTask(scanner);
                    break;
                case 7:
                    SeventhTask(scanner);
                    break;
                case 8:
                    EighthTask(scanner);
                    break;
                case 9:
                    NinthTask(scanner);
                    break;
                case 10:
                    TenthTask(scanner);
                    break;
                case 11:
                    EleventhTask(scanner);
                    break;
                case 12:
                    TwelfthTask(scanner);
                    break;
                case 13:
                    ThirteenthTask(scanner);
                    break;
                case 14:
                    FourteenthTask(scanner);
                    break;
                case 15:
                    FifteenthTask(scanner);
                    break;
                case 16:
                    SixteenthTask(scanner);
                case 17:
                    SeventeenthTask(scanner);
                    break;
                case 18:
                    EighteenthTask(scanner);
                    break;
                case 19:
                    NineteenthTask(scanner);
                    break;
                case 20:
                    TwentiethTask(scanner);
                    break;
                default:
                    System.out.println("Неверный номер задачи");
                    break;
            }
        } while ( choice != 0 );
        scanner.close();
    }

    //Задача 1: Четное или нечетное число
    private static void FisrtTask(Scanner scanner){
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }

    //Задача 2: Минимальное из трех чисел
    private static void SecondTask(Scanner scanner){
        System.out.println("Введите три числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Минимальное число: " + min);
    }

    //Задача 3: Таблица умножения
    public static void ThirdTask() {
        System.out.println("Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }

    //Задача 4: Сумма чисел от 1 до N
    public static void FourthTask(Scanner scanner) {
        System.out.println("Введите число N:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
    }

    //Задача 5: Число Фибоначчи
    public static void FifthTask(Scanner scanner) {
        System.out.println("Введите число N:");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Первые " + n + " чисел Фибоначчи: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    //Задача 6: Проверка простого числа
    public static void SixthTask(Scanner scanner) {
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Число простое.");
        } else {
            System.out.println("Число не является простым.");
        }
    }

    //Задача 7: Обратный порядок чисел
    public static void SeventhTask(Scanner scanner) {
        System.out.println("Введите число N:");
        int n = scanner.nextInt();
        System.out.println("Числа от " + n + " до 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Задача 8: Сумма четных чисел
    public static void EighthTask(Scanner scanner) {
        System.out.println("Введите два числа A и B:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел в диапазоне: " + sum);
    }

    //Задача 9: Реверс строки
    public static void NinthTask(Scanner scanner) {
        System.out.println("Введите строку:");
        scanner.nextLine();
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Строка в обратном порядке: " + reversed);
    }

    //Задача 10: Количество цифр в числе
    public static void TenthTask(Scanner scanner) {
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int count = String.valueOf(Math.abs(number)).length();
        System.out.println("Количество цифр: " + count);
    }

    //Задача 11: Факториал числа
    public static void EleventhTask(Scanner scanner) {
        System.out.println("Введите число N:");
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + n + " = " + factorial);
    }

    //Задача 12: Сумма цифр числа
    public static void TwelfthTask(Scanner scanner) {
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += Math.abs(number % 10);
            number /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum);
    }

    //Задача 13: Палиндром
    public static void ThirteenthTask(Scanner scanner) {
        System.out.println("Введите строку:");
        scanner.nextLine();
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }

    //Задача 14: Найти максимальное число в массиве
    public static void FourteenthTask(Scanner scanner) {
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
    }

    //Задача 15: Сумма всех элементов массива
    public static void FifteenthTask(Scanner scanner) {
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }

    //Задача 16: Количество положительных и отрицательных чисел
    public static void SixteenthTask(Scanner scanner) {
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        int positiveCount = 0, negativeCount = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Положительных чисел: " + positiveCount);
        System.out.println("Отрицательных чисел: " + negativeCount);
    }

    //Задача 17: Простые числа в диапазоне
    public static void SeventeenthTask(Scanner scanner) {
        System.out.println("Введите два числа A и B:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Простые числа в диапазоне:");
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Задача 18: Подсчет гласных и согласных в строке
    public static void EighteenthTask(Scanner scanner) {
        System.out.println("Введите строку:");
        scanner.nextLine();
        String input = scanner.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (char c : input.toCharArray()) {
            if ("aeiouаеёиоуыэюя".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }
        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }

    //Задача 19: Перестановка слов в строке
    public static void NineteenthTask(Scanner scanner) {
        System.out.println("Введите строку:");
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Слова в обратном порядке: " + reversed.toString().trim());
    }

    //Задача 20: Число Армстронга
    public static void TwentiethTask(Scanner scanner) {
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int original = number;
        double sum = 0;
        double digits = String.valueOf(number).length();
        while (number != 0) {
            double digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        if (sum == original) {
            System.out.println("Число является числом Армстронга.");
        } else {
            System.out.println("Число не является числом Армстронга.");
        }
    }
}