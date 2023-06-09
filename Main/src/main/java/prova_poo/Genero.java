package prova_poo;

public enum Genero {
       MASCULINO("Masculino", 'M'),
       FEMININO("Feminino", 'F');
       
       protected String texto;
       protected char sigla;

    private Genero(String texto, char sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public char getSigla() {
        return sigla;
    }
       
       
}
