package prova_poo;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("021512355", "254.587.289-15", "021.154.588.451", "F45A", Setor.OPERACOES, 1500, LocalDate.of(2004, Month.DECEMBER, 30), Genero.MASCULINO, "Fernando Alvarenga", "90987-5858", "fernandoalvarenga@gmail.com", new Endereco("travessa Sergimirim", "577", "portao aluminio", "40732-204", "São Paulo", UnidadeFederativa.RIO_DE_JANEIRO));
        
        Medico medico = new Medico("021512355", "325.154.956-15", "021.30948343", "S435A", Setor.SAUDE, 7000, LocalDate.of(2001, Month.JANUARY, 12), Genero.FEMININO, "Andreza Ribeiro", "719848483", "adrezaribeiro@gmail.com", new Endereco("Boca do Rio", "977", "case 3 andares", "40739293", "Salvador", UnidadeFederativa.BAHIA));
        
        Advogado advogado = new Advogado("159.753.8545-18", "021.154.588.221", "JDE232", Setor.JURIDICO, 4500, LocalDate.of(1999, Month.DECEMBER, 22), Genero.MASCULINO, "Julio Ferreira", "02193843400", "julioferreira@gmail.com", new Endereco("Alpha Ville", "455", "apartamento", "752955", "Lauro de freitas", UnidadeFederativa.BAHIA));
        
        Cliente cliente = new Cliente(45, LocalDate.of(1998, Month.DECEMBER, 21), Genero.FEMININO, "Amanda Ferraz dos Santos", "779847343", "amandaferraz@gmail.com", new Endereco("Villa Brasil", "752", "casa", "7552585", "Barreiras", UnidadeFederativa.BAHIA));
        
        Juridica juridica = new Juridica("545", "SP93893", "Julio Mariano", "774515-2023", "mariano@gmail.com", new Endereco("Apartamento", "788", "Residencial", "756852", "Vitória da Conquista", UnidadeFederativa.BAHIA));
        
        System.out.println("-- Motoboy --");        
        System.out.println(motoboy);
        System.out.println("");
        System.out.println("-- Médico --");        
        System.out.println(medico);
        System.out.println("");
        System.out.println("-- Advogado --");        
        System.out.println(advogado);
        System.out.println("");
        System.out.println("-- Cliente --");        
        System.out.println(cliente);
        System.out.println("");
        System.out.println("-- Juridica --");        
        System.out.println(juridica);
        System.out.println("");
    }
    
}
