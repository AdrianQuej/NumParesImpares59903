/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares59903;

/**
 *
 * @author Adrian Quej
 */
public class NumParesImpares59903 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 1;
        int paresTotales = 0;
        int imparesTotales = 0;
        int esPar = 0;
        
        
        while( numero <= 100 ){
            
            esPar= numero%2;
            
            if(esPar == 0){
            paresTotales = paresTotales + numero;
            }
             else{
                imparesTotales = imparesTotales + numero;
                }
            
            numero++;
            
            }
        
        System.out.println("paresTotales = " + paresTotales);
        System.out.println("imparesTotales = " + imparesTotales);
        }
        
    }
    

