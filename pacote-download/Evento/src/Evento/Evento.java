package Evento;

import java.util.ArrayList;
import java.util.Scanner;

public class Evento {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        SalaTreinamento s[] = new SalaTreinamento[2]; 
        EspacoCafe e[] = new EspacoCafe[2];
        ArrayList<Pessoa> cadastros = new ArrayList();
        
        String nsala1, nsala2, nomep, sobrenp, ecafe1, ecafe2;
        int lsala1, lsala2, ns, cdisp;
          
        // # Início # Código de cadastro das salas de treinamento.
        while(true) {
            
            System.out.println("Regra: A diferença de pessoas em cada sala deverá ser de no máximo 1, e cada uma delas tendo no mínimo 2 pessoas. Os nomes das salas não devem conter espaço.");
            System.out.println("########## CADASTRO ##########");
            
            System.out.println("Informe o nome de uma sala, onde ocorrerá o treinamento (Sala 1): ");
            nsala1 = input.next();        
            System.out.println("Informe a lotaçaõ da mesma: ");       
            lsala1 = input.nextInt();

            System.out.println("Informe o nome de outra sala, onde ocorrerá o treinamento (Sala 2): ");
            nsala2 = input.next();        
            System.out.println("Informe a lotaçaõ da mesma: ");
            lsala2 = input.nextInt();
            
            if(lsala1 == lsala2 || lsala1 == (lsala2 + 1) || lsala1 == (lsala2 - 1)) { // A diferença de pessoas em cada sala será de no máximo 1. E cada sala deve ter no mínimo 2 pessoas. 
                if((lsala1 + lsala2) >= 4) {
                    break;
                }
                else{
                System.out.println("=============================="); 
                System.out.println("Opções de lotação inexistentes! ");
                System.out.println("==============================");
                }
            } 
            else {
                System.out.println("=============================="); 
                System.out.println("Opções de lotação inexistentes! ");
                System.out.println("=============================="); 
            }
            
        } 
                
        s[0] = new SalaTreinamento(lsala1, nsala1); // Criação da Sala 1.
        s[1] = new SalaTreinamento(lsala2, nsala2); // Criação da Sala 2.  
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Cadastros concluídos com sucesso!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // # Fim # Código de cadastro das salas de treinamento.
        
        // # Fim # Código de cadastro dos espaços de café.
        System.out.println("Regra: Os nomes das salas não devem conter espaço.");
        System.out.println("########## CADASTRO ##########");
        System.out.println("Informe o nome de um espaço de café (Espaço 1): ");
        ecafe1 = input.next();
        System.out.println("Informe o nome de outro espaço de café (Espaço 2): ");
        ecafe2 = input.next();
        
        e[0] = new EspacoCafe(ecafe1); // Criação do Espaço de Café 1.
        e[1] = new EspacoCafe(ecafe2); // Criação do Espaço de Café 2.
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Cadastros concluídos com sucesso!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // # Fim # Código de cadastro dos espaços de café.
        
        // # Início # Código de cadastro das pessoas.
        while(true) {
            
            System.out.println("########## CADASTRO ##########");
            System.out.println("Informe o nome da pessoa: ");
            nomep = input.next();
            System.out.println("Informe o sobrenome da mesma: ");
            sobrenp = input.next();
            System.out.println("Digite[1] para Sala 1 e [2] para Sala 2.\nInforme em qual sala o mesmo se encontrará na fase inicial do treinamento: ");
            ns = input.nextInt();
            
            if(ns == 1 && s[0].getTotPessoa() == s[0].getLotacao()) { // Total de pessoas igual lotação. Referente à Sala 1. 
                System.out.println("=============================="); 
                System.out.println("A sala 1 está lotada! O cadastro da pessoa foi feito automaticamente com: fase inicial do treinamento sendo na Sala 2.");
                System.out.println("=============================="); 
                ns = 2;                 
            }
            else if(ns == 2 && s[1].getTotPessoa() == s[1].getLotacao()) { // Total de pessoas igual lotação. Referente à Sala 2.
                System.out.println("=============================="); 
                System.out.println("A sala 2 está lotada! O cadastro da pessoa foi feito automaticamente com: fase inicial do treinamento sendo na Sala 1.");
                System.out.println("=============================="); 
                ns = 1;                 
            }  
            
            Pessoa p = new Pessoa(nomep, sobrenp, ns); // Criação da Pessoa. 
            cadastros.add(p); // Adiciona essa mesma pessoa, no ArrayList cadastros.
            
            System.out.println("------------------------------");           
            if(ns == 1) { // Referente à Sala 1.
                s[0].setSala1Etapa(p); // Chama o método que irá adicionar esta pessoa na etapa 1, e aumentar em 1 o número total de pessoas.
                                
                p.setEspacoCafeETP1(1); // Chama o método que irá nos dados da mesma pessoa, defenir a *1º etapa do café* como sendo no *Espaço 1*. 
                
                s[0].pessoaSalaEtapa1(0); // Chama o método que irá mostrar o nome e sobrenome das pessoas na etapa 1.    
                System.out.println("------------------------------");
                System.out.println("Número de cadastros disponíveis para serem realizados nesta sala: "+ (s[0].getLotacao() - s[0].getTotPessoa()) +"."); // Lotação menos total de pessoas. Referente à Sala 1.
            }
            else { // Referente à Sala 2.
                s[1].setSala1Etapa(p); // Chama o método que irá adicionar esta pessoa na etapa 1, e aumentar em 1 o número total de pessoas.
                                
                p.setEspacoCafeETP1(2); // Chama o método que irá nos dados da mesma pessoa, defenir a 1º etapa do café como sendo no Espaço 2. 
                
                s[1].pessoaSalaEtapa1(1); // Chama o método que irá mostrar o nome e sobrenome das pessoas na etapa 1.                
                System.out.println("------------------------------");
                System.out.println("Número de cadastros disponíveis para serem realizados nesta sala: "+ (s[1].getLotacao() - s[1].getTotPessoa()) +"."); // Lotação menos total de pessoas. Referente à Sala 2.
            }        
            
            cdisp = (s[0].getLotacao() + s[1].getLotacao()) - (s[0].getTotPessoa() + s[1].getTotPessoa()); // Lotação total menos quantidade atual de cadastros. Referente às Salas 1 e 2.
            System.out.println("Número total de cadastros disponíveis: "+ cdisp +".");     
            
            if(s[0].getLotacao() + s[1].getLotacao() == s[0].getTotPessoa() + s[1].getTotPessoa()) { // Número de pessoas cadastradas alcançou a lotação total. Referente às Salas 1 e 2.
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Planejamento do evento concluído com sucesso!");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break; // Sai do laço de repeticão 'while(true)'.
            }            
            
        }
        // # Fim # Código de cadastro das pessoas.
        
        
        // # Início # Código de criação automática da 2º etapa, referente às Salas 1 e 2. 
        
