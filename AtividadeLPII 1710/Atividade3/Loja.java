public class Loja {
    public static void main(String[] args) {
        Livro livro = new Livro("Livro A", 29.99, "Autor A");
        CD cd = new CD("CD B", 14.99, 12);
        DVD dvd = new DVD("DVD C", 19.99, 120);

        System.out.println("Produtos na loja:");
        System.out.println(livro.nome + " - Autor: " + livro.autor + " - Preço: " + livro.preco);
        System.out.println(cd.nome + " - Faixas: " + cd.numeroFaixas + " - Preço: " + cd.preco);
        System.out.println(dvd.nome + " - Duração: " + dvd.duracao + " minutos - Preço: " + dvd.preco);
    }
}

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

class Livro extends Produto {
    String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }
}

class CD extends Produto {
    int numeroFaixas;

    public CD(String nome, double preco, int numeroFaixas) {
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }
}

class DVD extends Produto {
    int duracao;

    public DVD(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }
}
