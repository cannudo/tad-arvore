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

    public void status() {
        System.out.println("Elemento: " + this.elemento);
        System.out.println("Nó pai: " + this.noPai);
        System.out.println("Filho esquerdo: " + this.filhoEsquerdo);
        System.out.println("Filho direito: " + this.filhoDireito);
    }

    public static void main(String[] args) {
        No<String> testeDeConstrucao = new No<>();
        testeDeConstrucao.status();
    }
}