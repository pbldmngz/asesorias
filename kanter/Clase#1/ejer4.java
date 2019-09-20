public static void ejer4 (int dim){
        //Triángulo de pascal... no precisamente el mejor algoritmo para empezar
        int[] a = new int[1];
        for (int i = 1; i <= dim; i++) {
            int[] k = new int[i];
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == (i - 1)) {
                    k[j] = 1;
                } else {
                    k[j] = a[j] + a[j - 1];
                }
                System.out.print(k[j] + " ");
            }
            a = k;
            System.out.println();
        }
    }
