public static void ejer5 (int dim){
        //Si lo que quiere es centrarlos necesitaré otro algoritmo
        for (int i = 0; i < dim; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = dim - 1; i >= 0; i--){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
