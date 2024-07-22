/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Claudio
 */
public class ReordenarLista {

    public static void reordenar(int[] lista) {
        int n = lista.length;
        int mid = n / 2;
        int j = n - 1;

        // Reordenar la lista en el formato requerido
        int[] temp = new int[n];
        int i = 0;

        for (int k = 0; k < mid; k++) {
            temp[i++] = lista[k];
            temp[i++] = lista[j--];
        }

        if (n % 2 != 0) {
            temp[i] = lista[mid];
        }

        // Copiar el resultado a la lista original
        for (int k = 0; k < n; k++) {
            lista[k] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] lista = {7, 5, 4, 2};
        reordenar(lista);

        System.out.print("Lista reordenada: [");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
            if (i < lista.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

// Costo asintótico: O(n)
// Justificación: El algoritmo recorre la lista una vez para dividirla en dos partes y otra vez para reorganizar los elementos, por lo que el costo es lineal.

