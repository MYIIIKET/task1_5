package com.mylllket_inc.app;

public class Main {
    public static void main(String[] args) {
        getMatrix(7);
    }

    public static void getMatrix(int n) {
        byte[][] mat = new byte[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) == n - 1)
                    mat[i][j] = 1;
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
