package edu.Breno.PrimeiraSemana;
public class BoletimEstudantil{
    public static void main(String[] args){
        int mediaFinal = 7;

        if(mediaFinal < 6){
            System.out.print("Reprovado");
        }else if(mediaFinal ==6){
            System.out.print("Prova minerva");
        }else{
            System.out.print("Aprovado");
        }
    }
}