/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Claudio
 */
public class ParesImpares {

    public void paresImpares(int[] nums) {
        StringBuilder pares = new StringBuilder("Pares: [");
        StringBuilder impares = new StringBuilder("Impares: [");
        for (int num : nums) {
            if (num % 2 == 0) {
                pares.append(num).append(", ");
            } else {
                impares.append(num).append(", ");
            }
        }
        if (pares.length() > 7) pares.setLength(pares.length() - 2); // Elimina la última coma y espacio
        if (impares.length() > 9) impares.setLength(impares.length() - 2); // Elimina la última coma y espacio
        pares.append("]");
        impares.append("]");
        System.out.println(pares.toString());
        System.out.println(impares.toString());
    }

    public static void main(String[] args) {
        ParesImpares solucion = new ParesImpares();
        int[] nums = {4, 9, 8, 6, 5, 3, 1};
        solucion.paresImpares(nums);
    }
}

// Costo asintótico: O(n)
// Justificación: Se recorre el arreglo 'nums' una sola vez, por lo tanto, el costo es lineal.

