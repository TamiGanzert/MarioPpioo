package Itens;


public class Coordenada {
    private int x;
    private int y;
    private boolean usada;
    
    public Coordenada(int coordX, int coordY){
        this.x = coordX;
        this.y = coordY;
        this.usada = false;
    }
    
    public void setX(int paramX){
        this.x = paramX;
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setY(int paramY){
        this.y = paramY;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setUsada(boolean usada){
        this.usada = usada;
    }
    
    public boolean getUsada(){
        return this.usada;
    }
}
