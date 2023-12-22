public class Usuario {
    private String nome;

    private double limeteDoCartao;

    private double limiteDisponivel;

    public Usuario(String nome, double limite){
        this.nome = nome;
        this.limeteDoCartao = limite;
        this.limiteDisponivel = limite;
    }

    public String getNome(){
        return this.nome;
    }

    public double getLimeteDoCartao(){
        return this.limeteDoCartao;
    }

    public double getLimiteDisponivel(){
        return this.limiteDisponivel;
    }

    protected double calculoSaldo(double compra){
        if (this.getLimiteDisponivel() >= compra){
            this.limiteDisponivel -= compra;
            return 1;
        }else{
            return 0;
        }
    }


}
