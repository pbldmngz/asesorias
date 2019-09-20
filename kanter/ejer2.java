public static void ejer2 (int a, int b){
        for (int i = 1; i <= a; i++){
            for (int j = i; j <= i*b; j += i){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
