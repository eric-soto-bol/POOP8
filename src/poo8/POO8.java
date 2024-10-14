/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo8;

/**
 * Clase principal que contiene el método main.
 * En esta clase se realizan pruebas con diferentes tipos de
 * polígonos y se muestra el uso del polimorfismo.
 */
public class POO8 {
    /**
     * Método principal que ejecuta el programa.
     * Se crean instancias de Triángulo y Cuadrilátero, y se
     * demuestra el uso del polimorfismo y herencia.
     * @param args Argumentos de línea de comando.
     */
    public static void main(String[] args) {
        // Creación de un polígono que es un Triángulo (polimorfismo)
        Poligono poligono1 = new Triangulo(60, 60, 60, 5, 5, 5, 5, 5);
        System.out.println(triangulo1);
        System.out.println("Área: " + triangulo1.area());
        System.out.println("Perímetro: " + triangulo1.perimetro());

        // Instancia de Cuadrilátero con atributos específicos
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(90, 90, 90, 5, 5, 5, 5, 5, 5);
        System.out.println(cuadrilatero1);
        System.out.println("Área: " + cuadrilatero1.area());
        System.out.println("Perímetro: " + cuadrilatero1.perimetro());

        // Polimorfismo: referenciar un Cuadrilátero como Polígono
        Poligono poligono2 = new Cuadrilatero();
        System.out.println(poligono2);

        // Otra instancia de Triángulo
        Triangulo triangulo2 = new Triangulo();
        System.out.println(triangulo2);

        // Reasignar poligono2 a un Triángulo
        poligono2 = triangulo2;
        System.out.println(poligono2);

        // Otra instancia de Cuadrilátero
        Cuadrilatero cuadrilatero2 = new Cuadrilatero();
        System.out.println(cuadrilatero2);

        // Demostración de un objeto de la clase Object
        Object object1 = new Object();
        System.out.println(object1);
        object1 = cuadrilatero2; // Polimorfismo: asignar Cuadrilátero a Object
        System.out.println(object1);

        // Identificar qué tipo de polígono es cada instancia
        identificarFiguras(poligono1);
        identificarFiguras(poligono2);

        // Creación de una instancia de Flauta y uso de sus métodos
        Flauta flauta = new Flauta();
        flauta.afinar();
        flauta.tocar();
        flauta.tipodeInstrumento();

        // Uso de constantes matemáticas y de Meses
        System.out.println(Math.PI);
        System.out.println(Meses.UNO);
        System.out.println(Meses.MESES[Meses.TRES]);
    }

    /**
     * Método que identifica qué tipo de Polígono es el
     * objeto recibido.
     * @param poligono Polígono que se va a identificar.
     */
    public static void identificarFiguras(Poligono poligono) {
        if (poligono instanceof Triangulo) {
            System.out.println("Instancia de Triángulo");
        } else if (poligono instanceof Cuadrilatero) {
            System.out.println("Instancia de Cuadrilátero");
        } else {
            System.out.println("Instancia de Polígono");
        }
    }
}
