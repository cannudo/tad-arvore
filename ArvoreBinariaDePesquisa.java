class ArvoreBinariaDePesquisa {
    public boolean isRoot(No no) {
        return no.getNoPai() == null;
    }
}