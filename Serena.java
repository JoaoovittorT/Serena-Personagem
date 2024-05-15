public class Serena {
  // !! //
  public String nome;
  public int idade;
  public String sexo;
  public String genero;
  public String raca;
  public String cor;
  public String ocupacao;
  public String tipoCauda;
  public String corCauda;
  public String tipoCabelo;
  public String corCabelo;
  public String escala;

  // Construtor//
  public Serena(String novoNome, int novaIdade, String novoSexo, String novoGenero, String novaRaca, String novaCor,
      String novaOcupacao, String novoTipoCauda, String novaCorCauda, String novoTipoCabelo, String novaCorCabelo,
      String novaEscala) {
    // THIS.//
    this.nome = novoNome;
    this.idade = novaIdade;
    this.sexo = novoSexo;
    this.genero = novoGenero;
    this.raca = novaRaca;
    this.cor = novaCor;
    this.ocupacao = novaOcupacao;
    this.tipoCauda = novoTipoCauda;
    this.corCauda = novaCorCauda;
    this.tipoCabelo = novoTipoCabelo;
    this.escala = novaEscala;
    this.corCabelo = novaCorCabelo;
  }
  // Fim Construtor;//

  public String dialogar(boolean perguntaUm, boolean perguntaDois) {
    if (perguntaUm == true) {
      return "eu não quero corja com os saqueadores";
    } else if (perguntaDois == true) {
      return "sim";
    } else {
      return "-Essa pergunta não é valida";
    }
  }

  public String pintar() {
    return "- Serena está pintando.";
  }

  public String toString() {
    return "O meu nome é: " + this.nome + "\nTenho: " + this.idade + " anos" + "\nDa escala: " + this.escala
        + "\nSou do sexo: " + this.sexo + "\nMeu genero é: " + this.genero + " \nda raça: " + this.raca + "\nsou: "
        + this.ocupacao + "\nMinha cauda é: " + this.tipoCauda + "\nDa cor: " + this.corCauda + "\nMeu cabelo é"
        + this.corCabelo + " e " + this.tipoCabelo + ".";
  }

}
