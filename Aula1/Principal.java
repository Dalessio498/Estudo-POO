public class Principal{
    public static void main (String[] args) throws Exception {

        Martelo marteloA = new Martelo();

        marteloA.marca = "Makita";
        marteloA.cabo = "Emborrachado";
        marteloA.materialCabeca = "Titânio";
        marteloA.pontas = "Martelo - Machado";
        marteloA.peso = 5f;
        marteloA.preco = 500f;

        marteloA.mostrarMartelo();
    
        marteloA.baterMartelo();

    }
}

//Shift + alt + seta pra baixo duplicar a linha