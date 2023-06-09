package prova_poo;

public enum Setor {
    
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    OPERACOES("Operacoes");
    
    protected String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
