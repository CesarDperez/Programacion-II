/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Matriz {
    private static Scanner sc;
     private Object JOptionpane;
    public Matriz(){
        m= new int[3][3];
        }
      int m[][];
    
   
    public void cargar(){
        int dato=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
              m[i][j]=dato;
              dato++;  
            }
        }
    }
    public void impri(){
        String salida="Los datos son:\n";
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                salida+=m[i][j]+" ";
            }
            salida+="\n";
        }
        JOptionPane.showMessageDialog(null,salida);
    }
}