package modelo.entidad;

public class Registro {
    private String nom_usu, ape_usu, usuario, contra_usu;
    private int telef_usu;

    public Registro() {
    }

    public Registro(String nom_usu, String ape_usu, String usuario, String contra_usu, int telef_usu) {
        this.nom_usu = nom_usu;
        this.ape_usu = ape_usu;
        this.usuario = usuario;
        this.contra_usu = contra_usu;
        this.telef_usu = telef_usu;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getApe_usu() {
        return ape_usu;
    }

    public void setApe_usu(String ape_usu) {
        this.ape_usu = ape_usu;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra_usu() {
        return contra_usu;
    }

    public void setContra_usu(String contra_usu) {
        this.contra_usu = contra_usu;
    }

    public int getTelef_usu() {
        return telef_usu;
    }

    public void setTelef_usu(int telef_usu) {
        this.telef_usu = telef_usu;
    }
    
}