public class livro {
    String nome;
    String descricao;
    String isbn;
    String genero;
    float valor;
    
    autor autor;
    
    public livro(String nome) {
        this.nome = nome;
    }
    
    public void exibirDetalhes(){
        System.out.println ("Detalhes do livro " + nome);
        System.out.println ("Escrito por " + autor.nome);
        System.out.println ("O isbn é " + isbn);
        System.out.println ("O valor do livro ´é r$ " + valor);        

    }
    
    
    
}
