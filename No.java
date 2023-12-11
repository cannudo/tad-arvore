public class No<TipoGenerico> {
    private TipoGenerico elemento;
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
    }

    public No<TipoGenerico> getFilhoEsquerdo() {
        return this.filhoEsquerdo;
    }

    public No getFilhoDireito() {
        return this.filhoDireito;
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