/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;
import java.util.Stack; 
/**
 *
 * @author HADIID ANDRI YULISON
 */ // Evaluasi Postfix

public class Main2 {
    static int evaluatePostfix(String exp){ 
        
        Stack<Integer> stack=new Stack<>(); 
          
        for(int i=0;i<exp.length();i++){ 
            char c=exp.charAt(i); 
              
            if(Character.isDigit(c)){ 
                stack.push(c - '0'); 
            }    
              
            else{ 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(c){ 
                    case '+': 
                        stack.push(val2+val1); 
                        break; 
                      
                    case '-': 
                        stack.push(val2- val1); 
                        break; 
                      
                    case '/': 
                        stack.push(val2/val1); 
                        break; 
                      
                    case '*': 
                        stack.push(val2*val1); 
                        break; 
                } 
            } 
        } 
        return stack.pop();     
    } 
      
    public static void main(String[] args){
        
        String s = "12^23+2^45+2"; 
        String a = "123*3/32+*+";
        
        System.out.print("Evaluasi Postfix 12^23+2^45+2^-- : " );
        System.out.println(evaluatePostfix(s));
        
        System.out.print("Evaluasi Postfix abc*3/cb+*+, jika a=1, b=2 dan c=3 : ");
        System.out.println(evaluatePostfix(a));
        
    } 
}
