/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;
/**
* Clase Triángulo que hereda de Polígono.
* Esta clase representa un triángulo con sus atributos y
métodos para calcular área y perímetro.
*/
public class Triangulo extends Poligono {
 private int alfa; // Ángulo alfa del triángulo
 private int beta; // Ángulo beta del triángulo
 private int gama; // Ángulo gama del triángulo
 private float a, b, c; // Lados del triángulo
 private float base, altura; // Base y altura del triángulo
// Constructor sin parámetros
    public Triangulo() {
    }
// Constructor con parámetros
    public Triangulo(int alfa, int beta, int gama, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }
 // Getters y Setters
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
    
     // Implementación del método area
 @Override
 public float area() {
 return (base * altura / 2);
 }
 // Implementación del método perimetro
 @Override
 public float perimetro() {
 return a + b + c;
 }

// Método toString para mostrar la información del triángulo
    @Override
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
 
 
}

