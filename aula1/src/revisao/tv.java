package revisao;

public class tv {
   private String tamanho;

   private String modelo;
   private Marca marca;
public tv(String tamanho, String modelo, Marca marca) {
    super();
    this.tamanho = tamanho;
    this.modelo = modelo;
    this.marca = marca;
}
@Override
public String toString() {
    return "TV [tamanho=" + tamanho + ", modelo=" + modelo + ", marca=" + marca + "]";
}
public String getTamanho() {
    return tamanho;
}
public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}
public Marca getMarca() {
    return marca;
}
public void setMarca(Marca marca) {
    this.marca = marca;
}
}