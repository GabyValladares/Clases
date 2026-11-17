/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class Numero {

    //ATRIBUTOS GLOBALES -> PERSPECTIVA PRIVADA RESERVADA 
    //1) NIVEL VISIBILIDAD
    //2)NOMBRE
    //3)TIPO DE DATO
    public int idNumero;
    public double valor;
    public String tipo;
    public char signo;

    //MÉTODOS CONFORMAN LAS CLASES -> SON LA PERPECTIVA PÚBLICA
    //1) MÉTODOS CONSTRUCTORES-> INICIALIZAR LOS DATOS DE UN OBJETO
    public Numero() {
    }//CONSTRUCTOR VACÍO 
    //CONSTRUCTOR CON ARGUMENTOS

    public Numero(int idNumero, double valor, String tipo, char signo) {
        this.idNumero = idNumero;
        this.valor = valor;
        this.tipo = tipo;
        this.signo = signo;
    }

    //MÉTODOS DE LÓGICA DE NEGOCIO
    //MÉTODO DE NO RETORNO
    //PROGRAMACIÓN ESTRUCTURADA:
    public void calcularSuma(double n2) {
        double n1 = this.valor;
        double suma = n1 + n2;
        System.out.println("La sumas es:" + suma);
    }

    //POO
    //MÉTODO VOID CON ARGUMENTOS
    public void calcularSuma(Numero n1, Numero n2) {
        double suma = n1.valor + n2.valor;
        System.out.println("La suma es:" + suma);
    }

    //MÉTODO RETORNO CON 1 ARGUMENTO
    public double calcularSuma(Numero n) {
        double suma = this.valor + n.valor;
       // System.out.println("La suma es:" + suma);
        return suma;
    }

}
