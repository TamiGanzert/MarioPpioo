package Interface;

public enum Acao {
    ANDAR(1), PULAR(2), DISPARAR(3);
    
    private final int valor;
    
    Acao(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
