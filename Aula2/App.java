public class App {

public static void main(String[] args) throws Exception {
        
        Personagem heroi = new Personagem();

        heroi.nome = "Hercules";
        heroi.forca = 5;
        heroi.nivel = 2;
    
        // "Personagem: <nome> (lvl <nivel>) com <forca> de força."

        heroi.mostrarStatus();  
        
        //Chamei um metodo atacar e passei como "argumento" uma string "Hydra"
        heroi.atacar("Hydra", "Raio congelante");

         heroi.atacar("Hydra", "");

        


    }

}

 
