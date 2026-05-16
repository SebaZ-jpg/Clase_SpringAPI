package GaleriaRelojes.model;

public class Reloj {

    private Long id;
    private String titulo;
    private String texto;
    private String imagen;

    // Constructor vacío
    public Reloj() {
    }

    // Constructor completo
    public Reloj(Long id, String titulo, String texto, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.imagen = imagen;
    }

    // GETTERS Y SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}