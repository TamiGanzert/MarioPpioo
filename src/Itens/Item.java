package Itens;

public class Item {
    protected Coordenada coordenadaItem;
    private BonusTipo bonus;
    
    public Item(Coordenada paramCoord, BonusTipo tipoBonus){
        this.bonus = tipoBonus;
        this.coordenadaItem = paramCoord;
    }
    
    public void setCoordInimigo(Coordenada paramCoord){
        this.coordenadaItem = paramCoord;
    }
    
    public Coordenada getCoordInimigo(){
        return this.coordenadaItem;
    }
    
    public void setBonus(BonusTipo tipoBonus){
        this.bonus = tipoBonus;
    }
    
    public BonusTipo getBonus(){
        return this.bonus;
    }
    
    public String TipoBonus(){
        return bonus.name();
    }
}
