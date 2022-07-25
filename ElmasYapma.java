/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elmasyapma;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class ElmasYapma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        
        System.out.println("N Sayisini Giriniz:");
        int n=inp.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            
            for(int k=1;k<=((2*i)-1);k++){
                System.out.print("*");
            }
            
            System.out.println(" ");
            
        }
        
        for(int l=1;l<=(n-1);l++){
            for(int m=1;m<=l;m++){
                System.out.print(" ");
            }
            
            for(int  c = 1; c <= ( 2 * n - (2 * l + 1) ); c++){
                System.out.print("*");
            }
            
            System.out.println(" ");
        }
        
        
    }
    
}
