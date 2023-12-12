public class No<TipoGenerico> {
    // MÉTODO busca
    private TipoGenerico elemento; // chave
    private No<TipoGenerico> noPai;
    private No<TipoGenerico> filhoEsquerdo;
    private No<TipoGenerico> filhoDireito;

    public No() {
        this.elemento = null;
        this.noPai = null;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }

    public No<TipoGenerico> getNoPai() {
        return this.noPai;
    }

    public void setNoPai(No<TipoGenerico> no) {
        this.noPai = no;
        this.noPai.setGambiarraAlgumFilho(this);
    }

    public No<TipoGenerico> getFilhoEsquerdo() {
        return this.filhoEsquerdo;
    }

    public No getFilhoDireito() {
        return this.filhoDireito;
    }

    public void setFilhoEsquerdo(No<TipoGenerico> no) {
        this.filhoEsquerdo = no;
    }

    public void setFilhoDireito(No<TipoGenerico> no) {
        this.filhoDireito = no;
    }

    public void setGambiarraAlgumFilho(No<TipoGenerico> no) {
        // 🚨🚨🚨 gambiarra! Volte depois e arrume essa merda! 🚨🚨🚨
        if(this.filhoEsquerdo == null) {
            this.filhoEsquerdo = no;
        } else {
            this.filhoDireito = no;
        }
        // comparar as CHAVES (elementos) do nó pai e do novo nó (nó filho)
        // caso a chave do novo no < que a chave do nó pai, coloque na esquerda
        // caso seja >, direita
        // ELSE NoJaInseridoException
    }

    public void status() {
        System.out.println("[status do objeto " + this + "]");
        System.out.println("Elemento: " + this.elemento);
        System.out.println("Nó pai: " + this.noPai);
        System.out.println("Filho esquerdo: " + this.filhoEsquerdo);
        System.out.println("Filho direito: " + this.filhoDireito);
        System.out.println("[fim do status do objeto " + this + "]");
    }

    public static void main(String[] args) {
        No<String> testeDeConstrucao = new No<>();
        testeDeConstrucao.status();
    }
}