public static void ejer3 (int dim){
        String b = "";
        String a = "";
        
        for (int i = 1; i <= dim; i++){
            for (int k = 0; k < dim-i; k++){
                b += ".";
            }
            for (int j = 1; j <= i; j++){
                a += i;
            }
            System.out.println(b+a);
            a = "";
            b = "";
        }
    }
