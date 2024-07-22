/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Claudio
 */
public class TiempoCompraEntradas {

    public static int tiempoParaComprar(int[] entradas, int k) {
        int n = entradas.length;
        int tiempo = 0;

        // Mientras haya personas en la cola
        while (entradas[k] > 0) {
            // Iterar sobre todas las personas en la cola
            for (int i = 0; i < n; i++) {
                if (entradas[i] > 0) {
                    entradas[i]--; // La persona compra un boleto
                    tiempo++; // Se incrementa el tiempo
                }

                // Si la persona en la posición k ha comprado todos sus boletos, detener el proceso
                if (i == k && entradas[k] == 0) {
                    return tiempo;
                }
            }
        }

        return tiempo;
    }

    public static void main(String[] args) {
        int[] entradas1 = {3, 4, 2};
        int k1 = 2;
        System.out.println("Tiempo para comprar entradas (caso 1): " + tiempoParaComprar(entradas1, k1));

        int[] entradas2 = {5, 2, 4, 3};
        int k2 = 0;
        System.out.println("Tiempo para comprar entradas (caso 2): " + tiempoParaComprar(entradas2, k2));
    }
}

// Costo asintótico: O(n*m)
// Justificación: En el peor de los casos, el algoritmo tiene que recorrer la cola `n` veces y procesar cada persona `m` veces, donde `m` es el número máximo de entradas que alguna persona quiere comprar. Por lo tanto, el costo es O(n*m),
//donde `n` es el número de personas en la cola y `m` es el número máximo de boletos que una persona quiere comprar.