package prova_poo;

import java.time.LocalDate;
import java.time.Period;

public abstract class Fisica extends Pessoa{
    protected LocalDate dataNascimento;
    protected Genero genero;

    public Fisica(LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n Data Nascimento: " + dataNascimento + 
                "\n Gênero: " + genero +
                "\n Idade: " + getIdade();
    }
    
    //Get Idade
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
}
