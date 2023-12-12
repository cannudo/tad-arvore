class ArvoreBinariaDePesquisa {
    // atributo referência para o nó raiz

    public boolean isRoot(No no) {
        return no.getNoPai() == null;
    }

    public boolean isExternal(No no) {
        return (no.getFilhoEsquerdo() == null) && (no.getFilhoDireito() == null);
    }

    public boolean isInternal(No no) {
        return (no.getFilhoEsquerdo() != null) || (no.getFilhoDireito() != null);
    }

    public No parent(No no) {
        return no.getNoPai(); 
    }

    public void buscaInOrder(No noAtual) {
        if(this.isInternal(noAtual)) {
            buscaInOrder(noAtual.getFilhoEsquerdo());
        }
        // visite(noAtual): visita e faz algo de acordo com a sua necessidade
        if(this.isExternal(noAtual)) {
            buscaInOrder(noAtual.getFilhoDireito());
        }
    }

    public ArvoreBinariaDePesquisa() {}

    public static void main(String[] args) {
        No<String> primeiroNo = new No<>();
        ArvoreBinariaDePesquisa arvore = new ArvoreBinariaDePesquisa();
        System.out.println("Primeiro nó criado é root? " + arvore.isRoot(primeiroNo));
        System.out.println("Primeiro nó criado é interno? " + arvore.isInternal(primeiroNo));
        System.out.println("Primeiro nó criado é externo? " + arvore.isExternal(primeiroNo));
        No<String> segundoNo = new No<>();
        segundoNo.setNoPai(primeiroNo);
        System.out.println("Segundo nó criado tem o primeiro como pai. É root? " + arvore.isRoot(segundoNo));
        
        System.out.println();
        System.out.println();
        primeiroNo.status();
        System.out.println();
        System.out.println();

        System.out.println("Primeiro nó criado é interno? " + arvore.isInternal(primeiroNo)); // ✅ dando true NA BASE DA GAMBIARRA
        System.out.println("Primeiro nó criado é externo? " + arvore.isExternal(primeiroNo));
        System.out.println("Segundo nó criado realmente tem o primeiro como pai? " + (segundoNo.getNoPai() == primeiroNo));
        System.out.println("Segundo nó criado é interno? " + arvore.isInternal(segundoNo));
        System.out.println("Segundo nó criado é externo? " + arvore.isExternal(segundoNo));
    }
}