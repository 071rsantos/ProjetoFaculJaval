package com.mycompany.princiapal;
import java.util.Scanner;
import java.util.ArrayList;
//classe faculdade
public class Faculdade{
  //criando espaços para utilizar classe aluno
  Aluno aluno; 
  Aluno aluno1 = new Aluno();
  Aluno aluno2 = new Aluno();
  Aluno aluno3 = new Aluno();
  Aluno aluno4 = new Aluno();
  Aluno aluno5 = new Aluno();
  Aluno aluno6 = new Aluno();
  Aluno aluno7 = new Aluno();
//inicializando arraylist
  ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();

  

  
  

//criando variavel matricula
  long matricula = 7;
//metodo para matricular aluno
  public void Matricular(){
    aluno = new Aluno();
     
    System.out.println(" ");
    System.out.println("_______________________________________________________________________");
    System.out.println("Digite o nome do aluno");
    String nome = lerString();

    System.out.println("Digite o curso do aluno");
    String curso = lerString();

    System.out.println("Digite o endereço do aluno");
    String endereco = lerString();

    System.out.println("Digite o cpf do aluno");
    Long cpf = lerLong();

    matricula += 1;

  
    aluno.Aluno(nome, curso, endereco, cpf, matricula);
    alunosMatriculados.add(aluno);
  }
//criação de 7 alunos para teste do programa.
  public void Teste(){
    aluno1.Aluno("Rodrigo","ADS","Ribeira", 86237783, 1);
    alunosMatriculados.add(aluno1);

    aluno2.Aluno("Calos","ADM","Doron", 873546432, 2);
    alunosMatriculados.add(aluno2);

    aluno3.Aluno("Lucas","CC","Cabula", 925438578, 3);
    alunosMatriculados.add(aluno3);

    aluno4.Aluno("Elthon","Enfermagem","narandiba", 763547472, 4);
    alunosMatriculados.add(aluno4);

    aluno5.Aluno("Pedro","Markinting","Cabula VI", 645345763, 5);
    alunosMatriculados.add(aluno5);

    aluno6.Aluno("Ian","Direito","susuarana", 67383456, 6);
    alunosMatriculados.add(aluno6);

    aluno7.Aluno("Vinicius","Medicina","Cabula VI", 542354387, 7);
    alunosMatriculados.add(aluno7);
  }

  
//metodo para exibir dados dos alunos
  public void dadosAlunos(){
    
     System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("%20s %20s %20s  ", "NOME", "CURSO", "MATRICULA" );
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
      //estrutura de repetição para exibir todos os alunos cadastrados
        for(Aluno aluno: alunosMatriculados){
            System.out.format("%20s %20s %20s ",
                    aluno.getNome(), aluno.getCurso(),aluno.getMatricula());
            System.out.println();
        }
  }
 //metodo para buscar aluno
  public void Buscar(){
      System.out.println("Digite a matricula do aluno");
      long m = lerLong();
    //utilizando for para buscar aluno especifico em uma arraylist
       for(Aluno aluno: alunosMatriculados){
        if(m==aluno.getMatricula()){
          System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%20s %20s %20s %20s %20s", "NOME", "CURSO", "ENDEREÇO", "CPF", "MATRICULA" );
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------");
      
            System.out.format("%20s %20s %20s %20s %20s",
                    aluno.getNome(), aluno.getCurso(), aluno.getEndereco(), aluno.getCpf(), aluno.getMatricula());
            System.out.println();
      }
    }
  }

    
    
//metodo utilizar Scanner em String
  public String lerString(){
    Scanner input = new Scanner(System.in);
    String a = input.nextLine();
    return a;
  }
//metodo utilizar Scanner em long
  public Long lerLong(){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    return a;
  }
}