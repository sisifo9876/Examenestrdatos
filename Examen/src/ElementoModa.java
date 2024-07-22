/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Claudio
 */
public class ElementoModa {

    public int elementoModa(int[] nums) {
        int maxCount = 0;
        int moda = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                moda = nums[i];
            }
        }
        return moda;
    }

    public static void main(String[] args) {
        ElementoModa solucion = new ElementoModa();
        int[] nums = {4, 5, 4, 3, 4, 5, 3};
        int resultado = solucion.elementoModa(nums);
        System.out.println("Elemento con mayor frecuencia: " + resultado);
    }
}

// Costo asintótico: O(n^2)
// Justificación: Se utilizan dos bucles anidados que recorren el arreglo 'nums', por lo tanto, el costo es cuadrático.

