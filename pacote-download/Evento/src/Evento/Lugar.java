package Evento;

public abstract class Lugar {
    
    protected String nome;

    public Lugar(String nome) {
        this.nome = nome;
    } 
    
    public abstract void interagir();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  
    
}