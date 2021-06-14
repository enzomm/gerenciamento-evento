package model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public final class EspacoCafe {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nome")
	private String nome; 
	
	@Column(name = "ecafe1Etapa")
	@OneToMany(targetEntity = Pessoa.class, cascade = CascadeType.ALL)
    private ArrayList<Pessoa> ecafe1Etapa = new ArrayList<Pessoa>();
	
	@Column(name = "ecafe2Etapa")
	@OneToMany(targetEntity = Pessoa.class, cascade = CascadeType.ALL)
    private ArrayList<Pessoa> ecafe2Etapa = new ArrayList<Pessoa>();
    
    public EspacoCafe(String nome) {
        this.nome = nome;
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