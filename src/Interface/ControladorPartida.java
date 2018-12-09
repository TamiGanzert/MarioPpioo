package Interface;

import Itens.BonusTipo;
import Itens.Boo;
import Itens.Coordenada;
import Itens.Goomba;
import Itens.Item;
import Itens.Mario;
import Itens.PiranhaPlant;
import Itens.PrincesaPeach;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ControladorPartida {
    private Mario mario;
    private Item [][]itens = new Item[10][10];
    private List<Coordenada> coordenadas =  new ArrayList<Coordenada>();
    
    public void PreencherMapa(){
        Random gerador = new Random();
        // 10 goombas, 7 piranhas plant, 5 boos
        //Mario inicia na posição 0,0
        //Princesa Peach está na posição 9,9
        
        
        GeraListaCoordenadas();
        
        itens[0][0] = new Mario(new Coordenada(0, 0), BonusTipo.MARIO);
        itens[9][9] = new PrincesaPeach(new Coordenada(9, 9), BonusTipo.PRINCESA);
        
        /*int controlaPosicao = 0;
        for(int y=0; y<98; y++){
            System.out.println(coordenadas.get(controlaPosicao).getX() +""+ coordenadas.get(controlaPosicao).getY());
            controlaPosicao++;
        }*/
        
        Collections.shuffle(coordenadas);
        
        for(int i=0; i < coordenadas.size(); i++){            
                                
            if(i <= 9){
                itens[coordenadas.get(i).getX()][coordenadas.get(i).getY()] = new Goomba(coordenadas.get(i), BonusTipo.INIMIGO);
            }
            else if(i>9 && i <= 16){
                itens[coordenadas.get(i).getX()][coordenadas.get(i).getY()] = new PiranhaPlant(coordenadas.get(i), BonusTipo.INIMIGO);
            }
            else if(i > 16 && i <= 21){
                itens[coordenadas.get(i).getX()][coordenadas.get(i).getY()] = new Boo(coordenadas.get(i), BonusTipo.INIMIGO);
            }
            else if(i> 21 && i <= 31){
                itens[coordenadas.get(i).getX()][coordenadas.get(i).getY()] = new Item(coordenadas.get(i), BonusTipo.FIREPLANT);
            }
            else if(i > 31 && i <= 61){
                itens[coordenadas.get(i).getX()][coordenadas.get(i).getY()] = new Item(coordenadas.get(i), BonusTipo.MOEDA);
            }
            else if(i > 61){
                itens[coordenadas.get(i).getX()][coordenadas.get(i).getY()] = new Item(coordenadas.get(i), BonusTipo.VAZIO);
            }
        }
        
        for(int h=0; h<10; h++){
            for(int v=0; v<10; v++){
                if(itens[h][v] != null)
                    System.out.print(itens[h][v].TipoBonus() + "\n");
            }            
        }
    }
    
    private void GeraListaCoordenadas(){
        for(int j=0; j<10; j++){
            for(int h=0; h<10; h++){
                if(((j==0) && (h==0)) || ((j==9) && (h==9))){
                    continue;
                }
                else{
                    coordenadas.add(new Coordenada(j, h));                    
                }
            }            
        }
    }
}
