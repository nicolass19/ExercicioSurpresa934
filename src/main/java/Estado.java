public class Estado {

    private Pais pais;
    private String estado;

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public Estado setEstado(String estado) {
        this.estado = estado;
        return this;
    }
}
