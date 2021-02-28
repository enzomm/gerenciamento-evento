package Evento;

public class Pessoa implements InterfacePessoa {
    
    private String nome;
    private String sobrenome;
    private int salaTreinamentoETP1; 
    private int salaTreinamentoETP2; 
    private int espacoCafeETP1; 
    private int espacoCafeETP2; 

    public Pessoa(String nome, String sobrenome, int salaTreinamentoETP1) {
        this.nome = nome;
        this.sobrenome = sobrenome;   
        this.salaTreinamentoETP1 = salaTreinamentoETP1;
    }  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }  

    public int getSalaTreinamentoETP1() {
        return salaTreinamentoETP1;
    }

    public void setSalaTreinamentoETP1(int salaTreinamentoETP1) {
        this.salaTreinamentoETP1 = salaTreinamentoETP1;
    }
    
    public int getSalaTreinamentoETP2() {
        return salaTreinamentoETP2;
    }

    public void setSalaTreinamentoETP2(int salaTreinamentoETP2) {
        this.salaTreinamentoETP2 = salaTreinamentoETP2;
    }
    
    public int getEspacoCafeETP1() {
        return espacoCafeETP1;
    }

    public void setEspacoCafeETP1(int espacoCafeETP1) {
        this.espacoCafeETP1 = espacoCafeETP1;
    }
    
    public int getEspacoCafeETP2() {
        return espacoCafeETP2;
    }

    public void setEspacoCafeETP2(int espacoCafeETP2) {
        this.espacoCafeETP2 = espacoCafeETP2;
    }
    
    @Override
    public void mostrarDados(String nsala1, String nsala2, String nespaco1, String nespaco2) {
        System.out.println("Nome completo: " + this.nome + " " + this.sobrenome + ";");
        if(this.salaTreinamentoETP1 == 1) {
            System.out.println("Sala de treinamento na 1º etapa: " + nsala1 + " (Sala 1);");
        }
        else {
            System.out.println("Sala de treinamento na 1º etapa: " + nsala2 + " (Sala 2);");
        }
        if(this.salaTreinamentoETP2 == 1) {
            System.out.println("Sala de treinamento na 2º etapa: " + nsala1 + " (Sala 1);");
        }
        else {
            System.out.println("Sala de treinamento na 2º etapa: " + nsala2 + " (Sala 2);");
        }   
        if(this.espacoCafeETP1 == 1) {
            System.out.println("Espaço de café na 1º etapa: " + nespaco1 + " (Espaço 1);");
        }
        else {
            System.out.println("Espaço de café na 1º etapa: " + nespaco2 + " (Espaço 2);");
        }
        if(this.espacoCafeETP2 == 1) {
            System.out.println("Espaço de café na 2º etapa: " + nespaco1 + " (Espaço 1);");
        }
        else {
            System.out.println("Espaço de café na 2º etapa: " + nespaco2 + " (Espaço 2);");
        }  
    }
    
    @Override
    public String toString() {
        return "Pessoa {" + "nome=" + nome + ", sobrenome=" + sobrenome + '}';
    }     
    
}