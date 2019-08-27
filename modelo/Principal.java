/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author yurilima
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INSTANCIAR 10 OBJETOS DA CLASSE ALUNO USANDO O
        //CONSTRUTOR CHEIO
        Aluno aluno01 = new Aluno(111,"JOAO","1111-1111");
        Aluno aluno02 = new Aluno(222,"ANA","2222-2222");
        Aluno aluno03 = new Aluno(333,"MARIA","3333-3333");
        Aluno aluno04 = new Aluno(444,"JOSE","4444-4444");
        Aluno aluno05 = new Aluno(555,"ANTONIO","5555-5555");
        Aluno aluno06 = new Aluno(666,"JOAQUIM","6666-6666");
        Aluno aluno07 = new Aluno(777,"ROSA","7777-7777");
        Aluno aluno08 = new Aluno(888,"SILVA","8888-8888");
        Aluno aluno09 = new Aluno(999,"FRANCISCO","9999-9999");
        Aluno aluno10 = new Aluno(100,"MARCIO","1010-1010");
        
        //OBJETO 'listaAlunos' pertence a Classe 'ArrayList'
        //instanciando uma lista vazia que so recebera objetos da
        //classe Aluno
        //Classe TIPADA ArrayList<TIPO>
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        //ADICIONANDO 10 OBJETOS DA CLASSE Aluno
        //na lista instanciada usando metodo add()
        listaAluno.add(aluno01);//INDICE 0 DO ARRAY
        listaAluno.add(aluno02);
        listaAluno.add(aluno03);
        listaAluno.add(aluno04);
        listaAluno.add(aluno05);
        listaAluno.add(aluno06);
        listaAluno.add(aluno07);
        listaAluno.add(aluno08);
        listaAluno.add(aluno09);
        listaAluno.add(aluno10);//INDICE 9 DO ARRAY
        
        //listaAluno.add("Aluno1");ERRO - LISTA TIPADA
        //NAO ACEITA STRING
        for(int i = 11; i <= 15; i++){
            
            Aluno objAluno = new Aluno(i,"aluno"+i, "9999-"+i+i);
            listaAluno.add(objAluno);
            
        }
        /*Novos objetos definidos FORA DO FOR - (NAO FUNCIONA)
        //teremos a referencia a um unico objeto (GLOBAL)
        //nesse caso teremos de colocar o objeto dentro 
        //do laço for
        //*****NAO POSSO DECLARAR FORA DO LAÇO FOR*****
        Aluno objAluno = new Aluno();
        for(int i = 11; i <= 15; i++){
            objAluno.setIdAluno(i);
            objAluno.setNome("novo-aluno" + i);
            objAluno.setCelular("9999-" + i + i);
            
            listaAluno.add(objAluno);
        }*/
        //LEITURA DOS OBJETOS ADICIONADOS DENTRO DA LISTA
        //USANDO O LAÇO FOR
        //METODO size() RETORNA O TAMANHO DA LISTA
        //METODO get(index) RETORNA O ELEMENTO DA POSIÇAO MARCADA PELO INDEX
        /*for(int j = 0; j < listaAluno.size(); j++){
            System.out.println("Aluno " + listaAluno.get(j).getIdAluno() + " - "+
                                            listaAluno.get(j).getNome() + " - " +
                                            listaAluno.get(j).getCelular());
        }*/
        //CRIANDO UM OBJETO "GLOBAL" - NAO CRIANDO UM NOVO EM CADA LAÇO DO FOR
        //*****NAO "DEVO" DECLARAR DENTRO DO LAÇO FOR*****
        Aluno objaluno = new Aluno();
        for(int j = 0; j < listaAluno.size(); j++){
            
            objaluno = listaAluno.get(j);
            System.out.println("Aluno " + objaluno.getIdAluno() + " - " +
                                            objaluno.getNome() + " - " +
                                            objaluno.getCelular());
            
        }
        //ALUNO ID 999
        Aluno objAluno1 = new Aluno();
        for(int k = 0; k < listaAluno.size(); k++){
            
            objAluno1 = listaAluno.get(k);
            
            if(objAluno1.getIdAluno() == 999){
                
                System.out.println("Aluno " + objAluno1.getNome());
            }
        }
        
                
    }
    
}
