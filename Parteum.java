// Classe Semestre
public class Semestre {
    private String nome;
    private boolean ativo;

    // Construtor
    public Semestre(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para ativo
    public boolean isAtivo() {
        return ativo;
    }

    // Setter para ativo
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

// Classe Turma
public class Turma {
    private String nome;
    private Semestre semestre;

    // Construtor
    public Turma(String nome, Semestre semestre) {
        this.nome = nome;
        this.semestre = semestre;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para semestre
    public Semestre getSemestre() {
        return semestre;
    }

    // Setter para semestre
    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }
}

// Classe Main para testar as outras classes
public class Main {
    public static void main(String[] args) {
        // Criando um semestre
        Semestre semestre = new Semestre("2024/1", true);
        
        // Criando uma turma associada ao semestre
        Turma turma = new Turma("Turma A", semestre);

        // Exibindo informações
        System.out.println("Nome da Turma: " + turma.getNome());
        System.out.println("Nome do Semestre: " + turma.getSemestre().getNome());
        System.out.println("Semestre Ativo: " + turma.getSemestre().isAtivo());
    }
}
