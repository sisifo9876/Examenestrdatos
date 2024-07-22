/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Claudio
 */
public class ClonarPila {

    // Definición simple de una pila usando un array
    static class Pila {
        private int[] elementos;
        private int tamaño;

        public Pila(int capacidad) {
            elementos = new int[capacidad];
            tamaño = 0;
        }

        public void push(int valor) {
            if (tamaño < elementos.length) {
                elementos[tamaño++] = valor;
            }
        }

        public int pop() {
            if (tamaño > 0) {
                return elementos[--tamaño];
            }
            throw new RuntimeException("Pila vacía");
        }

        public boolean isEmpty() {
            return tamaño == 0;
        }

        public int size() {
            return tamaño;
        }

        public int peek() {
            if (tamaño > 0) {
                return elementos[tamaño - 1];
            }
            throw new RuntimeException("Pila vacía");
        }

        // Método para clonar la pila sin revertir el orden
        public Pila clonar() {
            Pila pilaTemporal = new Pila(this.size());
            Pila pilaClonada = new Pila(this.size());

            // Transferir los elementos de la pila original a la pila temporal
            while (!this.isEmpty()) {
                int valor = this.pop();
                pilaTemporal.push(valor);
                pilaClonada.push(valor);
            }

            // Restaurar la pila original desde la pila temporal
            while (!pilaTemporal.isEmpty()) {
                this.push(pilaTemporal.pop());
            }

            return pilaClonada;
        }
    }

    public static void main(String[] args) {
        Pila pila = new Pila(3);
        pila.push(3);
        pila.push(2);
        pila.push(1);

        // Clonar la pila
        Pila clonada = pila.clonar();

        // Imprimir la pila original (debe estar restaurada a su estado original)
        System.out.print("Pila original: ");
        imprimirPila(pila);
        System.out.println();

        // Imprimir la pila clonada
        System.out.print("Pila clonada: ");
        imprimirPila(clonada);
        System.out.println();
    }

    // Método para imprimir los elementos de la pila en el orden correcto
    private static void imprimirPila(Pila pila) {
        Pila pilaAux = new Pila(pila.size());
        while (!pila.isEmpty()) {
            int valor = pila.pop();
            System.out.print(valor + " ");
            pilaAux.push(valor);
        }
        // Restaurar la pila original al orden correcto
        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }
    }
}

// Costo asintótico: O(n)
// Justificación: El proceso de clonar la pila implica desapilar y apilar todos los elementos dos veces, por lo que el costo es lineal.
