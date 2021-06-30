/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;
import java.util.*;

/**
 *
 * @author HADIID ANDRI YULISON
 */ // PENGECEKAN TANDA KURUNG
public class Main {
    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
            = new ArrayDeque<>();
 
        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
 
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
    }
 
    // Driver code
    public static void main(String[] args)
    {
        System.out.println("Pengecekan tanda kurung");
        
        String expr = "{a^2 - [(b+c)^2-(d+e)^2]}";
        String expr1 = "{a - [(b+c))) - (d+e)]}";
        
        System.out.print("{a^2 - [ (b+c)^2 - (d+e)^2 ]} : ");
        // Function call number 1
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
        
        // ======================================
        
        System.out.print("{a - [(b+c))) - (d+e)]} : ");
       // function call number 2
       if (areBracketsBalanced(expr1))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
    
}

