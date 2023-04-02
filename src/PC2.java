public class PC2 {
    //atributos do computador c2
    public String ip;
    public String mac;
    public String porta;

    /*metodo construtor da classe PC2 que cria o computador 
    c2 com os dados de ip, mac e porta */
    public PC2(String ip, String mac, String porta) {
        
        this.ip = ip;
        this.porta = porta;
        this.mac = mac;

    }

    //computador destino evoka o método de abrir o e-mail a fim de ler a mensagem
    public void abreEmail(String msg) {
        System.out.println("\nEXIBINDO MENSAGEM DO E-MAIL: ");
        System.out.println("\n" + msg + "\n");
    }

    //getters and setters
    public String getPorta() {
        return this.porta;
    }

    public String getIp() {
        return this.ip;
    }

    public String getMac() {
        return this.mac;
    }

}
