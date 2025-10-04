import java.util.Random;

public class Celular {

    //Caracteristicas -> Atributos

    String nome;
    String SOP;
    int espacoArmazenamento;
    float tamanhoTela;

    void exibirInfo(){

      System.out.printf("| Celular: %s | Sistema operacional: %s | Tela: %.1f | Armazenamento %dGb |\n", nome, SOP, tamanhoTela, espacoArmazenamento);
    }

    void ligarCelular(){

        System.out.printf("Inicializando o %s \n", SOP);
    }

    int bateriaPorcentagem(){
        Random bateria = new Random();
        int porcentagem = 1 + bateria.nextInt(99);
        int bateriaCelular = porcentagem;
        return bateriaCelular;

        
    }
    
    void exibirBateria(){
      
        System.out.format("A porcentagem da bateria do celular é %d%% \n \n", bateriaPorcentagem());
    }

}
