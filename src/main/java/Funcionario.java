public class Funcionario {

    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;
    private String nome;

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String informarPaisAlocacao(){
        return alocacao.informarDepartamentoEmpresa();
    }

    public String informarFilialCoordenada(){
        return coordenacao.informarCidadeFilial();
    }

    public String informarEscolaridadeChefe(){
        return escolaridade.getNivelEscolaridade();
    }

    public String getNome() {
        return nome;
    }

    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }
}
