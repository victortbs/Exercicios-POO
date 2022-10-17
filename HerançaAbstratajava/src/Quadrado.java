public class Quadrado extends Forma{
    //atributo
    private float base;

    public Quadrado(float base) {
        this.base = base;
    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    
    @Override
    public float area(){
        return base*base;
    }
    @Override
    public void mostra(){
        //TODO Auto-generated method stub
        System.out.println("\n\n***************************");
        System.out.println("A area do Quadrado é: "+area());
        System.out.println("A base do Quadrado é: "+base);
        System.out.println("O perimetro é: "+perimetro());
        System.out.println("\n\n***************************");
    }

    public float perimetro(){
        return base+base+base+base;
    }
    
    





}