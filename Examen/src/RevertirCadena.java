/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Claudio
 */
public class RevertirCadena {

    // Definición simple de una pila usando un array
    static class Pila {
        private char[] elementos;
        private int tamaño;

        public Pila(int capacidad) {
            elementos = new char[capacidad];
            tamaño = 0;
        }

        public void push(char c) {
            if (tamaño < elementos.length) {
                elementos[tamaño++] = c;
            }
        }

        public char pop() {
            if (tamaño > 0) {
                return elementos[--tamaño];
            }
            throw new RuntimeException("Pila vacía");
        }

        public boolean isEmpty() {
            return tamaño == 0;
        }
    }

    public static String revertirCadena(String cadena) {
        Pila pila = new Pila(cadena.length());

        // Apilar cada caracter de la cadena
        for (char c : cadena.toCharArray()) {
            pila.push(c);
        }

        // Desapilar y construir la cadena invertida
        StringBuilder resultado = new StringBuilder();
        while (!pila.isEmpty()) {
            resultado.append(pila.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String cadena = "YVAN EHT NIOJ";
        String cadenaInvertida = revertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}

// Costo asintótico: O(n)
// Justificación: Cada caracter de la cadena se apila y se desapila una vez, por lo tanto, el costo es lineal.

