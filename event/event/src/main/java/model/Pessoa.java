package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nome")
    private String nome;
	
	@Column(name = "sobrenome")
    private String sobrenome;
	
	@Column(name = "salaTreinamentoETP1")
    private int salaTreinamentoETP1; 
	
	@Column(name = "salaTreinamentoETP2")
    private int salaTreinamentoETP2; 
	
	@Column(name = "espacoCafeETP1")
    private int espacoCafeETP1; 
	
	@Column(name = "espacoCafeETP2")
    private int espacoCafeETP2; 

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    public Integer getId() {
		return id;
	}
    
	public void setId(Integer id) {
		this.id = id;
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
    
}