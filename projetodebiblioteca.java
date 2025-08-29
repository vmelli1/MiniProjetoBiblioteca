package projeto;

import java.util.Scanner;
import java.util.ArrayList;

import java.util.ArrayList;


public class projetodebiblioteca {
    public static void main (String [] args ){
            // atributos class 

        ArrayList<livros> listadelivro = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("============");
            System.out.println("MENU BIBLIOTECA");
            System.out.println("============");
            System.out.println("1 - ADICIONAR LIVRO");
            System.out.println("2 - LISTAR LIVROS");
            System.out.println("3 - LISTAR Autores");
            System.out.println("4-  LISTAR CATEGORIAS");
            System.out.println("5 - SAIR ");

             opcao = sc.nextInt(); 
             sc.nextLine(); 

            switch (opcao) {
                case 1: 
                    System.out.println("Digite o Nome do livro");
                    String nome = sc.nextLine();

                    System.out.println("Digite o ano do livro");
                    int ano = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome do Autor");
                    String autor = sc.nextLine();

                    System.out.println("Digite a categoria");
                    String categoria = sc.nextLine();

                    listadelivro.add(new livros(nome, ano, autor, categoria));
                    System.out.println("LIVRO ADICIONADO COM SUCESSO!");
                break;

                case 2: 
                     System.out.println("\n--- Lista de livros ---");   
                     for (int i = 0; i < listadelivro.size(); i++){
                        System.out.println("Posição do livro " +i);
                        listadelivro.get(i).imprimir();
                     }

                break;

                case 3: 

                      System.out.println("\n--- Lista de AUTORES ---");
                      for(int i = 0; i < listadelivro.size(); i++){
                         System.out.println(listadelivro.get(i).getAutor());
                      }
                break;

                case 4:
                      for( int i = 0; i < listadelivro.size(); i++){
                        System.out.println("Lista de categoria");
                         System.out.println(listadelivro.get(i).getCategoria());
                      }
                break;

                case 5:
                      System.out.println("SAINDO DO PROGRAMA!");
                break;
                default:

                System.out.println("OPS INVALIDO!");

                break;
            }

        }   
        
    }
}
