import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        // instancia de um objeto do tipo de pessoa
        // esse objeto é independente dos demais

        Cliente cliente = new Cliente();
        Fornecedor fornecedor = new Fornecedor();
        Scanner leia = new Scanner(System.in);
        // agora vamos fazer o objeto pessoa
        
        System.out.println("\t\t\t **Bem vindo ao Programa** \n\n");
        System.out.println("Vamos Cadastrar uma pessoa!!");
        System.out.print("Digite um nome: ");
        pessoa.setNome(leia.next());
        System.out.print("Digite o Telefone: ");
        pessoa.setFone(leia.next());
        pessoa.print();
        

        System.out.println("*****************************");
        System.out.println("Agora vamos cadastrar o cliente");
        System.out.print("Digite seu Nome: ");
        cliente.setNome(leia.next());
        System.out.print("Digite seu Telefone: ");
        cliente.setFone(leia.next());
        System.out.print("Digite o valor da divida: ");
        cliente.setValorDivida(leia.nextFloat());
        cliente.print();


        System.out.println("******************************");

        System.out.println("*****************************");
        System.out.println("Agora vamos cadastrar o fornecedor");
        System.out.print("Digite seu Nome: ");
        fornecedor.setNome(leia.next());
        System.out.print("Digite seu Telefone: ");
        fornecedor.setFone(leia.next());
        System.out.print("Digite o valor da compra: ");
        fornecedor.setValorCompra(leia.nextFloat());
        fornecedor.print();

        System.out.println("******************************");
    }
}
