public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Minha Empresa", "Rua A", "Cidade B", "Estado C", "12345", "123-456-7890");
        Restaurante restaurante = new Restaurante("Restaurante X", "Rua X", "Cidade Y", "Estado Z", "54321", "987-654-3210", "Comida italiana");
        OutraClasse outraClasse = new OutraClasse("Outra Empresa", "Rua Y", "Cidade Z", "Estado X", "67890", "999-888-7777");

        empresa.print();
        System.out.println();
        restaurante.print();
        System.out.println();
        outraClasse.print();
    }
}

class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;

    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + telefone);
    }
}

class Restaurante extends Empresa {
    private String especialidade;

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone, String especialidade) {
        super(nome, endereco, cidade, estado, cep, telefone);
        this.especialidade = especialidade;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Especialidade: " + especialidade);
    }
}

class OutraClasse extends Empresa {
    public OutraClasse(String nome, String endereco, String cidade, String estado, String cep, String telefone) {
        super(nome, endereco, cidade, estado, cep, telefone);
    }

    @Override
    public void print() {
        super.print();
    }
}