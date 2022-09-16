import java.util.Scanner;

public class ContaTeste {
    public static Conta cc = new Conta();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int operacao;
        do{
            montarMenu();
            operacao = sc.nextInt();
            sc.nextLine();
            switch (operacao) {
                case 1 -> {
                    execCadastrar();
                }
                case 2 -> {
                    execConsultar();
                }
                case 3 -> {
                    execDepositar();
                }
                case 4 -> {
                    execSacar();
                }
            }
        }while(operacao != 0);
    }

    private static void execCadastrar() {
        String a, b, c;
        double d;
        System.out.println("Cadastrar os dados da conta!");
        System.out.println("Digite o nome: ");
        a = sc.nextLine();
        System.out.println("Digite o numero da conta: ");
        b = sc.nextLine();
        System.out.println("Digite a agencia da conta: ");
        c = sc.nextLine();
        System.out.println("Digite o saldo da conta: ");
        d = sc.nextDouble();
        cc.salvaCliente(a, b, c, d);
    }
    private static void execConsultar(){
        System.out.println("Consultar dados de uma conta!");
        cc.imprimir();
        System.out.println("------------------------------");
        System.out.println("Aperte enter para continuar...");
        sc.nextLine();
    }
    private static void execDepositar(){
        double valor;
        System.out.println("Depositar um valor na conta!");
        System.out.println("Digite o valor a ser depositado: ");
        valor = sc.nextFloat();
        cc.depositar(valor);
    }

    private static void execSacar(){
        double valor;
        System.out.println("Sacar um valor da sua conta :c");
        cc.imprimirSaldo();
        System.out.println("Digite o valor que deseja sacar: ");
        valor = sc.nextFloat();
        if(cc.sacar(valor) == 1){
            System.out.println("Voce sacou o valor de R$ " + valor);
            System.out.println("---------------------------------");
        }else{
            System.out.println("Voce nao tem saldo suficiente para sacar o valor R$ " + valor + ":c");
            System.out.println("---------------------------------");
        }
        sc.nextLine();
        System.out.println("Aperte enter para continuar....");
        sc.nextLine();
    }
    private static void montarMenu(){
        System.out.println("---------------------------------------");
        System.out.println("Escolha o que deseja fazer....");
        System.out.println("Digite 1 p/ Cadastrar uma conta");
        System.out.println("Digite 2 p/ Consultar dados da conta");
        System.out.println("Digite 3 p/ Depositar um valor");
        System.out.println("Digite 4 p/ Sacar um valor");
        System.out.println("Digite 0 p/ Sair ");
        System.out.println("---------------------------------------");
    }

}