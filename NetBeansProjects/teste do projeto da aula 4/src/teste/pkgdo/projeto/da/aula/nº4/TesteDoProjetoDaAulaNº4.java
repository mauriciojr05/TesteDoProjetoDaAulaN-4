/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.pkgdo.projeto.da.aula.nº4;

/**
 *
 * @author mauricio.junior1
 */
public class TesteDoProjetoDaAulaNº4 {
    int a = 6;
    int b = 7;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    TesteDoProjetoDaAulaNº4 Val = new TesteDoProjetoDaAulaNº4();
    int[] ListNum = {4, 6, 2, 7, 1, 3, 8,};
    int resp = 14;
    System.out.printf("soma das variaveis a e b = %d \n", (Val.a + Val.b));
    if(ListNum[1] + ListNum[6] == resp){
        System.out.print("resposta correta " + (ListNum[6] - ListNum[1]));
    }
    else{
        System.out.print("resposta incorreta");
    }
    }
    
}
