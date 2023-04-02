public class Protocolotcp {
    
    //o objeto da classe Pilhatpc deve ser declarado como atributo para ser usado
    private Pilhatcp empilhar = new Pilhatcp();

    //atributos que armazenam os dados de mac, ip e porta dos computadores
    public String smtp;
    public String tcp_o;
    public String tcp_d;
    public String ip_o;
    public String ip_d;
    public String mac_o;
    public String mac_d;

    //vetores criados para guardar os dados do computadores, para então empilhar em camadas
    String[] aplicacao = new String[1];
    String[] transporte = new String[2];
    String[] internet = new String[2];
    String[] ethernet = new String[2];

    //metodo construtor que define um objeto da classe Pilhatcp para chamar o metodo de empilhar
    public Protocolotcp() {
        this.empilhar = new Pilhatcp();
    }

    //metodo que encapsula a mensagem do email na camada de aplicação representada pelo vetor
    public void encapsulaApp(String pacote_msg) {

        aplicacao[0] = pacote_msg;

        empilhar.empillhaPacotes("CAMADA DE INTERFACE DE APLICAÇÃO" + 
                                  "\nDADOS DA MENSAGEM:" + aplicacao[0]);
    }

    //metodo que encapsula os dados das portas de origem e destino na camada de transporte
    public void encapsulaTransporte(String pacote_tcp_o, String pacote_tcp_d) {
        transporte[0] = pacote_tcp_o;
        transporte[1] = pacote_tcp_d;

        empilhar.empillhaPacotes("CAMADA DE TRANSPORTE" + "\nPORTA ORIGEM: " 
                                  +transporte[0] + "\nPORTA DESTINO: " + transporte[1]);

    }

    /*metodo que encapsula os dados de IP dos computadores origem 
    e destino na camada de internet*/
    public void encapsulaInternet(String pacote_ip_o, String pacote_ip_d) {
        internet[0] = pacote_ip_o;
        internet[1] = pacote_ip_d;

        empilhar.empillhaPacotes("CAMADA DE INTERNET" + "\nIP ORIGEM: " 
                                  +internet[0] + "\nIP DESTINO: " + internet[1]);
    }

    /*metodo que encapsula os dados de MAC dos computadores origem e destino 
    na camada de ethernet ou interface de rede */
    public void encapsulaEthernet(String pacote_mac_o, String pacote_mac_d) {
        ethernet[0] = pacote_mac_o;
        ethernet[1] = pacote_mac_d;

        empilhar.empillhaPacotes("CAMADA DE INTERFACE DE REDE" + "\nMAC ORIGEM: " 
                                  +ethernet[0] + "\nMAC DESTINO: " + ethernet[1]);

        empilhar.empillhaPacotes(mac_o + "/" + mac_d);
    }

}





