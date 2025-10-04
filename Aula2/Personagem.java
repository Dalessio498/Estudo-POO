import java.util.Random;    //ctrl + . para importar

public class Personagem {

    String nome;
    int nivel;
    int forca;
   

    // void é um metodo que signfica q n retorna nada

    void mostrarStatus(){

        System.out.format("Personagem: %s (lvl %d) com %d de força. \n", nome, nivel, forca);

    }

    int calcularDano(){
        Random dado = new Random();
        // se gerar 0 sera 0 + 1
        int dado20faces = 1 + dado.nextInt(19);
        int dano = forca + dado20faces;
        return dano;

    }

    //metodo que não retorna nada e recebe um parametro alvo que é do tipo string
    void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();
        

        if (habilidade.length() == 0)
        System.out.format("%s Atacou %s e causou %d de dano. \n", nome, alvo, danoCausado);

        else{

        System.out.format("%s Usou '%s'contra %s e causou %d de dano.\n",
                                nome,   habilidade,   alvo,     forca);

        }
    }
    
}