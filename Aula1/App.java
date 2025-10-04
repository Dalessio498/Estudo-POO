public class App {
    public static void main(String[] args) throws Exception{

        //Quais celulares serão criados?
 
        // Iphone 12, IOS, tela de 6.1", 256
        // Galaxy Note 20, Android, 6,9", 256
        // Xiaomi Mi 11 Pro, Android, 6.81" 126

        //<tipo> nome = valor
        
        //Declarando um objeto de classe Celular  = insatanciando um objeto
        Celular celularA = new Celular();

        celularA.nome = "Iphone 12";
        celularA.SOP = "IOS";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;

        System.out.printf("| Celular: %s | Sistema operacional: %s | Tela: %.1f | Armazenamento %dGb | \n", celularA.nome, celularA.SOP, celularA.tamanhoTela, celularA.espacoArmazenamento);

         celularA.ligarCelular();

         celularA.exibirBateria();

//-------------------------------------------------------------------------

        Celular celularB = new Celular();

        celularB.nome = "Galaxy Note 20";
        celularB.SOP = "Android";
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;

         System.out.printf("| Celular: %s | Sistema operacional: %s | Tela: %.1f | Armazenamento %dGb |\n", celularB.nome, celularB.SOP, celularB.tamanhoTela, celularB.espacoArmazenamento);
  
         celularB.ligarCelular();

         celularB.exibirBateria();

//-------------------------------------------------------------------------

        Celular celularC = new Celular();

        celularC.nome = "Xiaomi Mi 11 Pro";
        celularC.SOP = "Android";
        celularC.tamanhoTela = 6.81f;
        celularC.espacoArmazenamento = 128;

         celularC.exibirInfo();

         celularC.exibirBateria();
    }

}