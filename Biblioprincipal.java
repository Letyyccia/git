public class principal {
    public static void main(String[] args) {
        
        livro l1 = new livro("Vingadores");
        autor a = new autor("Clara", "1234567");
        a.nome = "fernando pessoa"; 
        a.idade = 55;
        a.naturalidade = "portugal"; 
        a.cpf = "123654789";
         
        
        l1.nome = "livro de orientaçao a objeto";
        l1.descricao = "Prof. Lazaro usa na aula";
        l1.isbn = "12587525";
        l1.genero = "didatico";
        l1.valor = 40;
        l1.autor = a;
       
        
        //System.out.println("Livros registrados: " + l1.nome);
        //System.out.println("nome do autor:" + l1.autor.nome);
        
        l1.exibirDetalhes();
               
        /*
        livro l2 = new livro();
        l1.nome = "metamorfose";
        l1.descricao = "Transformaçoes de um inseto";
        l1.autor = "Kafta";
        l1.genero = "literatura";
        l1.valor = 40;
        
        System.out.println("Livros registrados: ");
        System.out.println
       */
