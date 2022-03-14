package edu.dsw.pp2.dsw45634.ex_1.zad_3;

class Overload {

    static double getAverage(int a, int b) {
        return (a + b) / 2.;
    }

    static double getAverage(int arg, int...args) {
        int sum = arg;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum / (double) (args.length + 1);
    }

    static double getAverage(int[] tab) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum / (double) tab.length;
    }

    static double getAverage(double a, double b) {
        return (a + b) / 2;
    }

    static double getAverage(double arg, double...args) {
        double sum = arg;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum / (args.length + 1);
    }

    static double getAverage(double[] tab) {
        double sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum / tab.length;
    }

    public static void main(String[] args) {
        System.out.println(getAverage(1,2));
        System.out.println(getAverage(1,2, 3));
        System.out.println(getAverage(1,2, 3, 4));
        System.out.println(getAverage(new int[]{1,2,3,4,5}));
        System.out.println(getAverage(1.2,2.6));
        System.out.println(getAverage(1,2.7, 3.8));
        System.out.println(getAverage(1.2,2.5, 3.2, 4.1));
        System.out.println(getAverage(new double[]{1.4, 2.5, 3.1, 4.7, 5.3}));
    }
}
