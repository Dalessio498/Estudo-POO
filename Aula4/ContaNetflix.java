public class ContaNetflix {
    private String idiomaPreferencial;
    private String resoulucaoTela;

    void entrar(){
    //pega as infos do usuario
        buscarPreferenciasDoUsuario();
        buscarResolucaoTela();
    }

    private void buscarPreferenciasDoUsuario(){
        idiomaPreferencial = "PT-BR";
    }

    private void buscarResolucaoTela(){
        resoulucaoTela = "Full HD";
    }

    void assistirTFilme(String filme){
        System.out.println("Iniciando o filme " + filme);
        System.out.println("Carregando o filme na resolução " + resoulucaoTela);

        carregarAudioFilme();
    }

    private void carregarAudioFilme(){
        if (idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US"){
            System.out.println("Carregando o audio em " + idiomaPreferencial);
        }
        else {
            System.out.println("Carregando o audio em EN-US");
        }
    }

}
