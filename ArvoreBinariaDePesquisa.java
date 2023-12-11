class ArvoreBinariaDePesquisa {
    public boolean isRoot(No no) {
        return no.getNoPai() == null;
    }

    public boolean isExternal(No no) {
        return (no.getFilhoEsquerdo == null) && (no.getFilhoDireito == null);
    }
}