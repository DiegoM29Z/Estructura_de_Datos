
package Ejercicios;

import javax.security.auth.x500.X500Principal;
import javax.swing.JOptionPane;


public class segundo {

  
    public static void main(String[] args) {
        String tablero[][]=  new String [3][3];
        int numeros[][]=new int [3][3];
        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j <numeros[i].length; j++)
            {
              numeros[i][j]=Integer.parseInt(JOptionPane.showInputDialog("ingrese un 1=X----(-1)=O----para poder jugar triqui "));
                if (numeros[i][j]==1)
                {
                    tablero[i][j]="X";
                }else if(numeros[i][j]==-1)
                {
                   tablero[i][j]="O";
                }
                else{
                    tablero[i][j]="o";
                    
                }
            }
        }     //String tablero[][]= {{"X","O","X"},{"O","X","O"},{"O","X","O"}};

        
        String tf = null;
        String tc=null;
                String td1=null;
                         String td2=null;
        for (int i = 0; i <3; i++)
        {
            if (tablero[i][0]==tablero[i][1]&&tablero[i][1]==tablero[i][2])
            {
                 tf="triqui";
            }
        }
        for (int i = 0; i <3; i++)
        {
            if (tablero[0][i]==tablero[1][i]&&tablero[1][i]==tablero[2][i])
            {
                 tc="triqui";
            }
        }
        if (tablero[0][1]==tablero[1][1]&&tablero[1][1]==tablero[2][2])
        {
             td1="triqui";
        }
    
            if (tablero[0][2]==tablero[1][1]&&tablero[1][1]==tablero[2][0])
        {
             td2="triqui";
        }
            System.out.println("\t");
            System.out.println("_____________TRIQUI______________");
     for (int filas= 0; filas<tablero.length ; filas++)
        {
            System.out.println("");
            
            for (int columnas = 0; columnas < tablero[filas].length; columnas++)
                
            {
                System.out.print("\t"+tablero[filas][columnas]+" ");
               
               
        }}                        System.out.println("\n_________________________________");

        if ("triqui".equals(tf)||"triqui".equals(tc)||"triqui".equals(td1)||"triqui".equals(td2))
        {
            System.out.println("\n\t hay triqui ");

        }
        else 
        {
            System.out.println("\n\t no hay triqui");

        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    









}
    
    

