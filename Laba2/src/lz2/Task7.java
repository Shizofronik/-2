package lz2;

public class Task7 {
	public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        if (n <= 0) {
            System.out.println("Пожалуйста, укажите положительное целое число.");
            return;
        }

        int power = 1; // 
        int exponent = 1; // 

        while (power <= n) {
            System.out.println(power);
            exponent++;
            power = (int) Math.pow(2, exponent);
        }
    }
}
