/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

import java.util.Scanner;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class queue {
    void engueue(int queue[], int tail, int nilai){
        
        
        
        
        if (tail < -1){
           tail = tail + 1;
           queue[tail] = nilai;
        }
        else{
            System.out.println("Queue penuh, enqueue tidak dapat dilakukan");
            
        }
    }
    
    void dequeue(int queue[], int head, int tail, int nilai){
        
        if (head == tail){
            System.out.println("Queue kosong, dequeue tidak dapat dilakukan");
            
        }else{
            head = head + 1;
            nilai = queue[head];
        }
        
                
    }
    
        
    public static void main (String[] args){
        
      queue typedata = new queue();
        int[] queue = null;
      typedata.engueue(queue, 0, 0);
      typedata.dequeue(queue, 0, 0, 0);
      
      
      int head, tail;
      int n, nilai;
      
      head = tail = (-1);
      
      do {
          do {
              System.out.print("Masukkan Nilai Elemen : ");
              Scanner scanner = new Scanner(System.in);
              nilai = scanner.nextInt();
              
              System.out.println("");
              System.out.println("Tekan 1 untuk melanjutkan");
              Scanner lanjut = new Scanner(System.in);
              n = lanjut.nextInt();
              
          }while(n == 1);
          System.out.println();
          System.out.println("Tekan 1 untuk menghapus sebuah Elemen");
          Scanner lanjut2 = new Scanner(System.in);
           n = lanjut2.nextInt();
           System.out.println();
           System.out.println("Tekan 1 untuk menghapus sebuah elemen");
           Scanner lanjut3 = new Scanner(System.in);
           n = lanjut3.nextInt();
      while(n==1){
      
      System.out.println("Nilai telah dihapus : "+nilai);
      System.out.println();
      
      System.out.println("Tekan 1 untuk menghapus sebuah elemen : ");
      Scanner lanjut4 = new Scanner(System.in);
       n = lanjut4.nextInt();
    }
       System.out.println();
       System.out.println("Tekan 1 untuk Melanjutlan : ");
       Scanner lanjut5 = new Scanner(System.in);
       n = lanjut5.nextInt();
      
      
    } while (n == 1);
      
      
      
      
      
      
      
      
      
      
    }
}
        
