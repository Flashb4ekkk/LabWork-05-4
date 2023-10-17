    package org.example;

    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("N = ");
            int N = scan.nextInt(), k = 1;
            System.out.printf("(iter) S0  =%9.5f %n", S0(N));
            System.out.printf("(rec up ++) S1 =%9.5f %n", S1(N, k));
            System.out.printf("(rec up --) S2 =%9.5f %n", S2(N, N));
            System.out.printf("(rec down ++) S3 =%9.5f %n", S3(N, k, 0));
            System.out.printf("(rec down --) S4 =%9.5f %n", S4(N, N, 0));
        }

        public static double S0(final int N) {
            double s = 0;
            for (int k = 1; k <= N; k++) {
                s += (1 + Math.sqrt(1 + Math.pow(k, 2))) / Math.pow(k, 2);
            }
            return s;
        }

        public static double S1(final int N, final int k) {
            if (k > N) {
                return 0;
            } else {
                return (1 + Math.sqrt(1 + Math.pow(k, 2))) / Math.pow(k, 2) + S1(N, k + 1);
            }
        }

        public static double S2(final int N, final int k) {
            if (k < 1) {
                return 0;
            } else {
                return (1 + Math.sqrt(1 + Math.pow(k, 2))) / Math.pow(k, 2) + S2(N, k - 1);
            }
        }

        public static double S3(final int N, final int k, double t) {
            t = t + (1 + Math.sqrt(1 + Math.pow(k, 2))) / Math.pow(k, 2);
            if (k >= N) {
                return t;
            } else {
                return S3(N, k + 1, t);
            }
        }

        public static double S4(final int N, final int k, double t) {
            t = t + (1 + Math.sqrt(1 + Math.pow(k, 2))) / Math.pow(k, 2);
            if (k <= 1) {
                return t;
            } else {
                return S4(N, k - 1, t);
            }
        }
    }