        //Irá da posição do ArrayList[0] até a metade do seu tamanho. Em relação à 1º etapa da Sala 1.
        for(int i = 0; i < (s[0].getSala1Etapa().size())/2; i++){ // Par: pega a 1º metade dos cadastros, Ímpar: pega a 1º metade dos cadastros - o último cadastro desta mesma metade.  
            Pessoa x = s[0].getSala1Etapa().get(i); // 'x' (nome dado, por conta de ser da Sala 1) passa a representar a pessoa encontrada na 1º etapa da Sala 1, na posição 'i' do ArrayList. 
           
            s[0].setSala2Etapa(x); // Chama o método que irá adicionar a pessoa 'x' na 2º etapa da Sala 1.
            x.setSalaTreinamentoETP2(1); // Chama o método que irá nos dados da mesma pessoa, defenir a 2º etapa do treinamento como sendo na Sala 1.   
                       
            x.setEspacoCafeETP2(1); // Chama o método que irá nos dados da mesma pessoa, defenir a 2º etapa do café como sendo no Espaço 1. 
        }
        //Irá da posição "metade" do ArrayList até o seu final. Em relação à 1º etapa da Sala 2.
        for(int i = (s[1].getSala1Etapa().size())/2; i < s[1].getSala1Etapa().size(); i++){ // Par: pega a 2º metade dos cadastros, Ímpar: pega a 2º metade dos cadastros + o cadastro antecessor (último da 1º metade) do primeiro cadastro desta mesma metade.  
            Pessoa y = s[1].getSala1Etapa().get(i); // 'y' (nome dado, por conta de ser da Sala 2) passa a representar a pessoa encontrada na 1º etapa da Sala 2, na posição 'i' do ArrayList.
           
            s[0].setSala2Etapa(y); // // Chama o método que irá adicionar a pessoa 'y' na 2º etapa da Sala 1.
            y.setSalaTreinamentoETP2(1); // Chama o método que irá nos dados da pessoa, defenir a 2º etapa do treinamento como sendo na Sala 1.    
                       
            y.setEspacoCafeETP2(1); // Chama o método que irá nos dados da mesma pessoa, defenir a 2º etapa do café como sendo no Espaço 1. 
        }
       
        System.out.println("------------------------------");
        s[0].pessoaSalaEtapa1(0); // Chama o método que irá mostrar o nome e sobrenome das pessoas na etapa 1. Em relação à Sala 1.
        s[0].pessoaSalaEtapa2(0); // Chama o método que irá mostrar o nome e sobrenome das pessoas na etapa 2. Em relação à Sala 1.
       
