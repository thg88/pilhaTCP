import java.util.Arrays;

public class Pilhatcp {

    // atributos da classe Pilha
    public Object[] pilha;
    public int posicaoPilha;


    // sobrescreve o método toString() para exibir a pilha como uma String
    //@Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(pilha, 0, pilha.length));
    }

    // método construtor da classe Pilha, cria uma pilha com 4 posições
    public Pilhatcp() {
        // indica que esta vazia, pois posição 1 indica que contém informação
        this.posicaoPilha = -1;
        // criando uma pilha com 4 posições	
        this.pilha = new Object[4];
    
    }

    // verifica se a pilha está vazia
    public boolean pilhaVazia() {
    
        if (this.posicaoPilha == -1) {
            System.out.println("\nPILHA VAZIA. NÃO HÁ NADA PARA DESEMPILHAR!");
            return true;
        }
        return false;
    }

    //código para voltar a exibir a pilha na ordem crescente
    /*public void statusPilha() {
        System.out.println("\nStatus da pilha: ");
    
        for (int i = 0; i < 4; i++) {
            System.out.println("[" + pilha[i] + "]");
        }
    }*/

    public void statusPilha() {
        System.out.println("\nStatus da pilha: \n");
        for (int i = this.posicaoPilha; i >= 0; i--) {
            System.out.println("[" + pilha[i] + "]\n");
        }
    }

    // verifica se a pilha está cheia
    public boolean pilhaCheia() {

        if (this.posicaoPilha == this.pilha.length -1) {
            System.out.println("\nPILHA CHEIA. ENVIANDO PACOTES À MAQUINA DESTINO!");
            return true;
        }
        return false;
    }

    // retorna o valor do topo da pilha sem desempilhar
    public Object exibeUltimoValor() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.pilha[posicaoPilha];
        
    }
    //desempilha os pacotes um de cada vez, seguindo a lógica LIFO das pilhas
    public void desempilhaPacotes() {

        if (this.pilhaVazia()) {
        } else {
            this.pilha[this.posicaoPilha--] = null;
        }
    }
    //empilhas os pacotes um a um, começando pela camada de aplicação
    public void empillhaPacotes(String protocolo) {
        
        if (!this.pilhaCheia()){
            this.pilha[++posicaoPilha] = protocolo;
            this.statusPilha();
        }
        else {
            System.out.println("\nPACOTE RECEBIDO NA MAQUINA 2! DESEMPILHANDO AS CAMADAS...");
            this.statusPilha();
            System.out.println("\nDESEMPILHANDO CAMADA DE ETHERNET: " + pilha[posicaoPilha]);
            this.desempilhaPacotes();
            this.statusPilha();
            System.out.println("\nDESEMPILHANDO CAMADA DE INTERNET: " + pilha[posicaoPilha]);
            this.desempilhaPacotes();
            this.statusPilha();
            System.out.println("\nDESEMPILHANDO CAMADA DE TRANSPORTE: " + pilha[posicaoPilha]);
            this.desempilhaPacotes();
            this.statusPilha();
            System.out.println("\nDESEMPILHANDO CAMADA DE APLICAÇÃO: " + pilha[posicaoPilha]);
            this.desempilhaPacotes();
            this.statusPilha();
            this.desempilhaPacotes();
        }
    }

}