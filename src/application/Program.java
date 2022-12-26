package application;

import application.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Digite o numero da conta: ");
        int number = sc.nextInt();
        System.out.print("Nome do tilular: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Deseja fazer um depósito ? (s/n)? ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.print("Digite o valor do depósito inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, name, initialDeposit);
        } else {
            account = new Account(number, name);
        }
        System.out.println();
        System.out.println("Informacoes da conta: " );
        System.out.println(account);

        System.out.println();
        System.out.print("Insira um valor de depósito: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Dados da conta atualizados:");
        System.out.println(account);

        System.out.println();
        System.out.print("Insira um valor para sacar: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(account);

        sc.close();

    }
}
