public class exercicio3 {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

class Biblioteca {
    private Livro[] livros;
    private int tamanho;
    private static final int CAPACIDADE_MAXIMA = 10;

    public Biblioteca() {
        livros = new Livro[CAPACIDADE_MAXIMA];
        tamanho = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (tamanho < CAPACIDADE_MAXIMA) {
            livros[tamanho] = livro;
            tamanho++;
            System.out.println("Livro adicionado à biblioteca: " + livro.getTitulo());
        } else {
            System.out.println("A biblioteca está lotada, não é possível adicionar mais livros.");
        }
    }

    public void listarLivros() {
        System.out.println("Livros na biblioteca:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(livros[i].getTitulo() + " por " + livros[i].getAutor());
        }
    }
}

public class TesteBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes");
        biblioteca.adicionarLivro(livro1);

        Livro livro2 = new Livro("1984", "George Orwell");
        biblioteca.adicionarLivro(livro2);

        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        biblioteca.adicionarLivro(livro3);

        biblioteca.listarLivros();
    }
}
