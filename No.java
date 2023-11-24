public class No<TipoGenerico> {
    private TipoGenerico elemento;
    private No<TipoGenerico> noPai;
    private No<TipoGenerico> filhoEsquerdo;
    private No<TipoGenerico> filhoDireito;

    public No(TipoGenerico elemento) {
        this.elemento = elemento;
    }

    public boolean ehNoRaiz() {
        return this.noPai == null;
    }
}