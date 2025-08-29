package projeto;

public class livros {
    String nome;
    int ano;
    String autor;
    String categoria;

    public livros (String nome, int ano,  String autor, String categoria){
        this.nome = nome;
        this.ano = ano;
        this.autor = autor;
        this.categoria = categoria;
    }
    public void imprimir(){
        System.out.println("- nome: " + nome);
        System.out.println("- ano: " + ano);
        System.out.println("autor: " + autor);
        System.out.println("categoria: " + categoria);
    }
    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

}
