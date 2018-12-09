package Itens;

public class PiranhaPlant extends Inimigo{
    private int ResistenciaFogoAtual;

    public PiranhaPlant(Coordenada paramCoord, BonusTipo tipoBonus) {
        super(paramCoord, tipoBonus);
    }
    
    public void setResitenciaFogoAtual(int resistFogoAtual){
        this.ResistenciaFogoAtual = resistFogoAtual;
    }
    
    public int getResitenciaFogoAtual(int resistFogoAtual){
        return this.ResistenciaFogoAtual;
    }
    
    public void LancaChamas(){
        System.out.print("PiranhaPlant matou Mario!");
    }
}
