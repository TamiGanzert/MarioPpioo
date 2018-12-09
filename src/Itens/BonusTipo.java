package Itens;


public enum BonusTipo {
    MOEDA(1), FIREPLANT(2), INIMIGO(3), MARIO(4), PRINCESA(5), VAZIO(6);
    
    private final int valor;
    
    BonusTipo(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
