package Itens;

public class Boo extends Inimigo{

    public Boo(Coordenada paramCoord, BonusTipo tipoBonus) {
        super(paramCoord, tipoBonus);
    }
    public void BooDerrotaMario(){
        System.out.println("Boo matou Mario!");
    }
}
