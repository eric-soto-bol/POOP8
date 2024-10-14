/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;
/**
* Clase instrumentoDeViento que implementa la interfaz
instrumentoMusical.
* Representa un instrumento musical de viento.
*/
public class instrumentoDeViento implements
instrumentoMusical {
 // Constructor por defecto
 public instrumentoDeViento() {}
 // Implementación del método tocar
 @Override
 public void tocar() {
 System.out.println("tocando");
 }
 // Implementación del método tipodeInstrumento
 @Override
 public String tipodeInstrumento() {
 System.out.println("musical");
 return "musical";
 }
 // Implementación del método afinar
 @Override
 public void afinar() {
 System.out.println("afinado");
 }
 // Método toString para representar el instrumento
 @Override
 public String toString() {
 return "instrumentoDeViento{" + '}';
 }
}
