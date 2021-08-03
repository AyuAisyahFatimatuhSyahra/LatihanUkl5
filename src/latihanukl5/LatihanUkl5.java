/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl5;

/**
 *
 * @author MOKLET-1
 */
public class LatihanUkl5 {
  
    public static void main(String[] args) {
   
        
        int matriks1 [] [] = {{-5, 3}, {7, 2}};//matriks bagian A dengan ordo 2 2
        int matriks2 [] [] = {{3, 1}, {5, -2}};//matriks bagian B dengan ordo 2 2
       
        System.out.println("Matriks A = ");
        for (int a = 0; a < matriks1.length; a++) {
            for (int b = 0; b < matriks1[0].length; b++) {
                System.out.print(matriks1[a][b] + " ");
            }
            System.out.println();
        }
        
         System.out.println();
        System.out.println("Matriks B = ");
        for (int m = 0; m < matriks2.length; m++) {
            for (int n = 0; n < matriks2[0].length; n++) {
                System.out.print(matriks2[m][n] + " ");
            }
            System.out.println();
        }
        System.out.println("Hasil dari Matriks A-B adalah");
          
        for (int i = 0; i<matriks1.length; i++){
            for (int j = 0; j< matriks1[0].length; j++){
                int hasilBilanganMatriks = matriks1[i][j]-matriks2[i][j];
                System.out.print(hasilBilanganMatriks +"");
            }
            System.out.println();            
        }
      }
    }
    

