
package modelo.entidad;


public class Inventario {
    private String nom, descripcion, categoria,tienda;
    private int codigo,stock,id_usuario;

    public Inventario() {
    }

    public Inventario(String nom, String descripcion, String categoria,String tienda, int stock,int id_usuario) {
        this.nom = nom;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.tienda=tienda;
        this.stock = stock;
        this.id_usuario=id_usuario;
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
    public String getTienda(){
        return tienda;
    }
    public void setTienda (String tienda){
        this.tienda=tienda;
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

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }


}
