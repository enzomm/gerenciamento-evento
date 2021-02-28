package Evento;

import java.util.ArrayList;

public final class EspacoCafe extends Lugar implements InterfaceEspacoCafe {
    
    private ArrayList<Pessoa> ecafe1Etapa = new ArrayList();
    private ArrayList<Pessoa> ecafe2Etapa = new ArrayList();
    
    public EspacoCafe(String nome) {
        super(nome);
    }    
    
    @Override
    public void interagir() {
        System.out.println("Observando...");
    }
    
    @Override
    public void interagir(String interagir) {
        switch (interagir) {
            case "Conversar":
                System.out.println("Conversando...");
                break;
            case "Comer":
                System.out.println("Comendo...");
                break;
            case "Beber":
                System.out.println("Bebendo...");
                break;
            default:
                System.out.println("Observando...");
                break;
        }
    }
    
    public void pessoaEspacoEtapa1(int ne) {
        if(ne == 0) {
            System.out.println(this.nome + " (Espaço 1) / Etapa 1: " + ecafe1Etapa.toString());  
        }    
        else {
            System.out.println(this.nome + " (Espaço 2) / Etapa 1: " + ecafe1Etapa.toString()); 
        }         
    }      
    
    public void pessoaEspacoEtapa2(int ne) {
        if(ne == 0) {
            System.out.println(this.nome + " (Espaço 1) / Etapa 2: " + ecafe2Etapa.toString());  
        }    
        else {
            System.out.println(this.nome + " (Espaço 2) / Etapa 2: " + ecafe2Etapa.toString()); 
        }         
    }  

    public ArrayList<Pessoa> getEcafe1Etapa() {
        return ecafe1Etapa;
    }

    public void setEcafe1Etapa(ArrayList<Pessoa> salaetp1) {
        this.ecafe1Etapa = salaetp1;
    }

    public ArrayList<Pessoa> getEcafe2Etapa() {
        return ecafe2Etapa;
    }

    public void setEcafe2Etapa(ArrayList<Pessoa> salaetp2) {
        this.ecafe2Etapa = salaetp2;
    }    
    
}