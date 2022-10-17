import java.util.Scanner ;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int escolha;
        char resp ='N';
        while(resp == 'N'){

        System.out.println("\t\t\t ** Forma Geometrica ** ");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Triangulo");
        System.out.println("3 - Sair");
        System.out.println("Escolha a opção desejada: ");
        escolha = leia.nextInt();

        switch(escolha){
        case 1:
            float lado;
            System.out.println("\t\t\t ** Quadrado ** ");
            System.out.println("Digite o lado: ");
            lado = leia.nextFloat();
            Quadrado quadrado = new Quadrado(lado);
            quadrado.mostra();
            break;
        case 2:
            System.out.println("\t\t\t ** Triangulo ** ");
            Triangulo triangulo = new Triangulo(0,0);
            System.out.print("Digite a base: ");
            triangulo.setAltura(leia.nextFloat());
            System.out.print("Digite a altura: ");
            triangulo.setAltura(leia.nextFloat());
            triangulo.mostra();
            break;
        case 3:
        do{
            System.out.println("Deseja realmente sair do programa? (S/N)");
            resp = leia.next().toUpperCase().charAt(0);
        }while(resp != 'N' && resp != 'S');
            break;
        default:
            System.out.println("Opção invalida!!!");
            break;
        }

        }
        System.out.println("The end!");
    }
}
