package ultraemojicombat;
public final class Lutador {

//Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private Float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    //private float base;
    
    
// MMétodos Públicos
    public void apresentar() {
      //System.out.println("-------------------------------------------------");
        System.out.println("CHEGOU A HORA!!! Apresentamos o lutador "  + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println(" com " + this.getIdade() + " anos " + this.getAltura() + " Mts ");
        System.out.println(" com " + this.getPeso() + " Kg ");
        System.out.println(this.getVitorias() + "-Vitorias   " + (this.getDerrotas() + "-Derrotas   " + (this.getEmpates() + "-Empates   ")));
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
  
    } 
    public void status() {
        System.out.println(this.getNome() + " É um peso " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias() + " vezes.");
        System.out.println("Perdeu: " + this.getDerrotas() + " vezes.");
        System.out.println("Empatou: " + this.getEmpates() + " vezes."); //chamou a funcáo para buscar o valor só isso
        
    }
    
        //Criando este status para saber apenas o cartel dos lutadores antes da luta.
    public void cartelInicial() {
        System.out.println("O " + (this.getNome() + " estava com um cartel de " + (this.getVitorias() + "-V / " + (this.getDerrotas() + "-D / " +  (this.getEmpates() + "-E.")))));
    }      
    //Criando este status para saber apos a luta como ficou o cartel dos lutadores.
   
    
    public void cartelFinal() {
        System.out.println("O " + (this.getNome() + " apos a luta ficou com um cartel de " + (this.getVitorias() + "-V / " + (this.getDerrotas() + "-D / " +  (this.getEmpates() + "-E.")))));
        System.out.println(" -------------------------------------------------------------------- ");        
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1); // pega o valor antigo e somar 1
    }                      //( 1 +1 )duas palavras  PER.....FEITO!!!!
       
//Métodos Especiais    
  //Construction    

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    //nao entendi o pq colocou o this.setCategora();
    public void setPeso(Float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválida";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválida";
  
                }
            
          
    }
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int VeioDeFora) {
        this.vitorias = VeioDeFora;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() { // Essa função busca o valor da variavel
        return empates; // Ele busca lá em cima nas variaveis do objecto e retorna como resultado deste método e
                        // retorna o valor que está dentro do empate
    }

    public void setEmpates(int VeioDeFora) { // Esse método adiciona o valor na variável
        this.empates = VeioDeFora; // valor passado quando a função é chamada (o que esta dentro dos parenteses) 
                                // seja salva dentro da variavel do objeto
    }
// setEmpates(50); Este 50 é igual ao VeioDeFora
      
//public double calculoArea ()  {

    
  //  double base = 3.3;

  //  double altura = 4.0;

    //return base * altura;
//}

//public double calculoArea3 (int VDF1, int VDF2, int VDF3)  {

  //  return VDF1+VDF2+VDF3;
//}


//public void calculoArea2(){
    
    //double base = 3.3;

    //double altura = 4.0;
  //  System.out.println(base * altura);    
//} 








}


