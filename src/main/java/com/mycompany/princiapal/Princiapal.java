package com.mycompany.princiapal;
import java.util.Scanner;
public class Princiapal {

    public static void main(String[] args) {
         //inicialização do Scanner
    Scanner sc = new Scanner(System.in);
    //invocação da classe faculdade
    Faculdade facul = new Faculdade();
    int escolha;
//invocando metodo teste.
    facul.Teste();
    
      
// estrutura de repetição.
     do{
          System.out.println("  ");
          System.out.println("_________________________________________________________________________");
          System.out.println("Digite o numero da função que deseja");
          System.out.println("1)Matricular aluno");
          System.out.println("2)Sair");
          System.out.println("3)Exibir dados de todos os alunos");
          System.out.println("4)Exibir dados de um aluno");
          escolha = sc.nextInt();
          
// switch case baseado na escolha do usuario.          
          switch (escolha) {
              case 1:
                  facul.Matricular();
                  break;
              case 2:
                  System.out.println("Processo encerrado.");
                  break;
              case 3:
                  facul.dadosAlunos();
                  break;
              case 4:
                  facul.Buscar();
                  break;
              default:
                  System.out.println("Opcao invalida");
                  break;
          }
      } while(escolha != 2);
    }
}
