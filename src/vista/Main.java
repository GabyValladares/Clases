/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Numero;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        //CREAR O INSTANCIAR OBJETOS
        //USANDO CONSTRUCTOR VACÍO
        Numero n1=new Numero();
        n1.idNumero=100;
        n1.signo='+';
        n1.tipo="Entero";
        n1.valor=8;
        
        //USANDO EL CONSTRUCTOR CON ARGUMENTOS
        Numero n2=new Numero(200, 89, "Entero", '+');
        double suma=n1.valor+n2.valor;
        System.out.println("la suma es:"+suma);
        
        
    }
}
