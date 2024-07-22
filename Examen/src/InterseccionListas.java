/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Claudio
 */
public class InterseccionListas {

    public static int[] interseccion(int[] lista1, int[] lista2) {
        int n1 = lista1.length;
        int n2 = lista2.length;
        int[] temp = new int[Math.min(n1, n2)]; // Tamaño máximo de la intersección
        int k = 0; // Índice para el array temporal

        // Encontrar los elementos comunes
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (lista1[i] == lista2[j]) {
                    boolean yaAgregado = false;
                    // Verificar si el elemento ya está en el array temp
                    for (int l = 0; l < k; l++) {
                        if (temp[l] == lista1[i]) {
                            yaAgregado = true;
                            break;
                        }
                    }
                    if (!yaAgregado) {
                        temp[k++] = lista1[i];
                    }
                }
            }
        }

        // Copiar los resultados al array final
        int[] resultado = new int[k];
        for (int i = 0; i < k; i++) {
            resultado[i] = temp[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] lista1 = {7, 8, 9, 10};
        int[] lista2 = {4, 8, 7, 11};
        int[] interseccion = interseccion(lista1, lista2);

        System.out.print("Intersección: [");
        for (int i = 0; i < interseccion.length; i++) {
            System.out.print(interseccion[i]);
            if (i < interseccion.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

// Costo asintótico: O(n^2)
// Justificación: El algoritmo utiliza dos bucles anidados para comparar los elementos de las dos listas, por lo que el costo es cuadrático.

