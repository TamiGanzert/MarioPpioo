package Itens;

public class Mario extends Item{
    private int quantidadeMoedas;
    private int quantidadeVidas;
    private boolean possuiPoderFogo;

    public Mario(Coordenada paramCoord, BonusTipo tipoBonus) {
        super(paramCoord, tipoBonus);
    }
    
    public void setPossuiPoderFogo(boolean poderFogo){
        this.possuiPoderFogo = poderFogo;
    }
    
    public boolean getResitenciaFogo(int poderFogo){
        return this.possuiPoderFogo;
    }
    
    public void setQuantidadeVidas(int qtdVidas){
        this.quantidadeVidas = qtdVidas;
    }
    
    public int getQuantidadeVidas(int qtdVidas){
        return this.quantidadeVidas;
    }
    
    public void setQuantidadeMoedas(int qtdMoedas){
        this.quantidadeMoedas = qtdMoedas;
    }
    
    public int getQuantidadeMoedas(int qtdMoedas){
        return this.quantidadeMoedas;
    }
}
