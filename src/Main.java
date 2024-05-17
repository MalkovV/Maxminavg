public class Main {
    public static void main(String[] args) {

        int n = 10;
        double[] digits = new double[n];
        System.out.printf("Задан массив из %d элементов:\n", n);
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Math.random() * 100;
            System.out.printf("%.2f ", digits[i]);
        }
        System.out.println();

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

        System.out.printf("\nМаксимальное значение элемента массива: %.2f", max);
        System.out.printf("\nМинимальное значение элемента массива: %.2f", min);
        System.out.printf("\nСреднее значение всех элементов массива: %.2f \n\n", avg);

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length - i - 1; j++) {
                if (digits[j] > digits[j + 1]) {
                    double temp = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < digits.length; i++) {
            System.out.printf("Элемент массива с индексом %d:  %.2f \n",i, digits[i]);
        }
    }
}