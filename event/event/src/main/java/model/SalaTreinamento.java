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
public final class SalaTreinamento {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "id")
	private String nome;
	
	@Column(name = "lotacao")
    private int lotacao;
	
	@Column(name = "totPessoa")
    private int totPessoa; 
	
	@Column(name = "sala1Etapa")
	@OneToMany(targetEntity = Pessoa.class, cascade = CascadeType.ALL)
    private ArrayList<Pessoa> sala1Etapa = new ArrayList<Pessoa>();
		
	@Column(name = "sala2Etapa")
	@OneToMany(targetEntity = Pessoa.class, cascade = CascadeType.ALL)
    private ArrayList<Pessoa> sala2Etapa = new ArrayList<Pessoa>();
    

    public SalaTreinamento(int lotacao, String nome) {
        this.nome =nome;
        this.lotacao = lotacao;
        this.totPessoa = 0;
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
    
}