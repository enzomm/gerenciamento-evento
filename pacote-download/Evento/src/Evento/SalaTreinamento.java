package Evento;

import java.util.ArrayList;

public final class SalaTreinamento extends Lugar implements InterfaceSalaTreinamento {
    
    private int lotacao;
    private int totPessoa; 
    private ArrayList<Pessoa> sala1Etapa = new ArrayList();
    private ArrayList<Pessoa> sala2Etapa = new ArrayList();
    

    public SalaTreinamento(int lotacao, String nome) {
        super(nome);
        this.lotacao = lotacao;
        this.totPessoa = 0;
    } 
    
    @Override
    public void interagir() {
        System.out.println("Treinando...");
    }
    
    public int getLotacao() {
        return lotacao;
    }    

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }   

    public int getTotPessoa() {
        return totPessoa;
    }

    public void setTotPessoa(int totPessoa) {
        this.totPessoa = totPessoa;
    } 

    public ArrayList<Pessoa> getSala1Etapa() {
        return sala1Etapa;
    }

    public void setSala1Etapa(Pessoa p) {
        this.sala1Etapa.add(p);
        this.totPessoa++;        
    }  

    public ArrayList<Pessoa> getSala2Etapa() {
        return sala2Etapa;
    }

    public void setSala2Etapa(Pessoa p) {
        this.sala2Etapa.add(p);
    }
    
    @Override
    public void pessoaSalaEtapa1(int ns) {
        if(ns == 0) {
            System.out.println(this.nome + " (Sala 1) / Etapa 1: " + sala1Etapa.toString());  
        }    
        else {
            System.out.println(this.nome + " (Sala 2) / Etapa 1: " + sala1Etapa.toString()); 
        }         
    }  
    
    @Override
    public void pessoaSalaEtapa2(int ns) {
        if(ns == 0) {
            System.out.println(this.nome + " (Sala 1) / Etapa 2: " + sala2Etapa.toString());  
        }    
        else {
            System.out.println(this.nome + " (Sala 2) / Etapa 2: " + sala2Etapa.toString()); 
        }         
    }  
    
}