/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Claudio
 */
public class MenoresQueActual {

    public int[] menoresQueActual(int[] nums) {
        int[] resultado = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            resultado[i] = count;
        }
        return resultado;
    }

    public static void main(String[] args) {
        MenoresQueActual solucion = new MenoresQueActual();
        int[] nums = {5, 3, 8, 2, 1};
        int[] resultado = solucion.menoresQueActual(nums);
        System.out.print("Resultado: [");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

// Costo asintótico: O(n^2)
// Justificación: Se utilizan dos bucles anidados que recorren el arreglo 'nums', por lo tanto, el costo es cuadrático.

