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
    public int idNumero ;
    public double valor;
    public String tipo;
    public char signo;
    
    //MÉTODOS CONFORMAN LAS CLASES -> SON LA PERPECTIVA PÚBLICA
    //1) MÉTODOS CONSTRUCTORES-> INICIALIZAR LOS DATOS DE UN OBJETO
    public Numero(){}//CONSTRUCTOR VACÍO 
    //CONSTRUCTOR CON ARGUMENTOS
    public Numero(int idNumero,double valor, String tipo,char signo){
        this.idNumero=idNumero;
        this.valor=valor;
        this.tipo=tipo;
        this.signo=signo;
    }
    
}
