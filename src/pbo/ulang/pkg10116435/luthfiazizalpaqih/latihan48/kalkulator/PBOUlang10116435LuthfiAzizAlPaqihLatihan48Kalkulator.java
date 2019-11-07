/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.luthfiazizalpaqih.latihan48.kalkulator;

/**
 *
 * @author Luthfi
 * NIM  : 10116435
 * NAMA : Luthfi Aziz Al Paqih
 */
public class PBOUlang10116435LuthfiAzizAlPaqihLatihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator ktr = new Kalkulator();
        ktr.setValue1(7);
        ktr.setValue2(5);

        System.out.println("VALUE 1 = "+ktr.getValue1());
        System.out.println("VALUE 2 = "+ktr.getValue2());
        ktr.setNameProject();
        ktr.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = "+ktr.add(ktr.getValue1(),ktr.getValue2()));
        System.out.println("Result Minus is = "+ktr.minus(ktr.getValue1(),ktr.getValue2()));
        System.out.println("Result Multiplication is = "+ktr.multiplication(ktr.getValue1(),ktr.getValue2()));
        System.out.println("Result Division is = "+ktr.division(ktr.getValue1(),ktr.getValue2()));
    }
    
}
