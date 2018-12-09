package Interface;

public enum Direcao {
    CIMA(1), BAIXO(2), ESQUERDA(3), DIREITA(4);
    
    private final int valor;
    
   Direcao(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
