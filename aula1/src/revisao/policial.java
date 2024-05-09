package revisao;

public class policial {
private String nome;
private final String lotacao;

public policial(String nome, String lotacao) {
    super();
    this.nome = nome;
    this.lotacao = lotacao;
}
@Override
public String toString() {
    return "Policial [nome=" + nome + ", lotacao=" + lotacao + "]";
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getLotacao() {
    return lotacao;
}
}