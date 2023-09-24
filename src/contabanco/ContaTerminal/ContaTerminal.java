/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco.ContaTerminal;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author spike80
 */
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da conta: \n");
        int conta = sc.nextInt();
        
        System.out.println("Digite o número da agência: \n");
        int agencia = sc.nextInt();
        
        String nome = "Fabrício Januário Ferreira";
        
        double saldo = 20000;
        
        System.out.println("Olá! ".concat(nome).concat(". Obrigado por criar uma "
                + "conta no nosso banco! Sua agência é ").concat(String.valueOf(agencia)).concat(" e "
                        + "seu saldo disponível é de: ").concat(String.valueOf(saldo)));
    }
    
}
