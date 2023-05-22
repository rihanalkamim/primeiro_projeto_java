import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Rihan Alkamim";
        String conta = "Poupança";
        double saldo = 5.800;
        String parar = "";
        Scanner input = new Scanner(System.in);

        while (parar != "N"){
            System.out.println("1- Consultar Saldo\n2- Receber Valor\n3- Transferir\n4- Sair");
            System.out.print("Digite a opção desejada: ");
            int opcao = input.nextInt();

            switch (opcao) { 
                case 1:
                    System.out.println("Saldo disponível: R$" + saldo);
                    break;

                case 2:
                    System.out.println("Qual valor será recebido?\nR$");
                    double valor_recebido = input.nextDouble();
                    System.out.println("Saldo atual: R$" + (saldo + valor_recebido));
                    break;

                case 3:
                    System.out.print("Valor a transferir: R$");
                    double valor_transferido = input.nextDouble();
                    if (valor_transferido > saldo){
                        System.out.println("Saldo indisponível");
                        System.out.println("Você só pode trasferir até R$"+saldo);
                    } else {
                        System.out.println("Saldo atual: R$"+(saldo - valor_transferido));
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    parar = "N";
                    break;

                default:
                    System.out.println("O número escolhido é inválido, digite um número entre 1 e 4");
                    System.out.println("Tente Novamente ...");
            }
        }
    }
}
