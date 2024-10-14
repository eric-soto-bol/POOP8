/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;
/**
* Clase Cuadrilátero que hereda de Polígono.
* Representa un cuadrilátero y tiene métodos para calcular el
área y el perímetro.
*/
public class Cuadrilatero extends Poligono {
 private int alfa, beta, gama; // Ángulos del cuadrilátero
 private float a, b, c, d; // Lados del cuadrilátero
 private float base, altura; // Base y altura
// Constructor por defecto

    public Cuadrilatero() {
    }
 // Constructor con parámetros
    public Cuadrilatero(int alfa, int beta, int gama, float a, float b, float c, float d, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getGama() {
        return gama;
    }

    public void setGama(int gama) {
        this.gama = gama;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
// Implementación del método perimetro
 @Override
 public float perimetro() {
 return a + b + c + d;
 }
 // Implementación del método area
 @Override
 public float area() {
 return base * altura;
 }
 // Método toString para mostrar la información del cuadrilátero

    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", base=" + base + ", altura=" + altura + '}';
    }
 
}
