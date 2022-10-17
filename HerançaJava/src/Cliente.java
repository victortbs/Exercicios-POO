public class Cliente extends Pessoa{
    private Float valorDivida;

    public Cliente() {
    }

    public Cliente(String n, String f, float v){
        super (n,f);
        valorDivida = v;
    }
    public Float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(Float valorDivida) {
        this.valorDivida = valorDivida;
    }
   
    public void print(){
        System.out.println("******************************");
        System.out.println("Nome: "+getNome()+"\n"+"Telefone: "+getFone()+"\n"+"Valor da Dividida: "+valorDivida);
        System.out.println("**********************************");
    }

    
    
    
    
}

