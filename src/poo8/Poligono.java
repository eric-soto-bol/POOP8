/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;
/**
* Clase abstracta Polígono que sirve como superclase para
Triángulo y Cuadrilátero.
* Define los métodos abstractos area y perimetro que deben
ser implementados por las subclases.
*/
public abstract class Poligono {
 // Constructor por defecto
 public Poligono() {}
 // Métodos abstractos que deben ser implementados por lassubclases
 public abstract float area();
 public abstract float perimetro();
 // Método toString para mostrar información básica del polígono
 @Override
 public String toString() {
 return "Poligono{" + '}';
 }
}

