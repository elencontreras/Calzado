package com.example.android.calzado;

/**
 * Created by Android on 30/09/2017.
 */

public class Metodos {

    public static double calcular(int gen, int tipo, int mar, int cant){
        int res=0, mont;

        if (gen==0 && tipo==0 && mar==0){
            res = 100000;
        }
        if (gen==0 && tipo==0 && mar==1){
            res = 130000;
        }
        if (gen==0 && tipo==0 && mar==2){
            res = 110000;
        }
        if (gen==0 && tipo==1 && mar==0){
            res = 60000;
        }
        if (gen==0 && tipo==1 && mar==1){
            res = 70000;
        }
        if (gen==0 && tipo==1 && mar==2){
            res = 120000;
        }
        if (gen==1 && tipo==0 && mar==0){
            res = 120000;
        }
        if (gen==1 && tipo==0 && mar==1){
            res = 140000;
        }
        if (gen==1 && tipo==0 && mar==2){
            res = 130000;
        }
        if (gen==1 && tipo==1 && mar==0){
            res = 50000;
        }
        if (gen==1 && tipo==1 && mar==1){
            res = 80000;
        }
        if (gen==1 && tipo==1 && mar==2){
            res = 100000;
        }

        mont = res*cant;
        return mont ;
    }

    public static boolean validarCantidad(int cant){
        if (cant==0) return true;
        else return false;

    }
}
