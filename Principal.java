import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new ContatoPessoal("João", "123456789", "01/01/1990"));
        contatos.add(new ContatoProfissional("Maria", "987654321", "Empresa XYZ"));
        contatos.add(new ContatoPessoal("Carlos", "555555555", "15/07/1985"));

        // Iterando sobre a lista e exibindo detalhes dos contatos
        for (Contato contato : contatos) {
            contato.exibirDetalhes();
            System.out.println("-----------");
        }
    }
}