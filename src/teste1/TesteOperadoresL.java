/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste1;

/**
 *
 * @author Thiag
 */
public class TesteOperadoresL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r, r2;
        r = (x<y && y==z)? true:false;
        r2 = (x<y || y==z)? true:false;
        System.out.println(r);
        System.out.println(r2);
    }
    
}
