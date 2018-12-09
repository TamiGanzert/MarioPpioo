package Itens;

public class Goomba extends Inimigo{    

    public Goomba(Coordenada paramCoord, BonusTipo tipoBonus) {
        super(paramCoord, tipoBonus);
    }
    public void GoombaDerrotaMario(){
        System.out.println("Goomba matou Mario!");
    }
}
