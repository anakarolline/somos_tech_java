import java.util.ArrayList;

class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado: " + livro.getTitulo());
    }

    public void listarLivros() {
        System.out.println("Lista de Livros na Biblioteca:");
        for (Livro livro : livros) {
            String status = livro.isDisponivel() ? "Disponível" : "Indisponível";
            System.out.println("Título: " + livro.getTitulo() +
                    ", Autor: " + livro.getAutor() +
                    ", ISBN: " + livro.getIsbn() +
                    ", Status: " + status);
        }
    }

    public void emprestarLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn) && livro.isDisponivel()) {
                livro.setDisponivel(false);
                System.out.println("Livro emprestado: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não disponível para empréstimo.");
    }

    public void devolverLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn) && !livro.isDisponivel()) {
                livro.setDisponivel(true);
                System.out.println("Livro devolvido: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("ISBN inválido ou livro não estava emprestado.");
    }
}

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "978-1234567890");
        Livro livro2 = new Livro("1984", "George Orwell", "978-0451524935");

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        biblioteca.listarLivros();

        biblioteca.emprestarLivro("978-1234567890");
        biblioteca.listarLivros();

        biblioteca.devolverLivro("978-1234567890");
        biblioteca.listarLivros();
    }
}
