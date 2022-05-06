/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import javax.swing.JOptionPane;

public class Ppal {
    
    public static void main(String[] args) {

        Matriz ob = new Matriz();
        int opc;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "n1 cargar,n2 Imprimir,n3 salir"));
            
            switch (opc){
                case 1:
                    ob.cargar();
                    break;
                case 2:
                    ob.impri();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Programa Finalizado\n ¡Gracias!");
            }
           }
         while (opc != 3);
        }
}                
        
        