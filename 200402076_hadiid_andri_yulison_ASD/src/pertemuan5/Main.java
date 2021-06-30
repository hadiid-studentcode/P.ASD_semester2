/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;
import java.util.Scanner;

/**
 *
 * @author HADIID ANDRI YULISON
 */
public class Main {
    
    
    void faktorial (){
        
        int i, jlh = 1;
        
        System.out.print("Masukkan bilangan faktorial : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        System.out.println("n         n!");
        System.out.println("-------------");
        if (a<1){
            System.out.println("Silahkan masukkan angka lebih besar dari 0");
            
        }else {
            for(i=1; i<=a;i++){
                jlh = jlh*i;
                System.out.println(i+"               "+jlh);
            }
            System.out.println("==========================");
        }
         
    }
    
    void fibonacci (){
        Scanner show = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Deret Fibonacci : ");
        int n = show.nextInt();
        long fib[] = new long[n];
        
        fib[0]=0;
        fib[1]=1;
        
        for(int i = 2; i < n; i++){
            fib[i] = fib[i-1]+ fib[i-2];
        }
        for (int i = 0; i < n ; i++){
            System.out.print(fib[i]+ " ");
        }
    }
    
    void TahunKabisat () {
    int tahun;
    Scanner scan = new Scanner (System.in);
    
    System.out.print("\nMasukkan tahun : ");
    tahun = scan.nextInt();
    
    if (tahun > 2021 && tahun < 2134 && tahun % 400 == 0){
        System.out.print(tahun+" merupakan Tahun Kabisat\n");
    } else if (tahun > 2021 && tahun < 2134 && tahun % 100 == 0){
        System.out.print(tahun+" Merupakan Tahun Kabisat\n");
    } else if (tahun > 2021 && tahun < 2034 && tahun % 4 == 0){
        System.out.print(tahun +  " Merupakan Tahun Kabisat \n");
    } else if (2021 > tahun) {
        System.out.println("Maaf , Tahun Input Anda di Bawah 2021");
        
    } else if (2134 < tahun){
        System.out.println("Maaf , Tahun Input Anda di atas 2134");
    } else {
        System.out.println(tahun+" Bukan Tahun Kabisat");
    }
    
    
    }
    

    
    public static void main(String[] args){
        Main tugasasd = new Main();
        tugasasd.faktorial();
        tugasasd.fibonacci();
        tugasasd.TahunKabisat();
        

       
            
            
        
        
    }
    
}
