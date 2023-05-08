
/**
 * Write a description of class Cachaca here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pudim extends MenuComponent
{
    
    public Pudim(){        
    }
    
    public String getName(){
        return "Pudim";
    }
    
    public String getDescription(){
        return "Macio, docinho e carrega o peso de ser a melhor sobremesa";
    }
    
    public double getPrice(){
        return 10;
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
