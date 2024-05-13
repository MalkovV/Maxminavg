public class Main {
    public static void main(String[] args) {

        int n = 20;
        double[] digits = new double[n];
        System.out.printf("Задан массив из %d элементов:\n", n);
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Math.round(Math.random() * 100);
            System.out.printf("%.0f ", digits[i]);
        }

        double max = digits[0];
        double min = digits[0];
        double avg = 0;
        for (int i = 0; i < digits.length; i++) {
            if (max < digits[i])
                max = digits[i];
            if (min > digits[i])
                min = digits[i];
            avg += digits[i] / digits.length;
        }

        System.out.printf("\nМаксимальное значение элемента массива: %.0f", max);
        System.out.printf("\nМинимальное значение элемента массива: %.0f", min);
        System.out.printf("\nСреднее значение всех элементов массива: %.2f", avg);
    }
}