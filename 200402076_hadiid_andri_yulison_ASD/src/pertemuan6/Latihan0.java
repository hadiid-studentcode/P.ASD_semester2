/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;
// LATIHAN 0


/**
 *
 * @author HADIID ANDRI YULISON
 * mengubah perulangan dengan for pada slide sebelumnya dengan
 * menggunakan mekanisme while dan do-while
 */
class Latihan0 {
   public static void main (String [] args){
        System.out.println("LATIHAN 0");
       System.out.println("Mekanisme for");
       int i,j;
       
       for (i=0, j=4; i<5; i ++, j--){
           System.out.println("Nilai i: "+i);
           System.out.println("Nilai j: "+j);
           System.out.println();
        
       }
    System.out.println("Mekanisme while"); 
       int a = 0;
       int b = 4;        
       while (a<5){
           System.out.println("Nilai a : "+a);
           System.out.println("Nilai b : "+b);
           System.out.println();
           a++;
           b--;
       }

    System.out.println("Mekanisme do-while"); 
        int c = 0;
        int d = 4;
        do {
            System.out.println("Nilai c : "+c);
            System.out.println("Nilai d : "+d);
            System.out.println();
            c++;
            d--;
        }while(c<5);
           
      

   }
    
}

