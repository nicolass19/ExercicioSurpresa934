public class Departamento {

    private Empresa empresa;
    private Funcionario chefe;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public String informarDepartamentoEmpresa(){
       return empresa.informarGrupo();
    }

    public String informarEscolaridadeChefia(){
        return chefe.informarEscolaridadeChefe();
    }
}
