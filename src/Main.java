public class Main {

    public static void main(String[] args) {

        //Passa os atributos de ip, mac e porta para os computadores c1 e c2
        PC1 c1 = new PC1("192.168.0.8", "1a:2b:3c:4d:5e:6f", "65535");
        PC2 c2 = new PC2("172.65.22.15", "5b:44:3f:2c:7d:22", "8548");

        Pilhatcp p = new Pilhatcp();
        
        //computador 1 usa o método de escrever o email passando a mensagem como parametro
        c1.escreveMsg("'Olá, como vai? Me liga, estou com saudades!'");

        //computador 1 usa o método de enviar a mensagem passando os dados do pc2 como parametro
        c1.enviaMsg(c1.getMensagem(), c2.getPorta(), c2.getIp(), c2.getMac());

        //computador 2 usa o método de abrir o email para ler a mensagem recebida, vinda como parametro
        if(p.pilhaVazia()) {
          c2.abreEmail(c1.getMensagem());
        }
    }
}