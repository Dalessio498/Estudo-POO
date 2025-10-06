import classes.Pessoa;
import classes.Conta;

public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Maria");
        System.out.println(pessoa.getNome());

        pessoa.setIdade(20);
        System.out.println(pessoa.getIdade());

        pessoa.setAltura(1.75);
        System.out.println(pessoa.getAltura());

       
        Conta conta = new Conta();

        conta.depositar(-8);
        System.out.println(conta.getSaldo());
  
    }
}  