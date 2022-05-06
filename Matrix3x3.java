package matrizburbu;
import javax.swing.JOptionPane;
public class matrizburbu {

    public static void main(String[] args) {
        int matriz [][]=new int [3][3];
        for(int i=0; i<3;i++){
            for(int g=0;g<3;g++){
                matriz[i][g]=Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
            }
        }
        for(int i=0;i<3;i++){
            for(int g=0;g<3;g++){
                for(int r=0;r<3;r++){
                    for(int h=0;h<3;h++){
                        if(matriz[i][g]>=matriz[r][h]){
                            matriz[i][g]=matriz[i][g];
                        }else{
                            int temp=matriz[r][h];
                            matriz[r][h]=matriz[i][g];
                            matriz[i][g]=temp;
                        }
                    }
                }
            }
        }
            for(int i=0;i<3;i++){
                for(int g=0;g<3;g++){
                   System.out.print(matriz[i][g]+"\t"); 
                }
                System.out.println("");
            }
    }
}