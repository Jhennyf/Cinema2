package model;

public class Filme {

    private String titulo, genero, sinopse, link;
    private int idFilme, duracao, classeIdade;

    public Filme() {
    }
    
    /**
     * Construtor da classe Filmes com:
     *
     * @param idFilme
     * @param titulo
     * @param genero
     * @param sinopse
     * @param link
     * @param duracao
     * @param classeIdade
     */
    public Filme(int idFilme, String titulo, String link, String sinopse, int duracao, String genero, int classeIdade) {
        super();
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.link = link;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.genero = genero;
        this.classeIdade = classeIdade;
    }
    
    public Filme(int idFilme){
        this.idFilme = idFilme;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getClasseIdade() {
        return classeIdade;
    }

    public void setClasseIdade(int classeIdade) {
        this.classeIdade = classeIdade;
    }
}
