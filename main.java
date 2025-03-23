class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerSom() {
        System.out.println("O animal está fazendo um som.");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void fazerSom() {
        System.out.println("O cachorro " + nome + " está latindo!");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Cachorro - Nome: " + nome + ", Idade: " + idade + ", Raça: " + raca);
    }

    public void correr() {
        System.out.println("O cachorro " + nome + " está correndo!");
    }
}

class Gato extends Animal {
    private boolean gostaDeCaixas;

    public Gato(String nome, int idade, boolean gostaDeCaixas) {
        super(nome, idade);
        this.gostaDeCaixas = gostaDeCaixas;
    }

    @Override
    public void fazerSom() {
        System.out.println("O gato " + nome + " está miando!");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Gato - Nome: " + nome + ", Idade: " + idade + ", Gosta de Caixas: " + (gostaDeCaixas ? "Sim" : "Não"));
    }

    public void pular() {
        System.out.println("O gato " + nome + " está pulando!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro("Rex", 3, "Labrador");
        Animal meuGato = new Gato("Miau", 2, true);

        meuCachorro.exibirInfo();
        meuCachorro.fazerSom();
        ((Cachorro) meuCachorro).correr(); 

        meuGato.exibirInfo();
        meuGato.fazerSom();
        ((Gato) meuGato).pular();
    }
}
