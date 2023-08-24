
package ejercicios_foreach;

import java.util.Random;
public class segundo {

    
    public static void main(String[] args) {
      
    int num []=new int [10];
 
 Random rnd=new Random();
      
for(int i=0;i<num.length;i++)
              {
              num[i]  =rnd.nextInt(11);  
              }

for(int aux:num)
{
if(aux==5)
    {
        System.out.println("se encontro un 5");
        break;
    }
    else 
    {
      System.out.println(""+aux);
       
    }
  
}
    






       
    
    
    
    }
    
}
