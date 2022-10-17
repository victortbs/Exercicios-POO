import java.util.Scanner;
public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    String profissao;
    int anoNascimento;
    Scanner leia = new  Scanner(System.in);

    public Paciente(){

    }
    public Paciente(String n){
        nome = n;
    }
    
    public void cadastroDados(){
        
        System.out.print("Digite o nome: ");
        nome = leia.next();
        System.out.print("Digite seu rg: ");
        rg = leia.next();
        System.out.print("Digite o telefone: ");
        telefone = leia.next();
        System.out.print("Digite o Ano do Nascimento: ");
        anoNascimento = leia.nextInt();
        System.out.print("Digite a Profissão: ");
        profissao = leia.next();
        System.out.print("Digite o Endereço: ");
        endereco = leia.next();
        System.out.println("** Registro cadastrado com sucesso!!!");
        leia.close();

    }
    public void imprimeDados(){
        System.out.println("\n*****************************");
        System.out.println("\t\t\t*** Bem vindo ao SisMed *** \n");
        System.out.println("O paciente é: "+nome);
        System.out.println("Ano nascimento: "+anoNascimento);
        System.out.println("Profissão: "+profissao);
        System.out.println("*****************************");

    }
    public int calculaIdade(int anoAtual){
        int calc = anoAtual - anoNascimento;
        return(calc);
    }
}
