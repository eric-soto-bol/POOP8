/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;
/**
* Clase Flauta que hereda de instrumentoDeViento.
* Representa una flauta y tiene métodos específicos para
afinar y tocar.
*/
public class Flauta extends instrumentoDeViento {
 // Constructor por defecto
 public Flauta() {}
 // Sobrescribir el método afinar
 @Override
 public void afinar() {
 System.out.println("afinar");
 }
// Sobrescribir el método tipodeInstrumento
@Override
   public String tipodeInstrumento() {
    System.out.println("flauta");
    return "flauta";
 }
 // Sobrescribir el método tocar
 @Override
 public void tocar() {
 System.out.println("Tocando la flauta");
 }
 // Método toString para mostrar la información de la flauta
 @Override
 public String toString() {
 return "fluata()";
 }
}

