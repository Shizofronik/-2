package lz2;

public class Task4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            return; 
        }

        try {
            int n = Integer.parseInt(args[0]);

            if (n <= 0) {
                System.out.println("Введите положительное число");
                return;
            }

            double sum = 0;

            for (int i = 0; i < n; i++) {
                double randomValue = Math.random();
                System.out.println(randomValue);
                sum += randomValue;
            }

            double average = sum / n;

            System.out.println("Среднее значение: " + average);
        } 
        catch (NumberFormatException e) {
            System.out.println("Введите чиссло.");
        }
    }
}

