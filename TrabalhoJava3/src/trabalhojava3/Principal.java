/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojava3;

/**
 *
 * @author 20186036
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Estânciando objetos da classe Clientes
        Cliente c1 = new Cliente(1, "antonio","566@gmail.com",  0);
        Cliente c2 = new Cliente(2, "Marcos" ,"34@gmail.com",   0);
        Cliente c3 = new Cliente(3, "Andre"  ,"123q@gmail.com", 0);
        
        //Estânciando objetos da classe Supervisor
        Supervisor s1 = new Supervisor(4, "Julio",   "824@gmail.cpom",2500);
        Supervisor s2 = new Supervisor(5, "Maria",   "777@gmail.cpom",2500);
        Supervisor s3 = new Supervisor(6, "Andressa","685@gmail.cpom",2500);
        
        //Estânciando objetos da classe Cargo
        Cargo cargo1 = new Cargo(1, "Diretor"); 
        Cargo cargo2 = new Cargo(2, "Faxineiro"); 
        Cargo cargo3 = new Cargo(3, "Recepcionista"); 
        
       //Estânciando objetos da classe Funcionario
        Funcionario f1 = new Funcionario(1,"Bruno","daabunda@gmail.com", 1500, 40, cargo1, s1);   
        Funcionario f2 = new Funcionario(2,"Bruna","000@gmail.com", 700, 20, cargo2, s2);   
        Funcionario f3 = new Funcionario(0,"Carlos", "erter@gmail.com", 500, 40, cargo3, s3);         
        
        //Estânciando objetos da classe Servico
        Servico serv1  =  new Servico(0,"Site e-comerce");
        Servico serv2  =  new Servico(1,"Site em Wordpress");
        
        //Adcionando Funcioanrio ao Serviço
        serv1.addFuncionario(f1);
        serv1.addFuncionario(f2);
        serv2.addFuncionario(f3);
        
        //Removenod funcionarios 
        boolean remover = serv1.removeFuncionario(f2);
        if(remover){
            System.out.println("Funcionario Removido com sucesso!");
        }else{
            System.out.println("Falha ao remover funcionario");
        }
        
        //Estânciando Objetos da classe ItensContrato
        ItensContrato itens1 = new ItensContrato("02/05/2022", 8000,serv1);
        ItensContrato itens2= new ItensContrato("10/06/2022", 1000,serv2);
        
        //Estânciando Objetos da classe contrato
        Contrato cont1 = new Contrato(0, "28/12/2021", 500, c3, s3);
        Contrato cont2 = new Contrato(1, "10/01/2022", 800, c2, s2);
        Contrato cont3 = new Contrato(1, "10/01/2022", 1500, c1, s1);
        
        //Adcionando itens ao contrato
        cont1.addItensContrato(itens1);
        cont2.addItensContrato(itens2);
        cont3.addItensContrato(itens2);
        
        //Removendo itens do contrato
        boolean removerServ = cont1.removeItensContrato(itens2);
        if(removerServ){
            System.out.println("Itens Removido com sucesso!");
        }else{
            System.out.println("Falha ao remover Itens");
        }
        
        //TESTES
        System.out.println("\n----Dados Do contrato----");
        System.out.println("Id Contrato:  "+ cont1.getId()       +
                           "\nData incio: "+cont1.getDataInicio()+
                           "\nValor mensal: R$"+ cont1.getValorMensal()+
                           "\nSupervisor: "+cont1.getSupervisor().getNome()+
                           "\nSalario Supervisor: R$"+cont1.getSupervisor().getSalario());  
        for(int i = 0; i< cont1.getItens().size(); i++){
            System.out.println("Data Fim: "+ cont1.getItens().get(i).getDataFim()+
                               "\nValor: R$"+cont1.getItens().get(i).getValor()+
                               "\nDescricao do Servico: "+cont1.getItens().get(i).getServico().getDescricao());
                                
           for(int y = 0; y< cont1.getItens().get(i).getServico().getFuncionarios().size();y++){
               System.out.println("Nome funcionario: " + cont1.getItens().get(i).getServico().getFuncionarios().get(y).getNome()+
                                 "\nSalario Funcionario: "+ cont1.getItens().get(i).getServico().getFuncionarios().get(y).getSalario()+
                                 "\nCarga Horaria: " + cont1.getItens().get(i).getServico().getFuncionarios().get(y).getCargaHoraria()+
                                 "\nCargo funcionario: "+ cont1.getItens().get(i).getServico().getFuncionarios().get(y).getCargo().getDescricao()+
                                 "\nSupervisor funcionario: "+ cont1.getItens().get(i).getServico().getFuncionarios().get(y).getSupervisor().getNome());
                    
           }
        }
        
    }   
}