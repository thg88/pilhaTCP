public class PC1 {

    public String ip1;
    public String mac1;
    public String porta1;
    private String mensagem;

    /*metodo construtor da classe PC1 que cria o computador 
    c1 com os dados de ip, mac e porta */
    public PC1(String ip, String mac, String porta) {

        this.ip1 = ip;
        this.porta1 = porta;
        this.mac1 = mac;

    }
    //armazena a string passada por parametro no atributo mensagem
    public void escreveMsg(String msg) {
        this.mensagem = msg;
    }

    //metodo que faz o envio da mensagem passando os dados do pc destino por parametro
    public void enviaMsg(String msg, String porta, String ip, String mac) {

        System.out.println("\nEnviando email para maquina destino...\n");
        Protocolotcp pr = new Protocolotcp(); //instancia o objeto pr da classe protocolotpc
                                              //para ser possivel chamar seus metodos
        pr.encapsulaApp(msg);
        pr.encapsulaTransporte(porta1, porta);
        pr.encapsulaInternet(ip1, ip);
        pr.encapsulaEthernet(mac1, mac);
        
    }
    //metodo usado pera retornar a mensagem inserida no atributo anteriormente
    public String getMensagem() {
        return this.mensagem;
    }
    
}
