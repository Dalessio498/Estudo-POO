public class Martelo {

    // Declara atributos

    String marca;
    String cabo;
    String materialCabeca;
    String pontas;
    float peso;
    float preco;

    void mostrarMartelo(){
        System.out.printf("Martelo \n Marca: %s \n Cabo: %s \n Material da cabeça: %s \n Pontas %s \n Peso do martelo: %.2fkg \n Preço: R$ %.2f \n \n", marca, cabo, materialCabeca, pontas, peso, preco);
    }

    void baterMartelo(){
        System.out.println("Peiiiinn...");
    }

}