class ArvoreBinariaDePesquisa {
    public boolean isRoot(No no) {
        return no.getNoPai() == null;
    }

    public boolean isExternal(No no) {
        return (no.getFilhoEsquerdo() == null) && (no.getFilhoDireito() == null);
    }

    public No parent(No no) {
        return no.getNoPai(); 
    }

    public ArvoreBinariaDePesquisa() {}

    public static void main(String[] args) {
        No<String> primeiroNo = new No<>();
        ArvoreBinariaDePesquisa arvore = new ArvoreBinariaDePesquisa();
        System.out.println("Primeiro nó criado é root? " + arvore.isRoot(primeiroNo));
        No<String> segundoNo = new No<>();
        System.out.println("Segundo nó criado tem o primeiro como pai. É root? " + arvore.isRoot(segundoNo));
        System.out.println("Segundo nó criado realmente tem o primeiro como pai? " + (segundoNo.getNoPai().equals(primeiroNo))); // ❌ dando false e era pra dar true
    }
}