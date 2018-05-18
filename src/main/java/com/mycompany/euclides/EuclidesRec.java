
package com.mycompany.euclides;


public class EuclidesRec {   
  public static int obtener_mcd(int a, int b) {
       if(b==0)
           return a;
       else
           return obtener_mcd(b, a % b);
   } 
}
