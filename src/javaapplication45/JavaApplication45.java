/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication45;

import java.util.Scanner;

/**
 *
 * @author RANADEEP
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
         int i;
        System.out.println();
        DeleteAChar dlt= new DeleteAChar();
        System.out.println(dlt.daleteA(str));
        
    }
    
}
class DeleteAChar
{
    public String daleteA(String str)
    {
        StringBuilder sb=new StringBuilder(str);
         for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)==97 && i<=1)
            {
                sb.deleteCharAt(i);
                i--;
            }   
        }
         return sb.toString();
        
    }
}