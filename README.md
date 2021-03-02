# *Documentação* 


&nbsp;

## *O problema* 


&nbsp;

Será realizado um treinamento para uma empresa. Baseado em 2 etapas. As pessoas serão divididas em salas com lotação variável. Havendo também, dois intervalos de café em 2 espaços distintos. É necessário criar o sistema que gerenciará este evento. 

### **O sistema precisa permitir que:** 

* O cadastro de pessoas, com nome e sobrenome; 

* O cadastro das salas do evento, com nome e lotação; 

* O cadastro dos espaços de café pelo nome; 

A diferença de pessoas em cada sala deverá ser de no máximo 1 pessoa. Metade das pessoas precisam trocar de sala entre as duas etapas do treinamento; 

Ao consultar uma pessoa cadastrada no treinamento, o sistema deverá retornar à sala em que a pessoa ficará em cada etapa e o espaço onde ela realizará cada intervalo de café; 

Ao consultar uma sala cadastrada ou um espaço de café, o sistema deverá retornar uma lista das pessoas que estarão naquela sala ou espaço em cada etapa do evento. 


&nbsp;

## *Compilar e executar o programa:* 


&nbsp;

1. Instale o JDK. 

2. Baixe em formato .zip este repositório, e depois o extraí-o.  

3. Abra o projeto em uma IDE de sua preferência (NetBeans, Eclipse, etc).   

4. Execute a classe 'main', denominada Evento.  

 
&nbsp;

## *Planejamento do desenvolvimento:* 


&nbsp;

### **Passo 1** 

```
Criação do Java Project, tendo como nome, Evento. E Java Source Package, tendo como nome, Evento. 
```


&nbsp;

### **Passo 2** 

```
Criação da classe main, tendo como nome, Evento. 
```


&nbsp;

### **Criação da classe abstrata, Lugar, cujo:**  

* Atributo (junto de seu devido getter and setter):  

```
nome (String).  
```

* Construtor:  

```
nome. 
```

* Método abstrato: 

```
interagir().  
```


&nbsp;

### **Criação da classe, Pessoa, que implements InterfacePessoa. Cujo:** 

* Atributos (junto de seus devidos getters and setters):   

```
nome (String), sobrenome (String), salaTreinamentoETP1 (int), salaTreinamentoETP2 (int), espacoCafeETP1 (int), espacoCafeETP2 (int). 
```

* Construtor: 

```
nome, sobrenome, salaTreinamentoETP1. 
```

* Métodos: 

```
public mostrarDados(), "recebe" como parâmetros os nomes de ambas as Salas de Treinamento e Espaços de Café. "Retorna" em String, o nome completo da pessoa, e em que Sala de Treinamento e Espaço de Café permanecerá em cada etapa (etapas 1 e 2, sendo a possibilidade do valor dos mesmos, 1 e 2). 

public toString(), "retorna" em String, o nome e sobrenome da pessoa. 
```


&nbsp;

### **Criação da classe, SalaTreinamento, que extends Lugar e implements InterfaceSalaTreinamento. Cujo:**  

* Atributos (junto de seus devidos getters and setters):   

```
lotação (int), totPessoa (int), ArrayList<Pessoa> sala1Etapa (ArrayList agrega objetos da classe Pessoa), ArrayList<Pessoa> sala2Etapa (ArrayList agrega objetos da classe Pessoa).  

Obs: setters de sala1Etapa e sala2Etapa recebem como parâmetro um objeto da classe Pessoa, para este ser adicionado no ArrayList. Setter de sala1Etapa, aumenta em 1 o valor de totPessoa. 
```

* Construtor:  

```
nome (por meio de super), lotação, totPessoa com valor = 0. 
```

* Métodos:  

```
public interagir(sobreposto), retorna em String "Treinando...". 

public pessoaSalaEtapa1(), "recebe" como parâmetro um Int (valor 0 ou 1, de acordo com a posição da Sala no vetor s[] criado na classe Evento), "chama" o método toString de todos os objetos da classe Pessoa agregados no ArrayList sala1Etapa. 

public pessoaSalaEtapa2(), "recebe" como parâmetro um Int (valor 0 ou 1, de acordo com a posição da Sala no vetor s[] criado na classe Evento), "chama" o método toString de todos os objetos da classe Pessoa agregados no ArrayList sala2Etapa. 
```


