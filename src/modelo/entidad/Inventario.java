
package modelo.entidad;


public class Inventario {
    private String nom, descripcion, categoria;
    private int codigo,stock;

    public Inventario() {
    }

    public Inventario(String nom, String descripcion, String categoria,int codigo, int stock) {
        this.nom = nom;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.codigo= codigo;
        this.stock = stock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
