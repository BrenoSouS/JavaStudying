package JavaCOLLECTIONS.map;

import Set.override;

public class Evento {
    
    private String nome;
    private String atracao;

    public Evento(String nome , String atracao){
        this.nome = nome;
        this.atracao = atracao;

    }   
    public String getNome(){
        return nome;

    }
    public String getAtracao(){
        return atracao;

    }

    @override
    public String toString(){
        return "-Evento " + nome + " Terá como atração: " + atracao + "\n";

        
    }
}
