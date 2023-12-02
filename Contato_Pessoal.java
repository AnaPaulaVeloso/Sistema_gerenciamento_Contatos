class ContatoPessoal extends Contato {
    private String aniversario;

    public ContatoPessoal(String nome, String telefone, String aniversario) {
        super(nome, telefone);
        this.aniversario = aniversario;
    }

    @Override
    void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Aniversário: " + aniversario);
    }
}

