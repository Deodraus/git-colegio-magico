package com.colegiomagico.reto7;

/**
 * Retorna el número mayor dentro del arreglo de tamaños.
 */
public class CofreVaritas {

    public static int varitaMasPoderosa(int[] tamanos) {
        int mayor = tamanos[0];
        for (int variable = 1; variable < tamanos.length; variable++) {
            if (tamanos[variable] > mayor) {
                mayor = tamanos[variable];
            }
        }

        return mayor;
    }

    public static void main(String[] args) {
        int[] varitas = {10, 15, 8};
        System.out.println("Poderosa: " + varitaMasPoderosa(varitas));
    }
}