&nbsp;

### **Criação da classe, EspacoCafe, que extends Lugar e implements InterfaceEspacoCafe. Cujo:** 

* Atributos (junto de seus devidos getters and setters): 

```
ArrayList<Pessoa> ecafe1Etapa (ArrayList agrega objetos da classe Pessoa), ArrayList<Pessoa> ecafe2Etapa (ArrayList agrega objetos da classe Pessoa). 

Obs: setter de ecafe1Etapa recebe como parâmetro o ArrayList<Pessoa> sala1Etapa (sala 1 com espaço 1, e sala 2 com espaço 2), e setter ecafe2Etapa recebe como parâmetro o ArrayList<Pessoa> sala2Etapa (sala 1 com espaço 1, e sala 2 com espaço 2). 
```

* Construtor: 

```
nome (por meio de super). 
```

* Métodos: 

```
public interagir(sobreposto), "retorna" em String "Observando...". 

public interagir(sobrecarregado), "recebe" como parâmetro uma String, e de acordo com o valor da mesma, "retorna" em String uma das 4 opções de interação (Conversar - Conversando..., Comer - Comendo..., Beber - Bebendo..., 'default' - Observando...). 

public pessoaEspacoEtapa1(), "recebe" como parâmetro um Int (valor 0 ou 1, de acordo com a posição do Espaço no vetor e[] criado na classe Evento), "chama" o método toString de todos os objetos da classe Pessoa agregados no ArrayList ecafe1Etapa. 

public pessoaEspacoEtapa2(), "recebe" como parâmetro um Int (valor 0 ou 1, de acordo com a posição do Espaço no vetor e[] criado na classe Evento), "chama" o método toString de todos os objetos da classe Pessoa agregados no ArrayList ecafe2Etapa. 
```


&nbsp;

### **Criação da Interface InterfacePessoa. Cujo:** 

* Método abstrato: 

```
public mostrarDados(), "recebe" como parâmetros os nomes de ambas as Salas de Treinamento e Espaços de Café. 
```


&nbsp;

### **Criação da Interface InterfaceSalaTreinamento. Cujo:** 

* Métodos abstratos: 

```
public interagir(). 

public pessoaSalaEtapa1(), "recebe" como parâmetro um Int (valor 0 ou 1, de acordo com a posição da Sala no vetor s[] criado na classe Evento). 

public pessoaSalaEtapa2(), "recebe" como parâmetro um Int (valor 0 ou 1, de acordo com a posição da Sala no vetor s[] criado na classe Evento). 
```


&nbsp;

### **Criação da Interface InterfaceEspacoCafe. Cujo:** 

* Métodos abstratos: 

```
public interagir(). 

public interagir(), "recebe" como parâmetro uma String. 

public pessoaEspacoEtapa1(), "recebe" como parâmetro um Int (valor 0 ou 1, de acordo com a posição do Espaço no vetor e[] criado na classe Evento). 

public pessoaEspacoEtapa2(), "recebe" como parâmetro um Int (valor 0 ou 1, de acordo com a posição do Espaço no vetor e[] criado na classe Evento).
``` 


&nbsp;

### **Classe Evento:** 

```
É realizado o cadastro das Salas de Treinamento (2), por nome e lotação. Com suas devidas exceções. 

É realizado o cadastro dos Espaços de Café (2), por nome. Com suas devidas exceções. 

É realizado o cadastro das Pessoas (de acordo com a lotação total), por nome, sobrenome e sala de treinamento que permanecerá o mesmo na etapa 1. Com suas devidas exceções. 

O código de forma automática forma a etapa 2 de ambas as Salas de Treinamento e as etapas 1 e 2 de ambos os Espaços de Café. 

O código de forma automática define nos dados da Pessoa, em qual Sala de Treinamento o mesmo permanecerá na etapa 2, e em qual Espaço de Café nas etapas 1 e 2. 

O código mostra todas as pessoas que permaneceram em cada Sala de Treinamento, em cada etapa. 

O código mostra todas as pessoas que permaneceram em cada Espaço de Café, em cada etapa. 

A opção de busca pelos dados de uma pessoa cadastrada é dada. Com suas devidas exceções.
``` 
