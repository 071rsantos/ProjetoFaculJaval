package com.mycompany.princiapal;
import java.util.Date;
//classe 
public class Aluno{
  //atributos___________________
  private String nome;
  private long matricula;
  private String curso;
  private String endereco;
  private long cpf;

  //construtores________________________
  public Aluno(){
    nome = "sem nome";
    matricula = 0;
    curso = "sem curso";
    endereco = "sem endereço";
  }

  
  
  //metodos get________________________________________________
  public void Aluno(String a, String b, String c, long d, long e ){
    nome = a;
    curso = b;
    endereco = c;
    cpf = d;
    matricula = e;
  }

  public String getNome(){
    return nome;
  }

  public long getMatricula(){
    return matricula;
  }

  public String getCurso(){
    return curso;
  }

  public String getEndereco(){
    return endereco;
  }

  public long getCpf(){
    return cpf;
  }

  
    
}