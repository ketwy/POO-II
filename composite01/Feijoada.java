
/**
 * Write a description of class Cachaca here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Feijoada extends MenuComponent
{
    
    public Feijoada(){        
    }
    
    public String getName(){
        return "Feijoada";
    }
    
    public String getDescription(){
        return "Acompanha arroz, farofa e torresmo";
    }
    
    public double getPrice(){
        return 60;
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
