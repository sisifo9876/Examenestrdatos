/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
public class DosNumerosQueSuman {

    public int[] dosNumerosQueSuman(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Esto no debería pasar según el enunciado
    }

    public static void main(String[] args) {
        DosNumerosQueSuman solucion = new DosNumerosQueSuman();
        int[] nums = {2 , 7, 8, 3};
        int target = 15;
        int[] resultado = solucion.dosNumerosQueSuman(nums, target);
        System.out.println("Índices de los dos números que suman " + target + ": [" + resultado[0] + ", " + resultado[1] + "]");
    }
}

// Costo asintótico: O(n^2)
// Justificación: Se utilizan dos bucles anidados para recorrer el arreglo 'nums', por lo tanto, el costo es cuadrático.
