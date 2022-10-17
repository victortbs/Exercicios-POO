public class Fornecedor extends Pessoa{
    private Float valorCompra;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String fone, Float v) {
        super(nome, fone);
        valorCompra = v;
    }

    public Float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Float valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public void print(){
        System.out.println("***************************");
        System.out.println("Nome: "+getNome()+"\n"+"Telefone: "+getFone()+"\n"+"Valor da Compra: "+valorCompra);
        System.out.println("**********************************");
    }


    
    

    
}
