package Itens;

public class Inimigo extends Item{
    protected int ResistenciaPulo;
    protected int ResistenciaFogo;    

    public Inimigo(Coordenada paramCoord, BonusTipo tipoBonus) {
        super(paramCoord, tipoBonus);
    }
    
    public void setResitenciaFogo(int resistFogo){
        this.ResistenciaFogo = resistFogo;
    }
    
    public int getResitenciaFogo(int resistFogo){
        return this.ResistenciaFogo;
    }
    
    public void setResitenciaPulo(int resistPulo){
        this.ResistenciaPulo = resistPulo;
    }
    
    public int getResitenciaPulo(int resistPulo){
        return this.ResistenciaPulo;
    }
    
    public int getResistenciaPulo(){
        return 0;
    }
    
    public int getResistenciaFogo(){
        return 0;
    }
}
