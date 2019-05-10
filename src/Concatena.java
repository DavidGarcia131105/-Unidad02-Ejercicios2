/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DAMDAW
 */
public class Concatena {

    public static void main(String[] args) {
        String a = "hola";
        String b = " adiós";
        String valor = "hola";

        valor = valor + " y adiós";
        valor += " y adiós";
        valor = valor.concat(" y adiós");
        System.out.println(valor);

        valor = new StringBuilder().append(valor).append(" y Adiós").toString();
        System.out.println(valor);
        
        a = a.concat(b);
        a = a + b;
        a += b;
        System.out.println(a);
    }
}