        //Irá da posição "metade" do ArrayList até o seu final. Em relação à 1º etapa da Sala 1.
        for(int i = (s[0].getSala1Etapa().size())/2; i < s[0].getSala1Etapa().size(); i++){ // Par: pega a 2º metade dos cadastros, Ímpar: pega a 2º metade dos cadastros + o cadastro antecessor (último da 1º metade) do primeiro cadastro desta mesma metade.   
            Pessoa x = s[0].getSala1Etapa().get(i); // 'x' (nome dado, por conta de ser da Sala 1) passa a representar a pessoa encontrada na 1º etapa da Sala 1, na posição 'i' do ArrayList. 
           
            s[1].setSala2Etapa(x); // Chama o método que irá adicionar a pessoa 'x' na 2º etapa da Sala 2. 
            x.setSalaTreinamentoETP2(2); // Chama o método que irá nos dados da mesma pessoa, defenir a 2º etapa do treinamento como sendo na Sala 2. 
                       
            x.setEspacoCafeETP2(2); // Chama o método que irá nos dados da mesma pessoa, defenir a 2º etapa do café como sendo no Espaço 2. 
        }
        //Irá da posição do ArrayList[0] até a metade do seu tamanho. Em relação à 1º etapa da Sala 2.
        for(int i = 0; i < (s[1].getSala1Etapa().size())/2; i++){ // Par: pega a 1º metade dos cadastros, Ímpar: pega a 1º metade dos cadastros - o último cadastro desta mesma metade.   
            Pessoa y = s[1].getSala1Etapa().get(i); // 'y' (nome dado, por conta de ser da Sala 2) passa a representar a pessoa encontrada na 1º etapa da Sala 2, na posição 'i' do ArrayList. 
           
            s[1].setSala2Etapa(y); // Chama o método que irá adicionar a pessoa 'y' na 2º etapa da Sala 2.  
            y.setSalaTreinamentoETP2(2); // Chama o método que irá nos dados da mesma pessoa, defenir a 2º etapa do treinamento como sendo na Sala 2.
                        
            y.setEspacoCafeETP2(2); // Chama o método que irá nos dados da mesma pessoa, defenir a 2º etapa do café como sendo no Espaço 2. 
        }        
       
        s[1].pessoaSalaEtapa1(1); // Chama o método que irá mostrar o nome e sobrenome das pessoas na etapa 1. Em relação à Sala 2.
        s[1].pessoaSalaEtapa2(1); // Chama o método que irá mostrar o nome e sobrenome das pessoas na etapa 2. Em relação à Sala 2.
        System.out.println("------------------------------");    
        
        System.out.println("------------------------------");  
        e[0].setEcafe1Etapa(s[0].getSala1Etapa());
        e[0].pessoaEspacoEtapa1(0);
        e[0].setEcafe2Etapa(s[0].getSala2Etapa());
        e[0].pessoaEspacoEtapa2(0);
        e[1].setEcafe1Etapa(s[1].getSala1Etapa());
        e[1].pessoaEspacoEtapa1(1);
        e[1].setEcafe2Etapa(s[1].getSala2Etapa());
        e[1].pessoaEspacoEtapa2(1);
        System.out.println("------------------------------");  
        
        // # Fim # Código de criação automática da 2º etapa, referente às Salas 1 e 2. 
        
        // # Inicio # Código para mostrar dados de determinado cadastro de acordo com o nome e sobrenome informados na solicitação.
                
        int opc;
        String nomeCadastro, sobreNCadastro;
        boolean existeCadastro = false;
        
        while(true) {
            
            System.out.println("Digite[1] para Sim e [2] para Não.\nInforme deseja obter as informações sobre determinado cadastro: ");
            opc = input.nextInt();
            
            if(opc == 1) { // O usuário quer obter as informações sobre algum cadastro.
                System.out.println("Informe o nome do mesmo: ");
                nomeCadastro = input.next();
                System.out.println("Informe o sobrenome do mesmo: ");
                sobreNCadastro = input.next();
                for(int i = 0; i < cadastros.size(); i++) { // Irá da posição 0 até o seu fim. Em relação ao ArrayList cadastros. 
                    String x = cadastros.get(i).getNome(); // 'x' recebe o nome da pessoa encontrada na posição 'i'.
                    String y = cadastros.get(i).getSobrenome(); // 'y' recebe o sobrenome da pessoa encontrada na posição 'i'.
                    if(nomeCadastro.equals(x) && sobreNCadastro.equals(y)) { // Nome informado igual ao 'x', e sobrenome infomado igual ao 'y'.
                        System.out.println("==============================");            
                        cadastros.get(i).mostrarDados(s[0].getNome(), s[1].getNome(), e[0].getNome(), e[1].getNome()); // Mostra os dados da pessoa encontrada nesta posição 'i'.
                        System.out.println("==============================");            
                        existeCadastro = true; // Exite um cadastro da determinada pessoa, conforme o informado.
                        break; // Sai do laço de repetição 'for'.
                    }
                }
                if(existeCadastro == false) { // Não exite um cadastro da determinada pessoa, conforme o informado.
                    System.out.println("==============================");            
                    System.out.println("O nome e sobrenome informados não constam nos cadastros!");
                    System.out.println("==============================");            
                }
            }
            else { // O usuário não quer obter as informações sobre algum cadastro.               
                break; // Sai do laço de repeticão 'while(true)'.
            }
            
        }
        
        // # Fim # Código para mostrar dados de determinado cadastro de acordo com o nome e sobrenome informados na solicitação. 
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Programa concluído com sucesso!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
    }
    
}