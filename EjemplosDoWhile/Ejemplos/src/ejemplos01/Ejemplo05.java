/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        // 2. numero, i[0, n]
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
        numero = 3;
        // 8. potencia <-- 3
        potencia = 2;
        // 9. resultado <-- 1
        resultado = 1;
        // 10. contador, i[0-n]
        int contador = 1;
        // Generar la potencia de un numero a traves de multiplicaciones sucesivas 
        do {
            resultado = resultado * numero; // Multiplicar 
            contador = contador + 1; // Aumentar al contador
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
