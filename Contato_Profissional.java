class ContatoProfissional extends Contato {
    private String empresa;

    public ContatoProfissional(String nome, String telefone, String empresa) {
        super(nome, telefone);
        this.empresa = empresa;
    }

    @Override
    void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Empresa: " + empresa);
    }
}

