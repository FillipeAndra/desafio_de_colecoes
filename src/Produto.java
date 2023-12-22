
public class Produto implements Comparable<Produto>{

    private String nomeDoProduto;

    private double valorDoProduto;

    public Produto(String nome, double custo){
        this.nomeDoProduto = nome;
        this.valorDoProduto = custo;
    }

    public String getNomeDoProduto(){
        return this.nomeDoProduto;
    }

    public double getValorDoProduto(){
        return  this.valorDoProduto;
    }

    @Override
    public String toString(){
        return this.nomeDoProduto+" (R$ "+this.valorDoProduto+")";
    }

    @Override
    public int compareTo(Produto outro){
        if (this.valorDoProduto < outro.getValorDoProduto()){
            return -1;
        }else if(this.valorDoProduto > outro.getValorDoProduto()){
            return 1;
        }else{
            return 0;
        }

    }
}
