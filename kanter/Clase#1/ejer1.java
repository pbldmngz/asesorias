public static void ejer1 (int dim){
        String a = "";
        String b = "";
        
        for (int i = 1; i <= dim; i++){
                a += i;
            for (int k = 0; k < dim-i; k++){
                b += "*";
            }
            System.out.println(a+b);
            b = "";
        }
    }
