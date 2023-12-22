import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner leitorU = new Scanner(System.in);
        Scanner leitorP = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();
        int escolha = 1;
        System.out.println("Por favor digite seu nome.");
        String nome = leitorU.nextLine();
        System.out.println("Por favor digite o limite do seu cartão para realizar as suas compras.");
        double limite = leitorU.nextDouble();
        Usuario usuario = new Usuario(nome,limite);
        System.out.println("Vamos às compras!");
        System.out.println("Digite 0 para parar de comprar ou 1 para continuar");
        escolha = leitorU.nextInt();
        while(true){
            if (escolha == 1){
                System.out.println("Digite o nome do produto a ser comprado");
                String nomeProduto = leitorP.nextLine();
                System.out.println("Qual o valor do produto "+nomeProduto+"?");
                double valorProduto = leitorP.nextDouble();
                leitorP.nextLine();
                double retorno = usuario.calculoSaldo(valorProduto);
                escolha = -1;
                if (retorno == 1){
                    lista.add(new Produto(nomeProduto, valorProduto));
                    System.out.println("Compa realizada com sucesso!");
                    System.out.println("Novo valor do limite restante: "
                            + usuario.getLimiteDisponivel()+ " de "+ usuario.getNome());
                }else{
                    System.out.println("Não foi possível realizar a compra, saldo insuficiente!");
                }



            } else if(escolha == 0){
                break;
            }else{
                while(true){
                    System.out.println("Por favor digite 0 para parar ou 1 para continuar comprando");
                    escolha = leitorU.nextInt();
                    if(escolha == 0 || escolha == 1){
                        break;
                    }
                }
            }

        }
        Collections.sort(lista);
        System.out.println("Produtos comprados:");
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println("Limite disponível no cartão ao fim das compras: "+usuario.getLimiteDisponivel());
    }
}