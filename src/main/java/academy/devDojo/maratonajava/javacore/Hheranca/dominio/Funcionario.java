package academy.devDojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
   
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estatico de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario 2");

    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public void  relatorioDePagamento(){
        System.out.println("Eu"+this.nome+"Recebi o salário de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
