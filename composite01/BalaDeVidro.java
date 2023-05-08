
/**
 * Write a description of class Cachaca here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BalaDeVidro extends MenuComponent
{
    
    public BalaDeVidro(){        
    }
    
    public String getName(){
        return "Bala De Vidro";
    }
    
    public String getDescription(){
        return "Crocante por fora e cheia de sabor por dentro";
    }
    
    public double getPrice(){
        return 4;
    }
    
    public boolean isVegetarian(){
        return false;
    }
    
    public String toString(){
        return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        
        System.out.print(", "+getPrice());
        System.out.print("     --  "+getDescription());
    }

}
